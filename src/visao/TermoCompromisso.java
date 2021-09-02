package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import java.awt.Scrollbar;
import java.awt.Choice;
import java.awt.TextArea;
import java.awt.ScrollPane;
import javax.swing.JProgressBar;

public class TermoCompromisso extends JPanel {
	private JTextField txtFieldIniEstagio;
	private JTextField txtFieldFimEstagio;
	private JTextField txtFieldChDiaria;
	private JTextField txtFieldChSemanal;
	private JTextField txtFieldHInicio;
	private JTextField txtFieldHoFim;
	private JTextField txtFieldAreaEstagio;
	private JTextField txtFieldVarBolsa;
	private JTextField txtFieldBeneficios;
	private JTextField txtFieldNomeAlunoTermo;
	private JTextField txtFieldCPFAlunoTermo;
	private JTextField txtFieldCursoAlunoTermo;
	private JTextField txtFieldNomeOriTermo;
	private JTextField txtFieldNomeUniversidadeTermo;
	private JTextField txtFieldRepreUniversidadeTermo;
	private JTextField txtFieldCNPJEmpresaTermo;
	private JTextField txtFieldRazaoSocialEmp;
	private JTextField txtFieldNomeRepEmpresaTermo;
	private JLabel labelIniEstagio;
	private JLabel labelFimEstagio;
	private JLabel labelChDiaria;
	private JLabel labelChSemanal;
	private JLabel labelHoInicio;
	private JLabel labelHoFim;
	private JLabel labelAreaEstagio;
	private JLabel labelVarBolsa;
	private JLabel labelBeneficios;
	private JLabel labelPrincAtividades;
	private JLabel labelNomeAlunoTermo;
	private JLabel labelCPFAlunoTermo;
	private JLabel labelCursoAlunoTermo;
	private JLabel labelNomeOriTermo;
	private JLabel labelNomeUniversidadeTermo;
	private JLabel labelRepreUniversidadeTermo;
	private JLabel labelCNPJEmpresaTermo;
	private JLabel labelRazaoSocialEmp;
	private JLabel labelNomeRepEmpresaTermo;
	private JLabel labelInfoCompTermo;
	private JButton buttonCadastrarTermo;
	private JButton ButtonConsultarTermo;
	private JButton buttonAtualizarTermo;
	private JButton buttonRemoverTermo;
	private JButton buttonLimparTermo;
	private JTextField txtFieldPrincAtividades;
	private JTextField txtFieldInfoCompTermo;
	
	
	public JLabel getLabelIniEstagio() {
		return labelIniEstagio;
	}

	public void setLabelIniEstagio(JLabel labelIniEstagio) {
		this.labelIniEstagio = labelIniEstagio;
	}

	public JLabel getLabelFimEstagio() {
		return labelFimEstagio;
	}

	public void setLabelFimEstagio(JLabel labelFimEstagio) {
		this.labelFimEstagio = labelFimEstagio;
	}

	public JLabel getLabelChDiaria() {
		return labelChDiaria;
	}

	public void setLabelChDiaria(JLabel labelChDiaria) {
		this.labelChDiaria = labelChDiaria;
	}

	public JLabel getLabelChSemanal() {
		return labelChSemanal;
	}

	public void setLabelChSemanal(JLabel labelChSemanal) {
		this.labelChSemanal = labelChSemanal;
	}

	public JLabel getLabelHoInicio() {
		return labelHoInicio;
	}

	public void setLabelHoInicio(JLabel labelHoInicio) {
		this.labelHoInicio = labelHoInicio;
	}

	public JLabel getLabelHoFim() {
		return labelHoFim;
	}

	public void setLabelHoFim(JLabel labelHoFim) {
		this.labelHoFim = labelHoFim;
	}

	public JLabel getLabelAreaEstagio() {
		return labelAreaEstagio;
	}

	public void setLabelAreaEstagio(JLabel labelAreaEstagio) {
		this.labelAreaEstagio = labelAreaEstagio;
	}

	public JLabel getLabelVarBolsa() {
		return labelVarBolsa;
	}

