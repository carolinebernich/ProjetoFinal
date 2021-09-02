package controle;

import modelo.Concedente;
import modelo.Curso;
import modelo.Estagiario;
import modelo.Usuario;
import visao.JanelaPrincipal;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
		janelaPrincipal.setVisible(true);
		
		Usuario usuario = new Usuario();
		Estagiario estagiario = new Estagiario();
		Curso curso = new Curso();
		Concedente concedente = new Concedente();
		
		UsuarioControle usuarioControle = new UsuarioControle(janelaPrincipal, usuario);
		TermoCompromissoController termoCompromissoController = new TermoCompromissoController(janelaPrincipal, estagiario, curso, concedente);
	}
}
