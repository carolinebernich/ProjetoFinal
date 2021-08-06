package visao;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;

public class TelaLogin extends JPanel {


	private static final long serialVersionUID = 1L;
	private JTextField textFieldUsuario;
	private JPasswordField textFieldSenha;
	private JButton btnLimpar;
	private JButton btnEntrar;

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setLayout(new MigLayout("", "[grow][][grow][grow]", "[grow][][][][][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TelaLogin.class.getResource("/figuras/fingerprint-scan-96.png")));
		add(lblNewLabel, "cell 1 1 2 1,alignx center");
		
		JLabel lblLogin = new JLabel("Login", SwingConstants.CENTER);
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 24));
		add(lblLogin, "cell 1 2 2 1,alignx center");
		
		JLabel lblUsuario = new JLabel("Usuário:");
		lblUsuario.setFont(new Font("Arial", Font.PLAIN, 18));
		add(lblUsuario, "cell 1 4,alignx trailing");
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setFont(new Font("Arial", Font.PLAIN, 18));
		add(textFieldUsuario, "cell 2 4,growx");
		textFieldUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 18));
		add(lblSenha, "cell 1 5,alignx trailing");
		
		textFieldSenha = new JPasswordField();
		textFieldSenha.setFont(new Font("Arial", Font.PLAIN, 18));
		add(textFieldSenha, "cell 2 5,growx");
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(new Color(255, 0, 0));
		btnLimpar.setIcon(new ImageIcon(TelaLogin.class.getResource("/figuras/baseline_clear_black_24dp.png")));
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 18));
		add(btnLimpar, "flowx,cell 1 7 2 1,alignx center");
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setForeground(new Color(0, 128, 0));
		btnEntrar.setIcon(new ImageIcon(TelaLogin.class.getResource("/figuras/baseline_login_black_24dp.png")));
		btnEntrar.setFont(new Font("Arial", Font.PLAIN, 18));
		add(btnEntrar, "cell 1 7");
	}

	public JTextField getTextFieldUsuario() {
		return textFieldUsuario;
	}

	public void setTextFieldUsuario(JTextField textFieldUsuario) {
		this.textFieldUsuario = textFieldUsuario;
	}

	public JPasswordField getTextFieldSenha() {
		return textFieldSenha;
	}

	public void setTextFieldSenha(JPasswordField textFieldSenha) {
		this.textFieldSenha = textFieldSenha;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	public JButton getBtnEntrar() {
		return btnEntrar;
	}

	public void setBtnEntrar(JButton btnEntrar) {
		this.btnEntrar = btnEntrar;
	}
	
	public void limparCamposTela() {
		textFieldUsuario.setText("");
		textFieldSenha.setText("");
	}

}
