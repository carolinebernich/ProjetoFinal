package visao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.ImageIcon;

public class JanelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private CardLayout cardLayout;
	private JPanel telaPrincipal;
	private TelaLogin telaLogin;
	
	private JMenuItem menuItemAutenticar;
	private JMenuItem menuItemSair;
	private JMenuItem menuItemEstagiario;
	private JMenuItem menuItemCurso;
	private JMenuItem menuItemConcedente;
	private JMenuItem menuItemTermo;

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Termos de Compromissos de Estágios não obrigatórios.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 381);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		cardLayout = new CardLayout(0, 0);
		contentPane.setLayout(cardLayout);
		
		
		// Inicia telas
		telaPrincipal = new JPanel();
		telaLogin = new TelaLogin();
		
		contentPane.add(telaPrincipal, "principal");
		contentPane.add(telaLogin, "login");
		
		
		// Add menus
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menuLogon = new JMenu("Logon");
		menuLogon.setFont(new Font("Arial", Font.BOLD, 14));
		menuBar.add(menuLogon);

		menuItemAutenticar = new JMenuItem("Autenticar");
		menuItemAutenticar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/login (1).png")));
		menuItemAutenticar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "login");
			}
		});
		menuItemAutenticar.setFont(new Font("Arial", Font.PLAIN, 14));
		menuLogon.add(menuItemAutenticar);

		menuItemSair = new JMenuItem("Sair");
		menuItemSair.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/logout.png")));
		menuItemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int opt = JOptionPane.showConfirmDialog(contentPane, "Deseja sair da aplicação?", "Confirmar de operação", 0, 3,
						null);// 3 � referente ao tipo de caixa, sendo 3 de pergunta
				// o 0 informa os tipos de respostas que aparece nesse caso (sim e nao)
				
				if (opt == 0)
					System.exit(0);
			}});

			
		menuItemSair.setFont(new Font("Arial", Font.PLAIN, 14));
		menuLogon.add(menuItemSair);

		JMenu menuGerenciar = new JMenu("Gerenciar");
		menuGerenciar.setFont(new Font("Arial", Font.BOLD, 14));
		menuBar.add(menuGerenciar);

		menuItemEstagiario = new JMenuItem("Estagi\u00E1rio");
		menuItemEstagiario.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/working-man.png")));
		menuItemEstagiario.setFont(new Font("Arial", Font.PLAIN, 14));
		menuItemEstagiario.setEnabled(false);
		menuGerenciar.add(menuItemEstagiario);

		menuItemCurso = new JMenuItem("Curso");
		menuItemCurso.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/online-course.png")));
		menuItemCurso.setFont(new Font("Arial", Font.PLAIN, 14));
		menuItemCurso.setEnabled(false);
		menuGerenciar.add(menuItemCurso);

		menuItemConcedente = new JMenuItem("Concedente");
		menuItemConcedente.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/companhia.png")));
		menuItemConcedente.setFont(new Font("Arial", Font.PLAIN, 14));
		menuItemConcedente.setEnabled(false);
		menuGerenciar.add(menuItemConcedente);

		menuItemTermo = new JMenuItem("Termo de Compromisso.");
		menuItemTermo.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/documentos.png")));
		menuItemTermo.setFont(new Font("Arial", Font.PLAIN, 14));
		menuItemTermo.setEnabled(false);
		menuGerenciar.add(menuItemTermo);
	}

	public TelaLogin getTelaLogin() {
		return telaLogin;
	}

	public void setTelaLogin(TelaLogin telaLogin) {
		this.telaLogin = telaLogin;
	}

	public CardLayout getCardLayout() {
		return cardLayout;
	}

	public void setCardLayout(CardLayout cardLayout) {
		this.cardLayout = cardLayout;
	}

	public JMenuItem getMenuItemAutenticar() {
		return menuItemAutenticar;
	}

	public void setMenuItemAutenticar(JMenuItem menuItemAutenticar) {
		this.menuItemAutenticar = menuItemAutenticar;
	}

	public JMenuItem getMenuItemSair() {
		return menuItemSair;
	}

	public void setMenuItemSair(JMenuItem menuItemSair) {
		this.menuItemSair = menuItemSair;
	}

	public JMenuItem getMenuItemEstagiario() {
		return menuItemEstagiario;
	}

	public void setMenuItemEstagiario(JMenuItem menuItemEstagiario) {
		this.menuItemEstagiario = menuItemEstagiario;
	}

	public JMenuItem getMenuItemCurso() {
		return menuItemCurso;
	}

	public void setMenuItemCurso(JMenuItem menuItemCurso) {
		this.menuItemCurso = menuItemCurso;
	}

	public JMenuItem getMenuItemConcedente() {
		return menuItemConcedente;
	}

	public void setMenuItemConcedente(JMenuItem menuItemConcedente) {
		this.menuItemConcedente = menuItemConcedente;
	}

	public JMenuItem getMenuItemTermo() {
		return menuItemTermo;
	}

	public void setMenuItemTermo(JMenuItem menuItemTermo) {
		this.menuItemTermo = menuItemTermo;
	}
	
}