	public void setLabelVarBolsa(JLabel labelVarBolsa) {
		this.labelVarBolsa = labelVarBolsa;
	}

	public JLabel getLabelBeneficios() {
		return labelBeneficios;
	}

	public void setLabelBeneficios(JLabel labelBeneficios) {
		this.labelBeneficios = labelBeneficios;
	}

	public JLabel getLabelPrincAtividades() {
		return labelPrincAtividades;
	}

	public void setLabelPrincAtividades(JLabel labelPrincAtividades) {
		this.labelPrincAtividades = labelPrincAtividades;
	}

	public JLabel getLabelNomeAlunoTermo() {
		return labelNomeAlunoTermo;
	}

	public void setLabelNomeAlunoTermo(JLabel labelNomeAlunoTermo) {
		this.labelNomeAlunoTermo = labelNomeAlunoTermo;
	}

	public JLabel getLabelCPFAlunoTermo() {
		return labelCPFAlunoTermo;
	}

	public void setLabelCPFAlunoTermo(JLabel labelCPFAlunoTermo) {
		this.labelCPFAlunoTermo = labelCPFAlunoTermo;
	}

	public JLabel getLabelCursoAlunoTermo() {
		return labelCursoAlunoTermo;
	}

	public void setLabelCursoAlunoTermo(JLabel labelCursoAlunoTermo) {
		this.labelCursoAlunoTermo = labelCursoAlunoTermo;
	}

	public JLabel getLabelNomeOriTermo() {
		return labelNomeOriTermo;
	}

	public void setLabelNomeOriTermo(JLabel labelNomeOriTermo) {
		this.labelNomeOriTermo = labelNomeOriTermo;
	}

	public JLabel getLabelNomeUniversidadeTermo() {
		return labelNomeUniversidadeTermo;
	}

	public void setLabelNomeUniversidadeTermo(JLabel labelNomeUniversidadeTermo) {
		this.labelNomeUniversidadeTermo = labelNomeUniversidadeTermo;
	}

	public JLabel getLabelRepreUniversidadeTermo() {
		return labelRepreUniversidadeTermo;
	}

	public void setLabelRepreUniversidadeTermo(JLabel labelRepreUniversidadeTermo) {
		this.labelRepreUniversidadeTermo = labelRepreUniversidadeTermo;
	}

	public JLabel getLabelCNPJEmpresaTermo() {
		return labelCNPJEmpresaTermo;
	}

	public void setLabelCNPJEmpresaTermo(JLabel labelCNPJEmpresaTermo) {
		this.labelCNPJEmpresaTermo = labelCNPJEmpresaTermo;
	}

	public JLabel getLabelRazaoSocialEmp() {
		return labelRazaoSocialEmp;
	}

	public void setLabelRazaoSocialEmp(JLabel labelRazaoSocialEmp) {
		this.labelRazaoSocialEmp = labelRazaoSocialEmp;
	}

	public JLabel getLabelNomeRepEmpresaTermo() {
		return labelNomeRepEmpresaTermo;
	}

	public void setLabelNomeRepEmpresaTermo(JLabel labelNomeRepEmpresaTermo) {
		this.labelNomeRepEmpresaTermo = labelNomeRepEmpresaTermo;
	}

	public JLabel getLabelInfoCompTermo() {
		return labelInfoCompTermo;
	}

	public void setLabelInfoCompTermo(JLabel labelInfoCompTermo) {
		this.labelInfoCompTermo = labelInfoCompTermo;
	}

	public JButton getButtonCadastrarTermo() {
		return buttonCadastrarTermo;
	}

	public void setButtonCadastrarTermo(JButton buttonCadastrarTermo) {
		this.buttonCadastrarTermo = buttonCadastrarTermo;
	}

	public JButton getButtonConsultarTermo() {
		return ButtonConsultarTermo;
	}

	public void setButtonConsultarTermo(JButton buttonConsultarTermo) {
		ButtonConsultarTermo = buttonConsultarTermo;
	}

	public JButton getButtonAtualizarTermo() {
		return buttonAtualizarTermo;
	}

	public void setButtonAtualizarTermo(JButton buttonAtualizarTermo) {
		this.buttonAtualizarTermo = buttonAtualizarTermo;
	}

