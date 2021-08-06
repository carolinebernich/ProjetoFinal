package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import modelo.Usuario;
import visao.JanelaPrincipal;

public class UsuarioControle implements ActionListener{

	private JanelaPrincipal janelaPrincipal;
	private Usuario usuario;
	//private UsuarioDAO usuarioDao = new UsuarioDAO();
	
	public UsuarioControle(JanelaPrincipal janelaPrincipal, Usuario usuario) {
		super();
		this.janelaPrincipal = janelaPrincipal;
		this.usuario = usuario;
		
		this.janelaPrincipal.getTelaLogin().getBtnLimpar().addActionListener(this);
		this.janelaPrincipal.getTelaLogin().getBtnEntrar().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Limpar")) { 
			this.janelaPrincipal.getTelaLogin().limparCamposTela();
		} else if (e.getActionCommand().equals("Entrar")) { 
			//TODO: código para validar loguin DAO etc..			
			String usuario = janelaPrincipal.getTelaLogin().getTextFieldUsuario().getText();
			String senha = new String(janelaPrincipal.getTelaLogin().getTextFieldSenha().getPassword());
			this.usuario.setUsuario(usuario);
			this.usuario.setSenha(senha);
			if(usuario.equals("teste" ) && senha.equals("teste")) {
				janelaPrincipal.getMenuItemEstagiario().setEnabled(true);
				janelaPrincipal.getMenuItemCurso().setEnabled(true);
				janelaPrincipal.getMenuItemConcedente().setEnabled(true);
				janelaPrincipal.getMenuItemTermo().setEnabled(true);
				final ImageIcon icon = new ImageIcon(getClass().getResource("/figuras/ok-48.png"));
				JOptionPane.showMessageDialog(janelaPrincipal,
				        "Usuário: <" + usuario + "> autenticado com sucesso.",
				        "Autenticação",
				        JOptionPane.NO_OPTION, icon);
				janelaPrincipal.getTelaLogin().limparCamposTela();
				janelaPrincipal.getCardLayout().show(janelaPrincipal.getContentPane(), "principal");
			} else {
				final ImageIcon icon = new ImageIcon(getClass().getResource("/figuras/id-not-verified-48.png"));
				JOptionPane.showMessageDialog(janelaPrincipal,
				        "Não foi possivel autenticar com o usuário: <" + usuario + ">.\nVerifique as credenciais e tente novamente.",
				        "Erro na autenticação",
				        JOptionPane.ERROR_MESSAGE, icon);
				janelaPrincipal.getTelaLogin().limparCamposTela();
			}
		}
		
	}
}
