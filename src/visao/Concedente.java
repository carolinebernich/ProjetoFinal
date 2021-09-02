package visao;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

import javax.swing.JTextField;

public class Concedente extends JPanel {
	private JTextField textField_razaoconcede;
	private JTextField textField_cnpjconcede;
	private JTextField textField_telconcede;
	private JTextField textField_nomerepconcede;
	private JTextField textFieldcargorep_concede;
	private JTextField textField_enderecoconcede;
	private JTextField textField_numconcede;
	private JTextField textField_compconcede;
	private JTextField textFieldbairro_concede;
	private JTextField textField_cidadeconcede;
	private JTextField textField_estadoconcede;
	private JTextField textField_cepconcede;

	/**
	 * Create the panel.
	 */
	public Concedente() {
		setLayout(new MigLayout("", "[122][122][122][122][122]", "[][][][][][][][][20][20][20][20][]"));

		JLabel lblTituloConcedente = new JLabel("Concedente");
		lblTituloConcedente.setFont(new Font("Arial", Font.BOLD, 16));
		add(lblTituloConcedente, "cell 0 0 5 1,alignx center");
		
		JLabel lblrazao_concede = new JLabel("RAZ\u00C3O SOCIAL:");
		lblrazao_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblrazao_concede, "flowx,cell 0 2 5 1");
		
