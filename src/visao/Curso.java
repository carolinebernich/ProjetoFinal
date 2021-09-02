package visao;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Curso extends JPanel {
	private JTextField textField_codigocurso;
	private JTextField textField_nomecurso;
	private JTextField textFieldnome_uni;
	private JTextField textField_cnpj;
	private JTextField textField_repcoord;
	private JTextField textFieldfonegeral;
	private JTextField textField_fonecoord;
	private JTextField textFieldcoorduni;
	private JTextField textField_cargorepreuni;
	private JTextField textField_enderecouni;
	private JTextField textFieldnum_uni;
	private JTextField textFieldcomp_uni;
	private JTextField textField_bairrouni;
	private JTextField textField_cepuni;
	private JTextField textField_cidadeuni;
	private JTextField textFieldestado_uni;

	/**
	 * Create the panel.
	 */
	public Curso() {
		setLayout(new MigLayout("", "[122][122][122][122][122]", "[][][][][][][][][][][][20][20][]"));
		
		JLabel lblTituloCurso = new JLabel("Dados do Curso");
		lblTituloCurso.setFont(new Font("Arial", Font.BOLD, 16));
		add(lblTituloCurso, "cell 0 0 5 1,alignx center");
		
		JLabel lblcodigo_curso = new JLabel("C\u00D3DIGO DO CURSO:");
		lblcodigo_curso.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcodigo_curso, "flowx,cell 0 2 2 1");
		
		textField_codigocurso = new JTextField();
		textField_codigocurso.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_codigocurso, "cell 0 2 2 1,grow");
		textField_codigocurso.setColumns(10);
		
		JLabel lblnome_curso = new JLabel("NOME DO CURSO:");
		lblnome_curso.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblnome_curso, "flowx,cell 2 2 3 1");
		
		textField_nomecurso = new JTextField();
		textField_nomecurso.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_nomecurso, "cell 2 2 3 1,grow");
		textField_nomecurso.setColumns(10);
		
		JLabel lblnome_uni = new JLabel("NOME DA UNIVERSIDADE:");
		lblnome_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblnome_uni, "flowx,cell 0 3 3 1");
		
		textFieldnome_uni = new JTextField();
		textFieldnome_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textFieldnome_uni, "cell 0 3 3 1,growx");
		textFieldnome_uni.setColumns(10);
		
		JLabel lbl_cnpj = new JLabel("CNPJ:");
		lbl_cnpj.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lbl_cnpj, "flowx,cell 3 3 2 1");
		
		textField_cnpj = new JTextField();
		textField_cnpj.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_cnpj, "cell 3 3 2 1,grow");
		textField_cnpj.setColumns(10);
		
		JLabel lblrep_coord = new JLabel("REPRESENTANTE DA COORDENA\u00C7\u00C3O:");
		lblrep_coord.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblrep_coord, "flowx,cell 0 4 5 1");
		
		textField_repcoord = new JTextField();
		textField_repcoord.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_repcoord, "cell 0 4 5 1,grow");
		textField_repcoord.setColumns(10);
		
		JLabel lbltel_geral = new JLabel("TEL GERAL DA UNIVERSIDADE:");
		lbltel_geral.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lbltel_geral, "flowx,cell 0 5 3 1");
		
		textFieldfonegeral = new JTextField();
		textFieldfonegeral.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textFieldfonegeral, "cell 0 5 3 1,grow");
		textFieldfonegeral.setColumns(10);
		
		JLabel lblfone_coord = new JLabel("TEL DA COORDENA\u00C7\u00C3O:");
		lblfone_coord.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblfone_coord, "flowx,cell 3 5 2 1");
		
		textField_fonecoord = new JTextField();
		add(textField_fonecoord, "cell 3 5,grow");
		textField_fonecoord.setColumns(10);
		
		JLabel lblrep_uni = new JLabel("REPRESENTANTE DA UNIVERSIDADE:");
		lblrep_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblrep_uni, "flowx,cell 0 6 5 1");
		
		textFieldcoorduni = new JTextField();
		textFieldcoorduni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textFieldcoorduni, "cell 0 6 5 1,grow");
		textFieldcoorduni.setColumns(10);
		
		JLabel lblcargo_rep_uni = new JLabel("CARGO DO REPRE. UNIVERSIDADE:");
		lblcargo_rep_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcargo_rep_uni, "flowx,cell 0 7 5 1");
		
		textField_cargorepreuni = new JTextField();
		textField_cargorepreuni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_cargorepreuni, "cell 0 7,growx");
		textField_cargorepreuni.setColumns(10);
		
		JLabel lblendereco_uni = new JLabel("ENDERE\u00C7O:");
		lblendereco_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblendereco_uni, "flowx,cell 0 8 4 1");
		
		textField_enderecouni = new JTextField();
		textField_enderecouni.setText("");
		add(textField_enderecouni, "cell 0 8,grow");
		textField_enderecouni.setColumns(10);
		
		JLabel lblnum_uni = new JLabel("N\u00B0:");
		lblnum_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblnum_uni, "flowx,cell 4 8");
		
		textFieldnum_uni = new JTextField();
		textFieldnum_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textFieldnum_uni, "cell 4 8,grow");
		textFieldnum_uni.setColumns(10);
		
		JLabel lblcomp_uni = new JLabel("COMPLENTO:");
		lblcomp_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcomp_uni, "flowx,cell 0 9 2 1");
		
		textFieldcomp_uni = new JTextField();
		textFieldcomp_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textFieldcomp_uni, "cell 0 9,grow");
		textFieldcomp_uni.setColumns(10);
		
		JLabel lblbairro_uni = new JLabel("BAIRRO:");
		lblbairro_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblbairro_uni, "flowx,cell 2 9 2 1");
		
		textField_bairrouni = new JTextField();
		textField_bairrouni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_bairrouni, "cell 2 9,grow");
		textField_bairrouni.setColumns(10);
		
		JLabel lblcep_uni = new JLabel("CEP:");
		lblcep_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcep_uni, "flowx,cell 4 9");
		
		textField_cepuni = new JTextField();
		textField_cepuni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_cepuni, "cell 4 9,grow");
		textField_cepuni.setColumns(10);
		
		JLabel lblcidade_uni = new JLabel("CIDADE:");
		lblcidade_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcidade_uni, "flowx,cell 0 10 3 1");
		
		textField_cidadeuni = new JTextField();
		textField_cidadeuni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_cidadeuni, "cell 0 10,growx");
		textField_cidadeuni.setColumns(10);
		
		JLabel lblestado_uni = new JLabel("ESTADO:");
		lblestado_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblestado_uni, "flowx,cell 3 10 2 1");
		
		textFieldestado_uni = new JTextField();
		textFieldestado_uni.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textFieldestado_uni, "cell 3 10,grow");
		textFieldestado_uni.setColumns(10);
		
		JButton btncadastrar = new JButton("CADASTRAR");
		btncadastrar.setIcon(new ImageIcon(Curso.class.getResource("/Figuras/ok1.png")));
		btncadastrar.setFont(new Font("Arial", Font.BOLD, 11));
		add(btncadastrar, "cell 0 13,growx");
		
		JButton btnconsultar = new JButton("CONSULTAR");
		btnconsultar.setIcon(new ImageIcon(Curso.class.getResource("/Figuras/pesquisa.png")));
		btnconsultar.setFont(new Font("Arial", Font.BOLD, 11));
		add(btnconsultar, "cell 1 13,growx");
		
		JButton btnatualizar = new JButton("ATUALIZAR");
		btnatualizar.setIcon(new ImageIcon(Curso.class.getResource("/Figuras/alterar.png")));
		btnatualizar.setFont(new Font("Arial", Font.BOLD, 11));
		add(btnatualizar, "cell 2 13,growx");
		
		JButton btnremover = new JButton("REMOVER");
		btnremover.setIcon(new ImageIcon(Curso.class.getResource("/Figuras/remover-banco-de-dados.png")));
		btnremover.setFont(new Font("Arial", Font.BOLD, 11));
		add(btnremover, "cell 3 13,growx");
		
		JButton btnlimpar = new JButton("LIMPAR TELA");
		btnlimpar.setIcon(new ImageIcon(Curso.class.getResource("/Figuras/clean.png")));
		btnlimpar.setFont(new Font("Arial", Font.BOLD, 11));
		add(btnlimpar, "cell 4 13,growx");
				
	}

	public JTextField getTextField_codigocurso() {
		return textField_codigocurso;
	}

	public void setTextField_codigocurso(JTextField textField_codigocurso) {
		this.textField_codigocurso = textField_codigocurso;
	}

	public JTextField getTextField_nomecurso() {
		return textField_nomecurso;
	}

	public void setTextField_nomecurso(JTextField textField_nomecurso) {
		this.textField_nomecurso = textField_nomecurso;
	}

	public JTextField getTextFieldnome_uni() {
		return textFieldnome_uni;
	}

	public void setTextFieldnome_uni(JTextField textFieldnome_uni) {
		this.textFieldnome_uni = textFieldnome_uni;
	}

	public JTextField getTextField_cnpj() {
		return textField_cnpj;
	}

	public void setTextField_cnpj(JTextField textField_cnpj) {
		this.textField_cnpj = textField_cnpj;
	}

	public JTextField getTextField_repcoord() {
		return textField_repcoord;
	}

	public void setTextField_repcoord(JTextField textField_repcoord) {
		this.textField_repcoord = textField_repcoord;
	}

	public JTextField getTextFieldfonegeral() {
		return textFieldfonegeral;
	}

	public void setTextFieldfonegeral(JTextField textFieldfonegeral) {
		this.textFieldfonegeral = textFieldfonegeral;
	}

	public JTextField getTextField_fonecoord() {
		return textField_fonecoord;
	}

	public void setTextField_fonecoord(JTextField textField_fonecoord) {
		this.textField_fonecoord = textField_fonecoord;
	}

	public JTextField getTextFieldcoorduni() {
		return textFieldcoorduni;
	}

	public void setTextFieldcoorduni(JTextField textFieldcoorduni) {
		this.textFieldcoorduni = textFieldcoorduni;
	}

	public JTextField getTextField_cargorepreuni() {
		return textField_cargorepreuni;
	}

	public void setTextField_cargorepreuni(JTextField textField_cargorepreuni) {
		this.textField_cargorepreuni = textField_cargorepreuni;
	}

	public JTextField getTextField_enderecouni() {
		return textField_enderecouni;
	}

	public void setTextField_enderecouni(JTextField textField_enderecouni) {
		this.textField_enderecouni = textField_enderecouni;
	}

	public JTextField getTextFieldnum_uni() {
		return textFieldnum_uni;
	}

	public void setTextFieldnum_uni(JTextField textFieldnum_uni) {
		this.textFieldnum_uni = textFieldnum_uni;
	}

	public JTextField getTextFieldcomp_uni() {
		return textFieldcomp_uni;
	}

	public void setTextFieldcomp_uni(JTextField textFieldcomp_uni) {
		this.textFieldcomp_uni = textFieldcomp_uni;
	}

	public JTextField getTextField_bairrouni() {
		return textField_bairrouni;
	}

	public void setTextField_bairrouni(JTextField textField_bairrouni) {
		this.textField_bairrouni = textField_bairrouni;
	}

	public JTextField getTextField_cepuni() {
		return textField_cepuni;
	}

	public void setTextField_cepuni(JTextField textField_cepuni) {
		this.textField_cepuni = textField_cepuni;
	}

	public JTextField getTextField_cidadeuni() {
		return textField_cidadeuni;
	}

	public void setTextField_cidadeuni(JTextField textField_cidadeuni) {
		this.textField_cidadeuni = textField_cidadeuni;
	}

	public JTextField getTextFieldestado_uni() {
		return textFieldestado_uni;
	}

	public void setTextFieldestado_uni(JTextField textFieldestado_uni) {
		this.textFieldestado_uni = textFieldestado_uni;
	}

}
