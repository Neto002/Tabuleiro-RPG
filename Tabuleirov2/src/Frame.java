import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	protected JLayeredPane background;
	protected Fundo fundo;
	protected Player j1;
	protected Player j2;
	protected Player j3;
	protected Player j4;
	protected Player j5;
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
	protected JComboBox<String> mapas;
	protected JComboBox<Integer> jogadores;
	protected JComboBox<Integer> comboDice;
	protected JButton p1;
	protected JButton p2;
	protected JButton p3;
	protected JButton p4;
	protected JButton p5;
	protected boolean p1Selected;
	protected boolean p2Selected = false;
	protected boolean p3Selected = false;
	protected boolean p4Selected = false;
	protected boolean p5Selected = false;
	protected JTextField nome1;
	protected JTextField nome2;
	protected JTextField nome3;
	protected JTextField nome4;
	protected JTextField nome5;
	protected static GraphicsDevice Gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
	protected static int largura = Gd.getDisplayMode().getWidth();
	protected static int altura = Gd.getDisplayMode().getHeight();
	
	Frame() {
		
		fundo = new Fundo();
		fundo.setBackground(Color.blue);
		fundo.setBounds(0, 0, 736, altura);
		fundo.addMouseListener(this);
		
		j1 = new Player("/files/player/player1/player1.png");
		j1.setBounds(268, 780, 34, 29);
		j1.setVisible(false);
		j1.setEnabled(false);
		
		j2 = new Player("/files/player/player2/player2.png");
		j2.setBounds(302, 780, 34, 29);
		j2.setVisible(false);
		j2.setEnabled(false);
		
		j3 = new Player("/files/player/player3/player3.png");
		j3.setBounds(336, 780, 34, 29);
		j3.setVisible(false);
		j3.setEnabled(false);
		
		j4 = new Player("/files/player/player4/player4.png");
		j4.setBounds(370, 780, 34, 29);
		j4.setVisible(false);
		j4.setEnabled(false);
		
		j5 = new Player("/files/player/player5/player5.png");
		j5.setBounds(404, 780, 34, 29);
		j5.setVisible(false);
		j5.setEnabled(false);
		
		menu = new JPanel();
		menu.setBounds(737, 0, largura, altura);
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
		
		String[] maps = {"Hills", "City", "Cavern Entrance", "Cavern Inside", "Spider Tomb"};
		mapas = new JComboBox<String>(maps);
		mapas.setBounds(200, 151, 130, 30);
		mapas.addActionListener(this);
		mapas.setSelectedItem(maps[0]);
		mapas.setFocusable(false);
		
		Integer[] nmrPlayers = {2, 3, 4, 5};
		jogadores = new JComboBox<Integer>(nmrPlayers);
		jogadores.setBounds(290, 102, 45, 30);
		jogadores.addActionListener(this);
		jogadores.setSelectedItem(null);
		jogadores.setFocusable(false);
		
		Integer[] qtdDado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		comboDice = new JComboBox<Integer>(qtdDado);
		comboDice.setBounds(270, 200, 45, 30);
		comboDice.addActionListener(this);
		comboDice.setSelectedItem(qtdDado[0]);
		comboDice.setFocusable(false);
		
		p1 = new JButton();
		p1.setBounds(100, 450, 90, 90);
		p1.setVisible(false);
		p1.setEnabled(false);
		p1.setFocusable(false);
		p1.setIcon(new ImageIcon(getClass().getResource("/files/player/player1/player1-70.png")));
		p1.addActionListener(this);
		
		p2 = new JButton();
		p2.setBounds(240, 450, 90, 90);
		p2.setVisible(false);
		p2.setEnabled(false);
		p2.setFocusable(false);
		p2.setIcon(new ImageIcon(getClass().getResource("/files/player/player2/player2-70.png")));
		p2.addActionListener(this);
		
		p3 = new JButton();
		p3.setBounds(380, 450, 90, 90);
		p3.setVisible(false);
		p3.setEnabled(false);
		p3.setFocusable(false);
		p3.setIcon(new ImageIcon(getClass().getResource("/files/player/player3/player3-70.png")));
		p3.addActionListener(this);
		
		p4 = new JButton();
		p4.setBounds(520, 450, 90, 90);
		p4.setVisible(false);
		p4.setEnabled(false);
		p4.setFocusable(false);
		p4.setIcon(new ImageIcon(getClass().getResource("/files/player/player4/player4-70.png")));
		p4.addActionListener(this);
		
		p5 = new JButton();
		p5.setBounds(660, 450, 90, 90);
		p5.setVisible(false);
		p5.setEnabled(false);
		p5.setFocusable(false);
		p5.setIcon(new ImageIcon(getClass().getResource("/files/player/player5/player5-70.png")));
		p5.addActionListener(this);
		
		nome1 = new JTextField("Player1");
		nome1.setBounds(100, 540, 90, 30);
		nome1.setFont(new Font("Arial", Font.PLAIN, 15));
		nome1.setForeground(Color.black);
		nome1.setEnabled(false);
		nome1.setVisible(false);
		
		nome2 = new JTextField("Player2");
		nome2.setBounds(240, 540, 90, 30);
		nome2.setFont(new Font("Arial", Font.PLAIN, 15));
		nome2.setForeground(Color.black);
		nome2.setEnabled(false);
		nome2.setVisible(false);
		
		nome3 = new JTextField("Player3");
		nome3.setBounds(380, 540, 90, 30);
		nome3.setFont(new Font("Arial", Font.PLAIN, 15));
		nome3.setForeground(Color.black);
		nome3.setEnabled(false);
		nome3.setVisible(false);
		
		nome4 = new JTextField("Player4");
		nome4.setBounds(520, 540, 90, 30);
		nome4.setFont(new Font("Arial", Font.PLAIN, 15));
		nome4.setForeground(Color.black);
		nome4.setEnabled(false);
		nome4.setVisible(false);
		
		nome5 = new JTextField("Player5");
		nome5.setBounds(660, 540, 90, 30);
		nome5.setFont(new Font("Arial", Font.PLAIN, 15));
		nome5.setForeground(Color.black);
		nome5.setEnabled(false);
		nome5.setVisible(false);
		
		menu.add(p1);
		menu.add(p2);
		menu.add(p3);
		menu.add(p4);
		menu.add(p5);
		menu.add(nome1);
		menu.add(nome2);
		menu.add(nome3);
		menu.add(nome4);
		menu.add(nome5);
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
		menu.add(mapas);
		
		background = new JLayeredPane();
		background.setBounds(0, 0, largura, altura);
		
		background.add(fundo, JLayeredPane.DEFAULT_LAYER);
		background.add(menu, JLayeredPane.DEFAULT_LAYER);
		background.add(j1, JLayeredPane.DRAG_LAYER);
		background.add(j2, JLayeredPane.DRAG_LAYER);
		background.add(j3, JLayeredPane.DRAG_LAYER);
		background.add(j4, JLayeredPane.DRAG_LAYER);
		background.add(j5, JLayeredPane.DRAG_LAYER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setSize(largura, altura);
		this.setTitle("RPG Map - Neto");
		this.setResizable(true);
		
		this.add(background);
		this.setUndecorated(false);
		this.setExtendedState(6);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Frame();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == 1) {
			if (p1Selected) {
				j1.setBounds(e.getX()-15, e.getY()-17, 34, 29);
			}
			if (p2Selected) {
				j2.setBounds(e.getX()-15, e.getY()-17, 34, 29);
			}
			if (p3Selected) {
				j3.setBounds(e.getX()-15, e.getY()-17, 34, 29);
			}
			if (p4Selected) {
				j4.setBounds(e.getX()-15, e.getY()-17, 34, 29);
			}
			if (p5Selected) {
				j5.setBounds(e.getX()-15, e.getY()-17, 34, 29);
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mapas) {
			if (mapas.getSelectedIndex() == 0) {
				fundo.setFundo("/files/maps/hills-r.jpg");
			} else if (mapas.getSelectedIndex() == 1) {
				fundo.setFundo("/files/maps/city-r.jpg");
			} else if (mapas.getSelectedIndex() == 2) {
				fundo.setFundo("/files/maps/cavern_entrance-r.jpg");
			} else if (mapas.getSelectedIndex() == 3) {
				fundo.setFundo("/files/maps/cavern_inside-r.jpg");
			} else if (mapas.getSelectedIndex() == 4) {
				fundo.setFundo("/files/maps/spider_tomb-r.jpg");
			}
		}
		if (e.getSource() == comboDice) {
			resultado =  (int) comboDice.getSelectedItem();
		}
		if (e.getSource() == jogadores) {
			if (jogadores.getSelectedIndex() == 0) {
				j1.setVisible(true);
				j2.setVisible(true);
				
				j1.setEnabled(true);
				j2.setEnabled(true);
				
				p1.setVisible(true);
				p1.setEnabled(true);
				
				p2.setVisible(true);
				p2.setEnabled(true);
				
				nome1.setEnabled(true);
				nome1.setVisible(true);
				
				nome2.setEnabled(true);
				nome2.setVisible(true);
				
			} else if (jogadores.getSelectedIndex() == 1) {
				j1.setVisible(true);
				j2.setVisible(true);
				j3.setVisible(true);
				
				j1.setEnabled(true);
				j2.setEnabled(true);
				j3.setEnabled(true);
				
				p1.setVisible(true);
				p1.setEnabled(true);
				
				p2.setVisible(true);
				p2.setEnabled(true);
				
				p3.setVisible(true);
				p3.setEnabled(true);
				
				nome1.setEnabled(true);
				nome1.setVisible(true);
				
				nome2.setEnabled(true);
				nome2.setVisible(true);
				
				nome3.setEnabled(true);
				nome3.setVisible(true);
				
			} else if (jogadores.getSelectedIndex() == 2) {
				j1.setVisible(true);
				j2.setVisible(true);
				j3.setVisible(true);
				j4.setVisible(true);
				
				j1.setEnabled(true);
				j2.setEnabled(true);
				j3.setEnabled(true);
				j4.setEnabled(true);
				
				p1.setVisible(true);
				p1.setEnabled(true);
				
				p2.setVisible(true);
				p2.setEnabled(true);
				
				p3.setVisible(true);
				p3.setEnabled(true);
				
				p4.setVisible(true);
				p4.setEnabled(true);
				
				nome1.setEnabled(true);
				nome1.setVisible(true);
				
				nome2.setEnabled(true);
				nome2.setVisible(true);
				
				nome3.setEnabled(true);
				nome3.setVisible(true);
				
				nome4.setEnabled(true);
				nome4.setVisible(true);
				
			} else if (jogadores.getSelectedIndex() == 3) {
				j1.setVisible(true);
				j2.setVisible(true);
				j3.setVisible(true);
				j4.setVisible(true);
				j5.setVisible(true);
				
				j1.setEnabled(true);
				j2.setEnabled(true);
				j3.setEnabled(true);
				j4.setEnabled(true);
				j5.setEnabled(true);
				
				p1.setVisible(true);
				p1.setEnabled(true);
				
				p2.setVisible(true);
				p2.setEnabled(true);
				
				p3.setVisible(true);
				p3.setEnabled(true);
				
				p4.setVisible(true);
				p4.setEnabled(true);
				
				p5.setVisible(true);
				p5.setEnabled(true);
				
				nome1.setEnabled(true);
				nome1.setVisible(true);
				
				nome2.setEnabled(true);
				nome2.setVisible(true);
				
				nome3.setEnabled(true);
				nome3.setVisible(true);
				
				nome4.setEnabled(true);
				nome4.setVisible(true);
				
				nome5.setEnabled(true);
				nome5.setVisible(true);
			}
		}
		
		if (e.getSource() == p1) {
			p1Selected = true;
			p2Selected = false;
			p3Selected = false;
			p4Selected = false;
			p5Selected = false;
			
			p1.setEnabled(false);
			p2.setEnabled(true);
			p3.setEnabled(true);
			p4.setEnabled(true);
			p5.setEnabled(true);
		}
		if (e.getSource() == p2) {
			p1Selected = false;
			p2Selected = true;
			p3Selected = false;
			p4Selected = false;
			p5Selected = false;
			
			p1.setEnabled(true);
			p2.setEnabled(false);
			p3.setEnabled(true);
			p4.setEnabled(true);
			p5.setEnabled(true);
		}
		if (e.getSource() == p3) {
			p1Selected = false;
			p2Selected = false;
			p3Selected = true;
			p4Selected = false;
			p5Selected = false;
			
			p1.setEnabled(true);
			p2.setEnabled(true);
			p3.setEnabled(false);
			p4.setEnabled(true);
			p5.setEnabled(true);
		}
		if (e.getSource() == p4) {
			p1Selected = false;
			p2Selected = false;
			p3Selected = false;
			p4Selected = true;
			p5Selected = false;
			
			p1.setEnabled(true);
			p2.setEnabled(true);
			p3.setEnabled(true);
			p4.setEnabled(false);
			p5.setEnabled(true);
		}
		if (e.getSource() == p5) {
			p1Selected = false;
			p2Selected = false;
			p3Selected = false;
			p4Selected = false;
			p5Selected = true;
			
			p1.setEnabled(true);
			p2.setEnabled(true);
			p3.setEnabled(true);
			p4.setEnabled(true);
			p5.setEnabled(false);
		}
	}
	
}
