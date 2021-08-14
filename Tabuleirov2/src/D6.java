import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D6 extends JPanel implements ActionListener, Dados {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel d6;
	JButton dado;
	Random aleatorio;
	int resultado;
	D6() {
		
		this.setBounds(240, 250, 120, 160);
		this.setLayout(null);
		this.setBackground(Color.black);
		
		d6 = new JLabel();
		d6.setBounds(0, 90, 120, 70);
		d6.setOpaque(true);
		d6.setFont(new Font("Arial", Font.PLAIN, 30));
		d6.setHorizontalAlignment(JLabel.CENTER);
		d6.setBackground(Color.white);
		
		dado = new JButton();
		dado.setBounds(0, 0, 120, 90);
		dado.setHorizontalTextPosition(JButton.RIGHT);
		dado.setIcon(new ImageIcon(getClass().getResource("/files/dice/d6-70.png")));
		dado.addActionListener(this);
		dado.setFocusable(false);
		
		this.add(dado);
		this.add(d6);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		exibeDado(d6, 6);
	}

	@Override
	public int jogarDado(int numeroLados) {
		aleatorio = new Random();
		resultado = aleatorio.nextInt((numeroLados-1) + 1) + 1;
		return resultado;
	}

	@Override
	public void exibeDado(JLabel dado, int numeroLados) {
		switch (Frame.resultado) {
			case 1:
				dado.setFont(new Font("Arial", Font.PLAIN, 30));
				dado.setText("<html>" + Integer.toString(jogarDado(numeroLados)) + "</html>");
				break;
			case 2:
				dado.setFont(new Font("Arial", Font.PLAIN, 30));
				dado.setText("<html>" + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + "</html>");
				break;
			case 3:
				dado.setFont(new Font("Arial", Font.PLAIN, 30));
				dado.setText("<html>" + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + 
				Integer.toString(jogarDado(numeroLados)) + "</html>");
				break;
			case 4:
				dado.setFont(new Font("Arial", Font.PLAIN, 20));
				dado.setText("<html>" + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + 
				Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + "</html>");
				break;
			case 5:
				dado.setFont(new Font("Arial", Font.PLAIN, 20));
				dado.setText("<html>" + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + 
				Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + "</html>");
				break;
			case 6:
				dado.setFont(new Font("Arial", Font.PLAIN, 20));
				dado.setText("<html>" + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + 
				Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + 
				" + " + Integer.toString(jogarDado(numeroLados)) + "</html>");
				break;
			case 7:
				dado.setFont(new Font("Arial", Font.PLAIN, 20));
				dado.setText("<html>" + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + 
				Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + 
				" + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + "</html>");
				break;
			case 8:
				dado.setFont(new Font("Arial", Font.PLAIN, 20));
				dado.setText("<html>" + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + 
				Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + 
				" + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) 
				+ "</html>");
				break;
			case 9:
				dado.setFont(new Font("Arial", Font.PLAIN, 15));
				dado.setText("<html>" + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + 
				Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + 
				" + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) 
				+ " + " + Integer.toString(jogarDado(numeroLados)) + "</html>");
				break;
			case 10:
				dado.setFont(new Font("Arial", Font.PLAIN, 15));
				dado.setText("<html>" + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + 
				Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + 
				" + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) 
				+ " + " + Integer.toString(jogarDado(numeroLados)) + " + " + Integer.toString(jogarDado(numeroLados)) + "</html>");
				break;
	}
	}

}
