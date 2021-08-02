import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D4 extends JPanel implements ActionListener {

	protected JLabel d4;
	protected JButton dado;
	protected Random aleatorio;
	protected int resultado;
	D4() {
		
		this.setBounds(100, 250, 90, 117);
		this.setLayout(null);
		this.setBackground(Color.black);
		
		d4 = new JLabel();
		d4.setBounds(0, 90, 90, 30);
		d4.setOpaque(true);
		d4.setFont(new Font("Arial", Font.PLAIN, 30));
		d4.setHorizontalAlignment(JLabel.CENTER);
		d4.setBackground(Color.white);
		
		dado = new JButton();
		dado.setBounds(0, 0, 90, 90);
		dado.setHorizontalTextPosition(JButton.RIGHT);
		dado.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Tabuleiro(Tentativa)\\src\\files\\d470.png"));
		dado.addActionListener(this);
		dado.setFocusable(false);
		
		this.add(dado);
		this.add(d4);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		aleatorio = new Random();
		resultado = aleatorio.nextInt((3) + 1) + 1;
		d4.setText(Integer.toString(resultado*Frame.resultado));
	}

}
