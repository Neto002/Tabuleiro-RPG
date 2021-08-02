import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D20 extends JPanel implements ActionListener {

	protected JLabel d20;
	protected JButton dado;
	protected int resultado;
	protected Random aleatorio;
	D20() {
		
		this.setBounds(580, 250, 90, 117);
		this.setLayout(null);
		this.setBackground(Color.black);
		
		d20 = new JLabel();
		d20.setBounds(0, 90, 90, 30);
		d20.setOpaque(true);
		d20.setFont(new Font("Arial", Font.PLAIN, 30));
		d20.setHorizontalAlignment(JLabel.CENTER);
		d20.setBackground(Color.white);
		
		dado = new JButton();
		dado.setBounds(0, 0, 90, 90);
		dado.setHorizontalTextPosition(JButton.RIGHT);
		dado.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Tabuleiro(Tentativa)\\src\\files\\d20-70.png"));
		dado.addActionListener(this);
		dado.setFocusable(false);
		
		this.add(dado);
		this.add(d20);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		aleatorio = new Random();
		resultado = aleatorio.nextInt((19) + 1) + 1;
		d20.setText(Integer.toString(resultado*Frame.resultado));
	}

}
