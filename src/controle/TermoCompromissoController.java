package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import dao.ConcedenteDAO;
import dao.CursoDAO;
import dao.EstagiarioDAO;
import dao.TermoCompromissoDAO;
import dao.UsuarioDAO;
import exceptions.DataBaseException;
import modelo.Concedente;
import modelo.Curso;
import modelo.Estagiario;
import modelo.TermoCompromisso;
import sun.java2d.marlin.stats.Histogram;
import sun.text.resources.cldr.FormatData;
import visao.JanelaPrincipal;

public class TermoCompromissoController implements ActionListener, KeyListener {

	private JanelaPrincipal janelaPrincipal;
	private Estagiario estagiario = new Estagiario();
	private Curso curso = new Curso();
	private Concedente concedente = new Concedente();

	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	private ConcedenteDAO concendenteDAO = new ConcedenteDAO();
	private EstagiarioDAO estagiarioDAO = new EstagiarioDAO();
	private CursoDAO cursoDAO = new CursoDAO();
	private TermoCompromissoDAO termoCompromissoDAO = new TermoCompromissoDAO();

	public TermoCompromissoController(JanelaPrincipal janelaPrincipal, Estagiario estagiario, Curso curso,
			Concedente concedente) {
		super();
		this.janelaPrincipal = janelaPrincipal;
		this.estagiario = estagiario;
		this.curso = curso;
		this.concedente = concedente;

		this.janelaPrincipal.getTelaTermoCompromisso().getButtonCadastrarTermo().addActionListener(this);
		this.janelaPrincipal.getTelaTermoCompromisso().getButtonConsultarTermo().addActionListener(this);
		this.janelaPrincipal.getTelaTermoCompromisso().getButtonLimparTermo().addActionListener(this);

		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCPFAlunoTermo().addKeyListener(this);

		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeAlunoTermo().setEnabled(false);
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCursoAlunoTermo().setEnabled(false);
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeOriTermo().setEnabled(false);
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeUniversidadeTermo().setEnabled(false);
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldRepreUniversidadeTermo().setEnabled(false);

		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCNPJEmpresaTermo().addKeyListener(this);

		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldRazaoSocialEmp().setEnabled(false);
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeRepEmpresaTermo().setEnabled(false);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equals("Cadastrar")) {
			if (!validar()) {
				showMessageError("O termo de compromisso não pode ser cadastrado com campos em branco.");
			} else {
				Integer chDiaria = Integer
						.parseInt(this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldChDiaria().getText());
				if (chDiaria <= 6) {
					Integer chSemanal = Integer
							.parseInt(this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldChSemanal().getText());
					if (chSemanal <= 30) {

						Time inicioAtividades = formatTime(
								this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldHInicio().getText());
						Time fimAtividades = formatTime(
								this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldHoFim().getText());

						TermoCompromisso termoCompromisso = new TermoCompromisso();

						Date inicioEstagio = formatData(
								this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldIniEstagio().getText());
						Date fimEstagioDate = formatData(
								this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldFimEstagio().getText());

						try {
							String codigoCurso = cursoDAO.getCodCursoByCursoName(this.janelaPrincipal
									.getTelaTermoCompromisso().getTxtFieldCursoAlunoTermo().getText()).get();

							termoCompromisso = build(inicioEstagio, fimEstagioDate,
									Integer.parseInt(this.janelaPrincipal.getTelaTermoCompromisso()
											.getTxtFieldChDiaria().getText()),
									Integer.parseInt(this.janelaPrincipal.getTelaTermoCompromisso()
											.getTxtFieldChSemanal().getText()),
									this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldAreaEstagio().getText(),
									inicioAtividades, fimAtividades,
									this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldPrincAtividades()
											.getText(),
									Double.parseDouble(this.janelaPrincipal.getTelaTermoCompromisso()
											.getTxtFieldVarBolsa().getText()),
									Double.parseDouble(this.janelaPrincipal.getTelaTermoCompromisso()
											.getTxtFieldBeneficios().getText()),
									this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCPFAlunoTermo().getText(),
									codigoCurso,
									this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCNPJEmpresaTermo()
											.getText(),
									this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldInfoCompTermo()
											.getText());

							termoCompromissoDAO.cadastrarTermoCompromisso(termoCompromisso);
							showMessageSuccess("Cadastrado com sucesso!");
						} catch (SQLException sqlException) {
							throw new DataBaseException("Erro ao cadastrar esse termo de compromisso", sqlException);
						}
					} else {
						this.showMessageError("Carga horária semanal não pode exceder 30hrs");
					}
				} else {
					this.showMessageError("Carga horária diária não pode exceder 6hrs");
				}
			}
		} else if (arg0.getActionCommand().equals("Limpar"))

