import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D8 extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JLabel d8;
	protected JButton dado;
	protected int resultado;
	protected Random aleatorio;
	D8() {
		
		this.setBounds(340, 250, 90, 117);
		this.setLayout(null);
		this.setBackground(Color.black);
		
		d8 = new JLabel();
		d8.setBounds(0, 90, 90, 30);
		d8.setOpaque(true);
		d8.setFont(new Font("Arial", Font.PLAIN, 30));
		d8.setHorizontalAlignment(JLabel.CENTER);
		d8.setBackground(Color.white);
		
		dado = new JButton();
		dado.setBounds(0, 0, 90, 90);
		dado.setHorizontalTextPosition(JButton.RIGHT);
		dado.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Tabuleirov2\\src\\files\\dice\\d8-70.png"));
		dado.addActionListener(this);
		dado.setFocusable(false);
		
		this.add(dado);
		this.add(d8);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		aleatorio = new Random();
		resultado = aleatorio.nextInt((7) + 1) + 1;
		d8.setText(Integer.toString(resultado*Frame.resultado));
	}

}
