import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Frame extends JFrame implements ActionListener, MouseListener {

	protected JLayeredPane background;
	protected Fundo fundo;
	protected Player j1;
	protected JPanel menu;
	protected JLabel titulo;
	protected JLabel qtdPlayer;
	protected JLabel mapSelector;
	protected JLabel dados;
	protected D4 d4;
	protected D6 d6;
	protected D8 d8;
	protected D12 d12;
	protected D20 d20;
	protected static int resultado;
	protected JComboBox mapas;
	protected JComboBox jogadores;
	protected JComboBox comboDice;
	
	Frame() {
		
		fundo = new Fundo("D:\\Eclipse Workspace\\Tabuleiro(Tentativa)\\src\\files\\background1.jpeg");
		fundo.setBackground(Color.blue);
		fundo.setBounds(0, 0, 736, 841);
		fundo.addMouseListener(this);
		
		j1 = new Player("D:\\Eclipse Workspace\\Tabuleiro\\src\\files\\player1.png");
		/*j1.setOpaque(true);
		j1.setBackground(Color.red);*/
		j1.setBounds(200, 113, 34, 29);
		
		menu = new JPanel();
		menu.setBounds(737, 0, 800, 841);
		menu.setLayout(null);
		menu.setBackground(Color.green);
		
		titulo = new JLabel("RPG Map");
		titulo.setForeground(Color.magenta);
		titulo.setFont(new Font("Ink free", Font.BOLD, 50));
		titulo.setBounds(290, 20, 215, 53);
		
		qtdPlayer = new JLabel("N° jogadores: ");
		qtdPlayer.setBounds(100, 100, 195, 30);
		qtdPlayer.setForeground(Color.black);
		qtdPlayer.setFont(new Font("Arial", Font.PLAIN, 30));
		
		mapSelector = new JLabel("Mapa:");
		mapSelector.setBounds(100, 150, 90, 30);
		mapSelector.setFont(new Font("Arial", Font.PLAIN, 30));
		mapSelector.setForeground(Color.black);
		
		dados = new JLabel("Qtd Dados: ");
		dados.setBounds(100, 200, 165, 30);
		dados.setFont(new Font("Arial", Font.PLAIN, 30));
		dados.setForeground(Color.black);
		
		d4 = new D4();
		d6 = new D6();
		d8 = new D8();
		d12 = new D12();
		d20 = new D20();
		
		String[] maps = {};
		mapas = new JComboBox(maps);
		
		Integer[] nmrPlayers = {2, 3, 4, 5};
		jogadores = new JComboBox(nmrPlayers);
		jogadores.setBounds(290, 102, 45, 30);
		jogadores.addActionListener(this);
		jogadores.setSelectedItem(nmrPlayers[0]);
		
		Integer[] qtdDado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		comboDice = new JComboBox(qtdDado);
		comboDice.setBounds(270, 200, 45, 30);
		comboDice.addActionListener(this);
		comboDice.setSelectedItem(qtdDado[0]);
		
		menu.add(titulo);
		menu.add(qtdPlayer);
		menu.add(mapSelector);
		menu.add(dados);
		menu.add(d4);
		menu.add(d6);
		menu.add(d8);
		menu.add(d12);
		menu.add(d20);
		menu.add(jogadores);
		menu.add(comboDice);
		
		background = new JLayeredPane();
		background.setBounds(0, 0, 1550, 878);
		
		background.add(fundo, JLayeredPane.DEFAULT_LAYER);
		background.add(menu, JLayeredPane.DEFAULT_LAYER);
		background.add(j1, JLayeredPane.DRAG_LAYER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setSize(500, 500);
		this.setResizable(true);
		
		this.add(background);
		this.setUndecorated(false);
		this.setExtendedState(6);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX());
		System.out.println(e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == comboDice) {
			resultado =  (int) comboDice.getSelectedItem();
		}
	}
	
}