		textField_razaoconcede = new JTextField();
		textField_razaoconcede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_razaoconcede, "cell 0 2 5 1,grow");
		textField_razaoconcede.setColumns(10);
		
		JLabel lblcnpj_concede = new JLabel("CNPJ:");
		lblcnpj_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcnpj_concede, "flowx,cell 0 3 3 1");
		
		textField_cnpjconcede = new JTextField();
		textField_cnpjconcede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_cnpjconcede, "cell 0 3 3 1,grow");
		textField_cnpjconcede.setColumns(10);
		
		JLabel lbltelefone_concede = new JLabel("TELEFONE:");
		lbltelefone_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lbltelefone_concede, "flowx,cell 3 3 2 1");
		
		textField_telconcede = new JTextField();
		textField_telconcede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_telconcede, "cell 3 3 2 1,grow");
		textField_telconcede.setColumns(10);
		
		JLabel lblnomerep_concede = new JLabel("NOME DO REPRESENTANTE:");
		lblnomerep_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblnomerep_concede, "flowx,cell 0 4 3 1");
		
		textField_nomerepconcede = new JTextField();
		textField_nomerepconcede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_nomerepconcede, "cell 0 4 3 1,grow");
		textField_nomerepconcede.setColumns(10);
		
		JLabel lblcargorep_concede = new JLabel("CARGO REPRESENTANTE:");
		lblcargorep_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcargorep_concede, "flowx,cell 3 4 2 1");
		
		textFieldcargorep_concede = new JTextField();
		textFieldcargorep_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textFieldcargorep_concede, "cell 3 4,grow");
		textFieldcargorep_concede.setColumns(10);
		
		JLabel lblendereco_concede = new JLabel("ENDERE\u00C7O:");
		lblendereco_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblendereco_concede, "flowx,cell 0 5 4 1");
		
		textField_enderecoconcede = new JTextField();
		textField_enderecoconcede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_enderecoconcede, "cell 0 5,grow");
		textField_enderecoconcede.setColumns(10);
		
		JLabel lblnum_concede = new JLabel("N\u00B0:");
		lblnum_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblnum_concede, "flowx,cell 4 5");
		
		textField_numconcede = new JTextField();
		textField_numconcede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_numconcede, "cell 4 5,grow");
		textField_numconcede.setColumns(10);
		
		JLabel lblcomp_concede = new JLabel("COMPLEMENTO:");
		lblcomp_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcomp_concede, "flowx,cell 0 6 2 1");
		
		textField_compconcede = new JTextField();
		textField_compconcede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_compconcede, "cell 0 6,growx");
		textField_compconcede.setColumns(10);
		
		JLabel lblbairro_concede = new JLabel("BAIRRO:");
		lblbairro_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblbairro_concede, "flowx,cell 2 6 3 1");
		
		textFieldbairro_concede = new JTextField();
		textFieldbairro_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textFieldbairro_concede, "cell 2 6,grow");
		textFieldbairro_concede.setColumns(10);
		
		JLabel lblcidade_concede = new JLabel("CIDADE:");
		lblcidade_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcidade_concede, "flowx,cell 0 7 2 1");
		
		textField_cidadeconcede = new JTextField();
		textField_cidadeconcede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_cidadeconcede, "cell 0 7,growx");
		textField_cidadeconcede.setColumns(10);
		
		JLabel lblestado_concede = new JLabel("ESTADO:");
		lblestado_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblestado_concede, "flowx,cell 2 7 2 1");
		
		JLabel lblcep_concede = new JLabel("CEP:");
		lblcep_concede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(lblcep_concede, "flowx,cell 4 7");
		
		textField_estadoconcede = new JTextField();
		textField_estadoconcede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_estadoconcede, "cell 2 7,growx");
		textField_estadoconcede.setColumns(10);
		
		textField_cepconcede = new JTextField();
		textField_cepconcede.setFont(new Font("Arial", Font.PLAIN, 11));
		add(textField_cepconcede, "cell 4 7,growx");
		textField_cepconcede.setColumns(10);
		
		JButton btncadastrar = new JButton("CADASTRAR");
		btncadastrar.setIcon(new ImageIcon(Concedente.class.getResource("/Figuras/ok1.png")));
		btncadastrar.setFont(new Font("Arial", Font.BOLD, 11));
		add(btncadastrar, "cell 0 12,growx");
		
		JButton btnconsultar = new JButton("CONSULTAR");
		btnconsultar.setIcon(new ImageIcon(Concedente.class.getResource("/Figuras/pesquisa.png")));
		btnconsultar.setFont(new Font("Arial", Font.BOLD, 11));
		add(btnconsultar, "cell 1 12,growx");
		
		JButton btnatualizar = new JButton("ATUALIZAR");
		btnatualizar.setIcon(new ImageIcon(Concedente.class.getResource("/Figuras/alterar.png")));
		btnatualizar.setFont(new Font("Arial", Font.BOLD, 11));
		add(btnatualizar, "cell 2 12,growx");
		
		JButton btnremover = new JButton("REMOVER");
		btnremover.setIcon(new ImageIcon(Concedente.class.getResource("/Figuras/remover-banco-de-dados.png")));
		btnremover.setFont(new Font("Arial", Font.BOLD, 11));
		add(btnremover, "cell 3 12,growx");
		
		JButton btnlimpar = new JButton("LIMPAR TELA");
		btnlimpar.setIcon(new ImageIcon(Concedente.class.getResource("/Figuras/clean.png")));
		btnlimpar.setFont(new Font("Arial", Font.BOLD, 11));
		add(btnlimpar, "cell 4 12,growx");
	}

	public JTextField getTextField_razaoconcede() {
		return textField_razaoconcede;
	}

	public void setTextField_razaoconcede(JTextField textField_razaoconcede) {
		this.textField_razaoconcede = textField_razaoconcede;
	}

	public JTextField getTextField_cnpjconcede() {
		return textField_cnpjconcede;
	}

	public void setTextField_cnpjconcede(JTextField textField_cnpjconcede) {
		this.textField_cnpjconcede = textField_cnpjconcede;
	}

	public JTextField getTextField_telconcede() {
		return textField_telconcede;
	}

	public void setTextField_telconcede(JTextField textField_telconcede) {
		this.textField_telconcede = textField_telconcede;
	}

	public JTextField getTextField_nomerepconcede() {
		return textField_nomerepconcede;
	}

	public void setTextField_nomerepconcede(JTextField textField_nomerepconcede) {
		this.textField_nomerepconcede = textField_nomerepconcede;
	}

	public JTextField getTextFieldcargorep_concede() {
		return textFieldcargorep_concede;
	}

	public void setTextFieldcargorep_concede(JTextField textFieldcargorep_concede) {
		this.textFieldcargorep_concede = textFieldcargorep_concede;
	}

	public JTextField getTextField_enderecoconcede() {
		return textField_enderecoconcede;
	}

	public void setTextField_enderecoconcede(JTextField textField_enderecoconcede) {
		this.textField_enderecoconcede = textField_enderecoconcede;
	}

	public JTextField getTextField_numconcede() {
		return textField_numconcede;
	}

	public void setTextField_numconcede(JTextField textField_numconcede) {
		this.textField_numconcede = textField_numconcede;
	}

	public JTextField getTextField_compconcede() {
		return textField_compconcede;
	}

	public void setTextField_compconcede(JTextField textField_compconcede) {
		this.textField_compconcede = textField_compconcede;
	}

	public JTextField getTextFieldbairro_concede() {
		return textFieldbairro_concede;
	}

	public void setTextFieldbairro_concede(JTextField textFieldbairro_concede) {
		this.textFieldbairro_concede = textFieldbairro_concede;
	}

	public JTextField getTextField_cidadeconcede() {
		return textField_cidadeconcede;
	}

	public void setTextField_cidadeconcede(JTextField textField_cidadeconcede) {
		this.textField_cidadeconcede = textField_cidadeconcede;
	}

	public JTextField getTextField_estadoconcede() {
		return textField_estadoconcede;
	}

	public void setTextField_estadoconcede(JTextField textField_estadoconcede) {
		this.textField_estadoconcede = textField_estadoconcede;
	}

	public JTextField getTextField_cepconcede() {
		return textField_cepconcede;
	}

	public void setTextField_cepconcede(JTextField textField_cepconcede) {
		this.textField_cepconcede = textField_cepconcede;
	}

}