	public JButton getButtonRemoverTermo() {
		return buttonRemoverTermo;
	}

	public void setButtonRemoverTermo(JButton buttonRemoverTermo) {
		this.buttonRemoverTermo = buttonRemoverTermo;
	}

	public JButton getButtonLimparTermo() {
		return buttonLimparTermo;
	}

	public void setButtonLimparTermo(JButton buttonLimparTermo) {
		this.buttonLimparTermo = buttonLimparTermo;
	}

	public JTextField getTxtFieldPrincAtividades() {
		return txtFieldPrincAtividades;
	}

	public void setTxtFieldPrincAtividades(JTextField txtFieldPrincAtividades) {
		this.txtFieldPrincAtividades = txtFieldPrincAtividades;
	}

	public JTextField getTxtFieldInfoCompTermo() {
		return txtFieldInfoCompTermo;
	}

	public void setTxtFieldInfoCompTermo(JTextField txtFieldInfoCompTermo) {
		this.txtFieldInfoCompTermo = txtFieldInfoCompTermo;
	}

	/**
	 * Create the panel.
	 */
	public TermoCompromisso() {
		setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow]"));		
		JLabel labelTituloTermo = new JLabel("Termo de compromisso est\u00E1gio n\u00E3o obrigatorio");
		labelTituloTermo.setFont(new Font("Arial", Font.BOLD, 16));
		add(labelTituloTermo, "cell 0 0 4 1,alignx center");
		