		{
			this.limparTela();
		} else if (arg0.getActionCommand().equals("Consultar")) {

			String cpf = this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCPFAlunoTermo().getText();
			try {
				if ((termoCompromissoDAO.getByCpfAluno(cpf).isPresent())
						&& (cursoDAO.consultaPorCpfAluno(cpf).isPresent())) {
					TermoCompromisso termoCompromisso = termoCompromissoDAO.getByCpfAluno(cpf).get();
					Curso curso = cursoDAO.consultaPorCpfAluno(cpf).get();
					if (estagiarioDAO.consultaPorCpf(cpf).isPresent()) {
						Estagiario estagiario = estagiarioDAO.consultaPorCpf(cpf).get();

						if ((concendenteDAO.consultaPorCNPJ(termoCompromisso.getCnpjEmpresa()).isPresent())) {
							Concedente concedente = concendenteDAO.consultaPorCNPJ(termoCompromisso.getCnpjEmpresa())
									.get();
							populateScreen(termoCompromisso, estagiario, concedente, curso);
							this.janelaPrincipal.getTelaTermoCompromisso().getButtonCadastrarTermo().setEnabled(false);
						}

					}
				} else {
					showMessageError("Não há nenhum termo de compromisso vinculado a esse aluno");
				}

			} catch (SQLException e) {
				throw new DataBaseException("Erro ao consultar", e);
			}
		}

	}

	@Override
	public void keyPressed(KeyEvent arg0) {

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if (arg0.getSource() == this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCPFAlunoTermo()
				& arg0.getKeyCode() == KeyEvent.VK_ENTER) {

			String cpf = this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCPFAlunoTermo().getText();

			try {
				if (estagiarioDAO.consultaPorCpf(cpf).isPresent()) {
					estagiario = estagiarioDAO.consultaPorCpf(cpf).get();

					this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeAlunoTermo()
							.setText(estagiario.getNome());

					if (cursoDAO.consultaPorCpfAluno(cpf).isPresent()) {
						curso = cursoDAO.consultaPorCpfAluno(cpf).get();

						this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCursoAlunoTermo()
								.setText(curso.getNomeCurso());
						this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeOriTermo()
								.setText(curso.getRepreCoordenacao());
						this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeUniversidadeTermo()
								.setText(curso.getNomeUniversidade());
						this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldRepreUniversidadeTermo()
								.setText(curso.getRepreUniversidade());
					}

				} else {
					this.showMessageError("Este aluno não existe. CPF nao encontrado");
				}
			} catch (SQLException e) {
				throw new DataBaseException("Erro ao consultar", e);
			}

		} else if (arg0.getSource() == this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCNPJEmpresaTermo()
				& arg0.getKeyCode() == KeyEvent.VK_ENTER) {

			String cnpj = this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCNPJEmpresaTermo().getText();
			try {
				if (concendenteDAO.consultaPorCNPJ(cnpj).isPresent()) {
					concedente = concendenteDAO.consultaPorCNPJ(cnpj).get();

					this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCNPJEmpresaTermo()
							.setText(concedente.getCnpj());
					this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldRazaoSocialEmp()
							.setText(concedente.getRazaoSocial());
					this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeRepEmpresaTermo()
							.setText(concedente.getNomeRepre());

				} else {
					this.showMessageError("Esta empresa não existe. CNPJ não encontrado.");
				}
			} catch (SQLException e) {
				throw new DataBaseException("Erro ao consultar", e);

			}
		}

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void showMessageError(String message) {
		final ImageIcon icon = new ImageIcon(getClass().getResource("/figuras/error.jpeg"));
		JOptionPane.showMessageDialog(janelaPrincipal, message, "ProcuraDados", JOptionPane.NO_OPTION, icon);
		janelaPrincipal.getTelaLogin().limparCamposTela();
		janelaPrincipal.getCardLayout().show(janelaPrincipal.getContentPane(), "principal");
	}

	public void showMessageSuccess(String message) {
		final ImageIcon icon = new ImageIcon(getClass().getResource("/figuras/ok-48.png"));
		JOptionPane.showMessageDialog(janelaPrincipal, message, "ProcuraDados", JOptionPane.NO_OPTION, icon);
		janelaPrincipal.getTelaLogin().limparCamposTela();
		janelaPrincipal.getCardLayout().show(janelaPrincipal.getContentPane(), "principal");
	}

	public void limparTela() {

		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldAreaEstagio().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldBeneficios().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldChDiaria().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldChSemanal().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCNPJEmpresaTermo().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCPFAlunoTermo().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCursoAlunoTermo().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldFimEstagio().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldHInicio().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldHoFim().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldInfoCompTermo().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldIniEstagio().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeAlunoTermo().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeOriTermo().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeRepEmpresaTermo().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeUniversidadeTermo().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldPrincAtividades().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldRazaoSocialEmp().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldRepreUniversidadeTermo().setText("");
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldVarBolsa().setText("");

	}

	public boolean validar() {
		if ((this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldAreaEstagio().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldBeneficios().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldChDiaria().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldChSemanal().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCNPJEmpresaTermo().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCPFAlunoTermo().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCursoAlunoTermo().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldFimEstagio().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldHInicio().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldHoFim().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldInfoCompTermo().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldIniEstagio().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeAlunoTermo().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeOriTermo().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeRepEmpresaTermo().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeUniversidadeTermo().getText()
						.isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldPrincAtividades().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldRazaoSocialEmp().getText().isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldRepreUniversidadeTermo().getText()
						.isEmpty())
				|| (this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldVarBolsa().getText().isEmpty())) {
			return false;
		} else {
			return true;
		}

	}

	public TermoCompromisso build(Date inicioEstagio, Date fimEstagio, Integer chDiaria, Integer chSemanal,
			String areaEstagio, Time inicioAtividades, Time fimAtividades, String atividades, Double valorBolsa,
			Double beneficios, String cpfAluno, String codCurso, String cnpjEmpresa, String infoComplementar) {

		return new TermoCompromisso(inicioEstagio, fimEstagio, chDiaria, chSemanal, areaEstagio, inicioAtividades,
				fimAtividades, atividades, valorBolsa, beneficios, cpfAluno, codCurso, cnpjEmpresa, infoComplementar);

	}

	public void populateScreen(TermoCompromisso termoCompromisso, Estagiario estagiario, Concedente concedente,
			Curso curso) {
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldAreaEstagio()
				.setText(termoCompromisso.getAreaEstagio());
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldBeneficios()
				.setText(String.valueOf(termoCompromisso.getBeneficios()));
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldChDiaria()
				.setText(String.valueOf(termoCompromisso.getChDiaria()));
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldChSemanal()
				.setText(String.valueOf(termoCompromisso.getChSemanal()));
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCNPJEmpresaTermo()
				.setText(termoCompromisso.getCnpjEmpresa());
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCPFAlunoTermo()
				.setText(termoCompromisso.getCpfAluno());
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldCursoAlunoTermo()
				.setText(termoCompromisso.getCodCurso());
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldFimEstagio()
				.setText(String.valueOf(termoCompromisso.getFimEstagio()));
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldHInicio()
				.setText(String.valueOf(termoCompromisso.getInicioAtividades()));
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldHoFim()
				.setText(String.valueOf(termoCompromisso.getFimAtividades()));
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldInfoCompTermo()
				.setText(termoCompromisso.getInfoComplementar());
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldIniEstagio()
				.setText(String.valueOf(termoCompromisso.getInicioEstagio()));
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeAlunoTermo().setText(estagiario.getNome());
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeOriTermo().setText(curso.getRepreCoordenacao());
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeRepEmpresaTermo()
				.setText(concedente.getNomeRepre());
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldNomeUniversidadeTermo()
				.setText(curso.getNomeUniversidade());
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldPrincAtividades()
				.setText(termoCompromisso.getAtividades());
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldRazaoSocialEmp().setText(concedente.getRazaoSocial());
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldRepreUniversidadeTermo()
				.setText(curso.getRepreUniversidade());
		this.janelaPrincipal.getTelaTermoCompromisso().getTxtFieldVarBolsa()
				.setText(String.valueOf(termoCompromisso.getValorBolsa()));
	}

	public Date formatData(String data) { // REVER ESSE MÉTODO POIS ESTÁ SALVANDO ESTRANHO NO BANCO

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy"); // New Pattern
		try {
			java.util.Date date = sdf1.parse(data); // Returns a Date format object with the pattern
			java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
			return sqlStartDate;
		} catch (ParseException parseException) {
			parseException.printStackTrace();
		}
		return null;
	}

	public Time formatTime(String time) {

		Time hora;

		DateFormat formato = new SimpleDateFormat("HH:mm:ss");
		try {
			hora = new java.sql.Time(formato.parse(time).getTime());
			return hora;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

	}
}