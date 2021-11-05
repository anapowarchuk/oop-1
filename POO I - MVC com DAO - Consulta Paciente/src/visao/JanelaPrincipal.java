package visao;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuItem menuItemConsultar;
	private JMenuItem menuItemCadastrar;
	private JMenu menuSair;
	private TelaCadastro telaCad;
	private TelaConsulta telaCon;


	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		menuItemCadastrar= new JMenuItem("Cadastrar");
		menuItemCadastrar.setActionCommand("menuCad");
		menuArquivo.add(menuItemCadastrar);
		
		
		menuItemConsultar= new JMenuItem("Consultar");
		menuItemConsultar.setActionCommand("menuCon");
		menuArquivo.add(menuItemConsultar);
		
		menuSair = new JMenu("Sair");
		menuSair.setActionCommand("menuSair");
		menuBar.add(menuSair);
		

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		telaCon = new TelaConsulta();
		telaCad = new TelaCadastro();
	}

	public JMenuItem getMenuItemConsultar() {
		return menuItemConsultar;
	}

	public void setMenuItemConsultar(JMenuItem menuItemConsultar) {
		this.menuItemConsultar = menuItemConsultar;
	}

	public JMenuItem getMenuItemCadastrar() {
		return menuItemCadastrar;
	}

	public void setMenuItemCadastrar(JMenuItem menuItemCadastrar) {
		this.menuItemCadastrar = menuItemCadastrar;
	}

	public JMenu getMenuSair() {
		return menuSair;
	}

	public void setMenuSair(JMenu menuSair) {
		this.menuSair = menuSair;
	}

	public TelaCadastro getTelaCad() {
		return telaCad;
	}

	public void setTelaCad(TelaCadastro telaCad) {
		this.telaCad = telaCad;
	}

	public TelaConsulta getTelaCon() {
		return telaCon;
	}

	public void setTelaCon(TelaConsulta telaCon) {
		this.telaCon = telaCon;
	}
	
	

}