		labelIniEstagio = new JLabel("Inicio do Estágio:");
		labelIniEstagio.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelIniEstagio, "flowx,cell 0 2 2 1");
		
		txtFieldIniEstagio = new JTextField();
		txtFieldIniEstagio.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldIniEstagio, "cell 0 2 2 1,growx");
		txtFieldIniEstagio.setColumns(10);
		
		labelFimEstagio = new JLabel("Fim do Estágio:");
		labelFimEstagio.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelFimEstagio, "flowx,cell 2 2 2 1");
		
		txtFieldFimEstagio = new JTextField();
		txtFieldFimEstagio.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldFimEstagio, "cell 2 2 2 1,growx");
		txtFieldFimEstagio.setColumns(10);
		
		labelChDiaria = new JLabel("CH. Diaria:");
		labelChDiaria.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelChDiaria, "flowx,cell 0 3 2 1");
		
		txtFieldChDiaria = new JTextField();
		txtFieldChDiaria.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldChDiaria, "cell 0 3 2 1,growx");
		txtFieldChDiaria.setColumns(10);
		
		labelChSemanal = new JLabel("CH. Semanal:");
		labelChSemanal.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelChSemanal, "flowx,cell 2 3 2 1");
		
		txtFieldChSemanal = new JTextField();
		txtFieldChSemanal.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldChSemanal, "cell 2 3 2 1,growx");
		txtFieldChSemanal.setColumns(10);
		
		labelHoInicio = new JLabel("Horário do Inicio:");
		labelHoInicio.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelHoInicio, "flowx,cell 0 4 2 1");
		
		txtFieldHInicio = new JTextField();
		txtFieldHInicio.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldHInicio, "cell 0 4 2 1,growx");
		txtFieldHInicio.setColumns(10);
		
		labelHoFim = new JLabel("Horário do Fim:");
		labelHoFim.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelHoFim, "flowx,cell 2 4 2 1");
		
		txtFieldHoFim = new JTextField();
		txtFieldHoFim.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldHoFim, "cell 2 4 2 1,growx");
		txtFieldHoFim.setColumns(10);
		
		labelAreaEstagio = new JLabel("Área do Estagio:");
		labelAreaEstagio.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelAreaEstagio, "flowx,cell 0 5 4 1");
		
		txtFieldAreaEstagio = new JTextField();
		txtFieldAreaEstagio.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldAreaEstagio, "cell 0 5 4 1,growx");
		txtFieldAreaEstagio.setColumns(10);
		
		labelVarBolsa = new JLabel("Valor da Bolsa: ");
		labelVarBolsa.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelVarBolsa, "flowx,cell 0 6 2 1");
		
		txtFieldVarBolsa = new JTextField();
		txtFieldVarBolsa.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldVarBolsa, "cell 0 6 2 1,growx");
		txtFieldVarBolsa.setColumns(10);
		
		labelBeneficios = new JLabel("Benef\u00EDcios:");
		labelBeneficios.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelBeneficios, "flowx,cell 2 6 2 1");
		
		txtFieldBeneficios = new JTextField();
		txtFieldBeneficios.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldBeneficios, "cell 2 6 2 1,growx");
		txtFieldBeneficios.setColumns(10);
		
		labelPrincAtividades = new JLabel("Principais Atividades:");
		labelPrincAtividades.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelPrincAtividades, "flowx,cell 0 7 4 1");
		
		labelNomeAlunoTermo = new JLabel("Nome do Aluno:");
		labelNomeAlunoTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelNomeAlunoTermo, "flowx,cell 0 8 4 1");
		
		txtFieldNomeAlunoTermo = new JTextField();
		txtFieldNomeAlunoTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldNomeAlunoTermo, "cell 0 8 4 1,growx");
		txtFieldNomeAlunoTermo.setColumns(10);
		
		labelCPFAlunoTermo = new JLabel("CPF do Aluno:");
		labelCPFAlunoTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelCPFAlunoTermo, "flowx,cell 0 9 2 1");
		
		txtFieldCPFAlunoTermo = new JTextField();
		txtFieldCPFAlunoTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldCPFAlunoTermo, "cell 0 9 2 1,growx");
		txtFieldCPFAlunoTermo.setColumns(10);
		
		labelCursoAlunoTermo = new JLabel("Curso do Aluno:");
		labelCursoAlunoTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelCursoAlunoTermo, "flowx,cell 2 9 2 1");
		
		txtFieldCursoAlunoTermo = new JTextField();
		txtFieldCursoAlunoTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldCursoAlunoTermo, "cell 2 9 2 1,growx");
		txtFieldCursoAlunoTermo.setColumns(10);
		
		labelNomeOriTermo = new JLabel("Nome do Orientador:");
		labelNomeOriTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelNomeOriTermo, "flowx,cell 0 10 4 1");
		
		txtFieldNomeOriTermo = new JTextField();
		txtFieldNomeOriTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldNomeOriTermo, "cell 0 10 4 1,growx");
		txtFieldNomeOriTermo.setColumns(10);
		
		labelNomeUniversidadeTermo = new JLabel("Nome da Universidade:");
		labelNomeUniversidadeTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelNomeUniversidadeTermo, "flowx,cell 0 11 4 1");
		
		txtFieldNomeUniversidadeTermo = new JTextField();
		txtFieldNomeUniversidadeTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldNomeUniversidadeTermo, "cell 0 11 4 1,growx");
		txtFieldNomeUniversidadeTermo.setColumns(10);
		
		labelRepreUniversidadeTermo = new JLabel("Representante da Universidade:");
		labelRepreUniversidadeTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelRepreUniversidadeTermo, "flowx,cell 0 12 4 1");
		
		txtFieldRepreUniversidadeTermo = new JTextField();
		txtFieldRepreUniversidadeTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldRepreUniversidadeTermo, "cell 0 12 4 1,growx");
		txtFieldRepreUniversidadeTermo.setColumns(10);
		
		labelCNPJEmpresaTermo = new JLabel("CNPJ da Empresa:");
		labelCNPJEmpresaTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelCNPJEmpresaTermo, "flowx,cell 0 13 4 1");
		
		txtFieldCNPJEmpresaTermo = new JTextField();
		txtFieldCNPJEmpresaTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldCNPJEmpresaTermo, "cell 0 13 4 1,growx");
		txtFieldCNPJEmpresaTermo.setColumns(10);
		
		labelRazaoSocialEmp = new JLabel("Razão Social Empresa:");
		labelRazaoSocialEmp.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelRazaoSocialEmp, "flowx,cell 0 14 4 1");
		
		txtFieldRazaoSocialEmp = new JTextField();
		txtFieldRazaoSocialEmp.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldRazaoSocialEmp, "cell 0 14 4 1,growx");
		txtFieldRazaoSocialEmp.setColumns(10);
		
		labelNomeRepEmpresaTermo = new JLabel("Representante da Empresa:");
		labelNomeRepEmpresaTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelNomeRepEmpresaTermo, "flowx,cell 0 15 4 1");
		
		txtFieldNomeRepEmpresaTermo = new JTextField();
		txtFieldNomeRepEmpresaTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldNomeRepEmpresaTermo, "cell 0 15 4 1,growx");
		txtFieldNomeRepEmpresaTermo.setColumns(10);
		
		labelInfoCompTermo = new JLabel("Informações Complementares:");
		labelInfoCompTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(labelInfoCompTermo, "flowx,cell 0 16 4 1");
		
		buttonCadastrarTermo = new JButton("Cadastrar");
		buttonCadastrarTermo.setIcon(new ImageIcon(TermoCompromisso.class.getResource("/Figuras/ok1.png")));
		buttonCadastrarTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(buttonCadastrarTermo, "cell 0 19,grow");
		
		ButtonConsultarTermo = new JButton("Consultar");
		ButtonConsultarTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		ButtonConsultarTermo.setIcon(new ImageIcon(TermoCompromisso.class.getResource("/Figuras/pesquisa.png")));
		add(ButtonConsultarTermo, "cell 1 19,grow");
		
		buttonAtualizarTermo = new JButton("Atualizar");
		buttonAtualizarTermo.setIcon(new ImageIcon(TermoCompromisso.class.getResource("/Figuras/alterar.png")));
		buttonAtualizarTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(buttonAtualizarTermo, "cell 0 20,grow");
		
		buttonRemoverTermo = new JButton("Remover");
		buttonRemoverTermo.setIcon(new ImageIcon(TermoCompromisso.class.getResource("/Figuras/remover-banco-de-dados.png")));
		buttonRemoverTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(buttonRemoverTermo, "cell 1 20,grow");
		
		buttonLimparTermo = new JButton("Limpar");
		buttonLimparTermo.setIcon(new ImageIcon(TermoCompromisso.class.getResource("/Figuras/clean.png")));
		buttonLimparTermo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(buttonLimparTermo, "cell 3 20,grow");
		
		txtFieldPrincAtividades = new JTextField();
		txtFieldPrincAtividades.setFont(new Font("Arial", Font.PLAIN, 11));
		add(txtFieldPrincAtividades, "cell 0 7 4 1,grow");
		txtFieldPrincAtividades.setColumns(10);
		
		txtFieldInfoCompTermo = new JTextField();
		add(txtFieldInfoCompTermo, "cell 0 16,grow");
		txtFieldInfoCompTermo.setColumns(10);
		
		
		
	}

	public JTextField getTxtFieldIniEstagio() {
		return txtFieldIniEstagio;
	}

	public void setTxtFieldIniEstagio(JTextField txtFieldIniEstagio) {
		this.txtFieldIniEstagio = txtFieldIniEstagio;
	}

	public JTextField getTxtFieldFimEstagio() {
		return txtFieldFimEstagio;
	}

	public void setTxtFieldFimEstagio(JTextField txtFieldFimEstagio) {
		this.txtFieldFimEstagio = txtFieldFimEstagio;
	}

	public JTextField getTxtFieldChDiaria() {
		return txtFieldChDiaria;
	}

	public void setTxtFieldChDiaria(JTextField txtFieldChDiaria) {
		this.txtFieldChDiaria = txtFieldChDiaria;
	}

	public JTextField getTxtFieldChSemanal() {
		return txtFieldChSemanal;
	}

	public void setTxtFieldChSemanal(JTextField txtFieldChSemanal) {
		this.txtFieldChSemanal = txtFieldChSemanal;
	}

	public JTextField getTxtFieldHInicio() {
		return txtFieldHInicio;
	}

	public void setTxtFieldHInicio(JTextField txtFieldHInicio) {
		this.txtFieldHInicio = txtFieldHInicio;
	}

	public JTextField getTxtFieldHoFim() {
		return txtFieldHoFim;
	}

	public void setTxtFieldHoFim(JTextField txtFieldHoFim) {
		this.txtFieldHoFim = txtFieldHoFim;
	}

	public JTextField getTxtFieldAreaEstagio() {
		return txtFieldAreaEstagio;
	}

	public void setTxtFieldAreaEstagio(JTextField txtFieldAreaEstagio) {
		this.txtFieldAreaEstagio = txtFieldAreaEstagio;
	}

	public JTextField getTxtFieldVarBolsa() {
		return txtFieldVarBolsa;
	}

	public void setTxtFieldVarBolsa(JTextField txtFieldVarBolsa) {
		this.txtFieldVarBolsa = txtFieldVarBolsa;
	}

	public JTextField getTxtFieldBeneficios() {
		return txtFieldBeneficios;
	}

	public void setTxtFieldBeneficios(JTextField txtFieldBeneficios) {
		this.txtFieldBeneficios = txtFieldBeneficios;
	}

	public JTextField getTxtFieldNomeAlunoTermo() {
		return txtFieldNomeAlunoTermo;
	}

	public void setTxtFieldNomeAlunoTermo(JTextField txtFieldNomeAlunoTermo) {
		this.txtFieldNomeAlunoTermo = txtFieldNomeAlunoTermo;
	}

	public JTextField getTxtFieldCPFAlunoTermo() {
		return txtFieldCPFAlunoTermo;
	}

	public void setTxtFieldCPFAlunoTermo(JTextField txtFieldCPFAlunoTermo) {
		this.txtFieldCPFAlunoTermo = txtFieldCPFAlunoTermo;
	}

	public JTextField getTxtFieldCursoAlunoTermo() {
		return txtFieldCursoAlunoTermo;
	}

	public void setTxtFieldCursoAlunoTermo(JTextField txtFieldCursoAlunoTermo) {
		this.txtFieldCursoAlunoTermo = txtFieldCursoAlunoTermo;
	}

	public JTextField getTxtFieldNomeOriTermo() {
		return txtFieldNomeOriTermo;
	}

	public void setTxtFieldNomeOriTermo(JTextField txtFieldNomeOriTermo) {
		this.txtFieldNomeOriTermo = txtFieldNomeOriTermo;
	}

	public JTextField getTxtFieldNomeUniversidadeTermo() {
		return txtFieldNomeUniversidadeTermo;
	}

	public void setTxtFieldNomeUniversidadeTermo(JTextField txtFieldNomeUniversidadeTermo) {
		this.txtFieldNomeUniversidadeTermo = txtFieldNomeUniversidadeTermo;
	}

	public JTextField getTxtFieldRepreUniversidadeTermo() {
		return txtFieldRepreUniversidadeTermo;
	}

	public void setTxtFieldRepreUniversidadeTermo(JTextField txtFieldRepreUniversidadeTermo) {
		this.txtFieldRepreUniversidadeTermo = txtFieldRepreUniversidadeTermo;
	}

	public JTextField getTxtFieldCNPJEmpresaTermo() {
		return txtFieldCNPJEmpresaTermo;
	}

	public void setTxtFieldCNPJEmpresaTermo(JTextField txtFieldCNPJEmpresaTermo) {
		this.txtFieldCNPJEmpresaTermo = txtFieldCNPJEmpresaTermo;
	}

	public JTextField getTxtFieldRazaoSocialEmp() {
		return txtFieldRazaoSocialEmp;
	}

	public void setTxtFieldRazaoSocialEmp(JTextField txtFieldRazaoSocialEmp) {
		this.txtFieldRazaoSocialEmp = txtFieldRazaoSocialEmp;
	}

	public JTextField getTxtFieldNomeRepEmpresaTermo() {
		return txtFieldNomeRepEmpresaTermo;
	}

	public void setTxtFieldNomeRepEmpresaTermo(JTextField txtFieldNomeRepEmpresaTermo) {
		this.txtFieldNomeRepEmpresaTermo = txtFieldNomeRepEmpresaTermo;
	}
		
	
}
