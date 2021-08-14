import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D6 extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel d6;
	JButton dado;
	Random aleatorio;
	int resultado;
	D6() {
		
		this.setBounds(220, 250, 90, 117);
		this.setLayout(null);
		this.setBackground(Color.black);
		
		d6 = new JLabel();
		d6.setBounds(0, 90, 90, 30);
		d6.setOpaque(true);
		d6.setFont(new Font("Arial", Font.PLAIN, 30));
		d6.setHorizontalAlignment(JLabel.CENTER);
		d6.setBackground(Color.white);
		
		dado = new JButton();
		dado.setBounds(0, 0, 90, 90);
		dado.setHorizontalTextPosition(JButton.RIGHT);
		dado.setIcon(new ImageIcon(getClass().getResource("/files/dice/d6-70.png")));
		dado.addActionListener(this);
		dado.setFocusable(false);
		
		this.add(dado);
		this.add(d6);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		aleatorio = new Random();
		resultado = aleatorio.nextInt((5) + 1) + 1;
		d6.setText(Integer.toString(resultado*Frame.resultado));
	}

}
