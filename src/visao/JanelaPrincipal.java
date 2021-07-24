package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
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
import java.awt.Panel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class JanelaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JanelaPrincipal frame;
	private JMenuItem itemAutenticar;
	private JMenuItem itemSair;
	private JMenuItem itemEstagiario;
	private JMenuItem itemCurso;
	private JMenuItem itemConcedente;
	private JMenuItem itemTermo;
	private JPanel TelaLogon ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Termos de Compromissos de Est\u00E1gios n\u00E3o obrigat\u00F3rios.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 381);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuLogon = new JMenu("Logon");
		menuLogon.setFont(new Font("Arial Black", Font.PLAIN, 12));
		menuBar.add(menuLogon);

		itemAutenticar = new JMenuItem("Autenticar");
		itemAutenticar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/login (1).png")));
		itemAutenticar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				contentPane.setVisible(true);

			}
		});
		itemAutenticar.setFont(new Font("Arial", Font.PLAIN, 12));
		menuLogon.add(itemAutenticar);

		itemSair = new JMenuItem("Sair");
		itemSair.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/logout.png")));
		itemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int opt = JOptionPane.showConfirmDialog(frame, "Deseja sair da aplicação?", "confirmação de operação", 0, 3,
						null);// 3 é referente ao tipo de caixa, sendo 3 de pergunta
				// o 0 informa os tipos de respostas que aparece nesse caso (sim e nao)
				
				if (opt == 0)
					System.exit(0);
			}});

			
		itemSair.setFont(new Font("Arial", Font.PLAIN, 12));
		menuLogon.add(itemSair);

		JMenu menuGerenciar = new JMenu("Gerenciar");
		menuGerenciar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		menuBar.add(menuGerenciar);

		itemEstagiario = new JMenuItem("Estagi\u00E1rio");
		itemEstagiario.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/working-man.png")));
		itemEstagiario.setFont(new Font("Arial", Font.PLAIN, 12));
		itemEstagiario.setEnabled(false);
		menuGerenciar.add(itemEstagiario);

		itemCurso = new JMenuItem("Curso");
		itemCurso.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/online-course.png")));
		itemCurso.setFont(new Font("Arial", Font.PLAIN, 12));
		itemCurso.setEnabled(false);
		menuGerenciar.add(itemCurso);

		itemConcedente = new JMenuItem("Concedente");
		itemConcedente.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/companhia.png")));
		itemConcedente.setFont(new Font("Arial", Font.PLAIN, 12));
		itemConcedente.setEnabled(false);
		menuGerenciar.add(itemConcedente);

		itemTermo = new JMenuItem("Termo de Compromisso.");
		itemTermo.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/documentos.png")));
		itemTermo.setFont(new Font("Arial", Font.PLAIN, 12));
		itemTermo.setEnabled(false);
		menuGerenciar.add(itemTermo);
		
		contentPane = new JPanel();
		contentPane.setVisible(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(new CardLayout(0, 0));
		
		TelaLogon = new JPanel();
		contentPane.add(TelaLogon, "telaLogon");
		TelaLogon.setLayout(new MigLayout("", "[][grow]", "[]")); 
																
		
		JLabel lblNewLabel = new JLabel("TELA LOGON");//só coloquei essa parte pra testar a chamada do cardlayout. 
		TelaLogon.add(lblNewLabel, "cell 1 0");
	}

}
