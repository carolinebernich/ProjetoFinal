package controle;

import modelo.Usuario;
import visao.JanelaPrincipal;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
		janelaPrincipal.setVisible(true);
		
		Usuario usuario = new Usuario();
		UsuarioControle usuarioControle = new UsuarioControle(janelaPrincipal, usuario);
		
	}
}
