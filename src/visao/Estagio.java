package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Estagio extends JPanel {
	private JTextField textFieldnome;
	private JTextField textField_cpf;
	private JTextField textField_nascimento;
	private JTextField textField_residencial;
	private JTextField textField_celular;
	private JTextField textField_endereco;
	private JTextField textField_numero;
	private JTextField textField_complemento;
	private JTextField textField_bairro;
	private JTextField textField_cidade;
	private JTextField textField_estado;
	private JTextField textField_cep;
	private JTextField textField_curso;
	private JTextField textField_datainicio;

	/**
	 * Create the panel.
	 */
	public Estagio() {
		setToolTipText("Dados do Estagiario");
		setLayout(new MigLayout("", "[122][122][122][122][122]", "[][][][][][][][][][][][]"));
		
		JLabel lblTituloDadosdoEstagiario = new JLabel("Dados do Estagi\u00E1rio");
		lblTituloDadosdoEstagiario.setFont(new Font("Arial", Font.BOLD, 16));
		add(lblTituloDadosdoEstagiario, "cell 0 0 5 1,alignx center");
		
		JLabel lblnome = new JLabel("NOME:");
		lblnome.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblnome, "flowx,cell 0 2 3 1");
		
		JLabel lblcpf = new JLabel("CPF:");
		lblcpf.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcpf, "flowx,cell 3 2 2 1");
		
		textField_cpf = new JTextField();
		textField_cpf.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_cpf, "cell 3 2 2 1,grow");
		textField_cpf.setColumns(10);
		
		JLabel lblnascimento = new JLabel("DATA DE NASCIMENTO:");
		lblnascimento.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblnascimento, "flowx,cell 0 3 3 1");
		
		JLabel lblsexo = new JLabel("SEXO:");
		lblsexo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblsexo, "flowx,cell 3 3 2 1,alignx center");
		
		JRadioButton rdbtnmasculino = new JRadioButton("Masculino");
		rdbtnmasculino.setFont(new Font("Arial", Font.PLAIN, 11));
		add(rdbtnmasculino, "cell 3 3 2 1");
		
		JRadioButton rdbtnfeminino = new JRadioButton("Feminino");
		rdbtnfeminino.setFont(new Font("Arial", Font.PLAIN, 11));
		add(rdbtnfeminino, "cell 3 3 2 1");
		
		JLabel lbltel_resid = new JLabel("TELEFONE RESIDENCIAL:");
		lbltel_resid.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lbltel_resid, "flowx,cell 0 4 3 1");
		
		JLabel lblcelular = new JLabel("TELEFONE CELULAR:");
		lblcelular.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcelular, "flowx,cell 3 4 2 1");
		
		JLabel lblendereco = new JLabel("ENDERE\u00C7O: ");
		lblendereco.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblendereco, "flowx,cell 0 5 5 1");
		
		textField_endereco = new JTextField();
		textField_endereco.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_endereco, "cell 0 5 5 1,grow");
		textField_endereco.setColumns(10);
		
		JLabel lblnumero = new JLabel("NÚMERO:");
		lblnumero.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblnumero, "flowx,cell 0 6");
		
		textField_numero = new JTextField();
		textField_numero.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_numero, "cell 0 6,growx");
		textField_numero.setColumns(10);
		
		JLabel lblcomplemento = new JLabel("COMPLEMENTO:");
		lblcomplemento.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcomplemento, "flowx,cell 1 6 2 1");
		
		textFieldnome = new JTextField();
		textFieldnome.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textFieldnome, "cell 0 2 3 1,growx");
		textFieldnome.setColumns(10);
		
		textField_complemento = new JTextField();
		add(textField_complemento, "cell 1 6 2 1,grow");
		textField_complemento.setColumns(10);
		
		textField_nascimento = new JTextField();
		textField_nascimento.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_nascimento, "cell 0 3 3 1,grow");
		textField_nascimento.setColumns(10);
		
		textField_celular = new JTextField();
		textField_celular.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_celular, "cell 3 4 2 1,grow");
		textField_celular.setColumns(10);
		
		textField_residencial = new JTextField();
		textField_residencial.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_residencial, "cell 0 4 3 1,growx");
		textField_residencial.setColumns(10);
		
		JLabel lbl_bairro = new JLabel("BAIRRO:");
		lbl_bairro.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lbl_bairro, "flowx,cell 3 6 2 1");
		
		textField_bairro = new JTextField();
		textField_bairro.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_bairro, "cell 3 6 2 1,growx");
		textField_bairro.setColumns(10);
		
		JLabel lblcidade = new JLabel("CIDADE:");
		lblcidade.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcidade, "flowx,cell 0 7 2 1");
		
		textField_cidade = new JTextField();
		textField_cidade.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_cidade, "cell 0 7 2 1,grow");
		textField_cidade.setColumns(10);
		
		JLabel lblestado = new JLabel("ESTADO:");
		lblestado.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblestado, "flowx,cell 2 7 2 1");
		
		textField_estado = new JTextField();
		textField_estado.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_estado, "cell 2 7,grow");
		textField_estado.setColumns(10);
		
		JLabel lblcep = new JLabel("CEP:");
		lblcep.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcep, "flowx,cell 4 7");
		
		textField_cep = new JTextField();
		textField_cep.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_cep, "cell 4 7,grow");
		textField_cep.setColumns(10);
		
		JLabel lbl_curso = new JLabel("CURSO:");
		lbl_curso.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lbl_curso, "flowx,cell 0 8 3 1");
		
		textField_curso = new JTextField();
		textField_curso.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_curso, "cell 0 8,grow");
		textField_curso.setColumns(10);
		
		JLabel lbldata_inicio = new JLabel("DATA INGRESSO:");
		lbldata_inicio.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lbldata_inicio, "flowx,cell 3 8 2 1");
		
		textField_datainicio = new JTextField();
		textField_datainicio.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_datainicio, "cell 3 8,grow");
		textField_datainicio.setColumns(10);
		
		JButton btncadastrar = new JButton("CADASTRAR");
		btncadastrar.setIcon(new ImageIcon(Estagio.class.getResource("/Figuras/ok1.png")));
		btncadastrar.setFont(new Font("Arial", Font.BOLD, 11));
		add(btncadastrar, "cell 0 11,growx");
		
		JButton btnconsultar = new JButton("CONSULTAR");
		btnconsultar.setIcon(new ImageIcon(Estagio.class.getResource("/Figuras/pesquisa.png")));
		btnconsultar.setFont(new Font("Arial", Font.BOLD, 11));
		add(btnconsultar, "cell 1 11,growx");
		
		JButton btnatualizar = new JButton("ATUALIZAR");
		btnatualizar.setIcon(new ImageIcon(Estagio.class.getResource("/Figuras/alterar.png")));
		btnatualizar.setFont(new Font("Arial", Font.BOLD, 11));
		add(btnatualizar, "cell 2 11,growx");
		
		JButton btnremover = new JButton("REMOVER");
		btnremover.setIcon(new ImageIcon(Estagio.class.getResource("/Figuras/remover-banco-de-dados.png")));
		btnremover.setFont(new Font("Arial", Font.BOLD, 11));
		add(btnremover, "cell 3 11,growx");
		
		JButton btnlimpar = new JButton("LIMPAR TELA");
		btnlimpar.setIcon(new ImageIcon(Estagio.class.getResource("/Figuras/clean.png")));
		btnlimpar.setFont(new Font("Arial", Font.BOLD, 11));
		add(btnlimpar, "cell 4 11,growx");

	}

	public JTextField getTextFieldnome() {
		return textFieldnome;
	}

	public void setTextFieldnome(JTextField textFieldnome) {
		this.textFieldnome = textFieldnome;
	}

	public JTextField getTextField_cpf() {
		return textField_cpf;
	}

	public void setTextField_cpf(JTextField textField_cpf) {
		this.textField_cpf = textField_cpf;
	}

	public JTextField getTextField_nascimento() {
		return textField_nascimento;
	}

	public void setTextField_nascimento(JTextField textField_nascimento) {
		this.textField_nascimento = textField_nascimento;
	}

	public JTextField getTextField_residencial() {
		return textField_residencial;
	}

	public void setTextField_residencial(JTextField textField_residencial) {
		this.textField_residencial = textField_residencial;
	}

	public JTextField getTextField_celular() {
		return textField_celular;
	}

	public void setTextField_celular(JTextField textField_celular) {
		this.textField_celular = textField_celular;
	}

	public JTextField getTextField_endereco() {
		return textField_endereco;
	}

	public void setTextField_endereco(JTextField textField_endereco) {
		this.textField_endereco = textField_endereco;
	}

	public JTextField getTextField_numero() {
		return textField_numero;
	}

	public void setTextField_numero(JTextField textField_numero) {
		this.textField_numero = textField_numero;
	}

	public JTextField getTextField_complemento() {
		return textField_complemento;
	}

	public void setTextField_complemento(JTextField textField_complemento) {
		this.textField_complemento = textField_complemento;
	}

	public JTextField getTextField_bairro() {
		return textField_bairro;
	}

	public void setTextField_bairro(JTextField textField_bairro) {
		this.textField_bairro = textField_bairro;
	}

	public JTextField getTextField_cidade() {
		return textField_cidade;
	}

	public void setTextField_cidade(JTextField textField_cidade) {
		this.textField_cidade = textField_cidade;
	}

	public JTextField getTextField_estado() {
		return textField_estado;
	}

	public void setTextField_estado(JTextField textField_estado) {
		this.textField_estado = textField_estado;
	}

	public JTextField getTextField_cep() {
		return textField_cep;
	}

	public void setTextField_cep(JTextField textField_cep) {
		this.textField_cep = textField_cep;
	}

	public JTextField getTextField_curso() {
		return textField_curso;
	}

	public void setTextField_curso(JTextField textField_curso) {
		this.textField_curso = textField_curso;
	}

	public JTextField getTextField_datainicio() {
		return textField_datainicio;
	}

	public void setTextField_datainicio(JTextField textField_datainicio) {
		this.textField_datainicio = textField_datainicio;
	}

}
