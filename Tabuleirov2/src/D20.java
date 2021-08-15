import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D20 extends JPanel implements ActionListener, Dados {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JLabel d20;
	protected JButton dado;
	protected int resultado;
	protected Random aleatorio;
	D20() {
		
		this.setBounds(660, 250, 120, 160);
		this.setLayout(null);
		this.setBackground(Color.black);
		
		d20 = new JLabel();
		d20.setBounds(0, 90, 120, 70);
		d20.setOpaque(true);
		d20.setFont(new Font("Arial", Font.PLAIN, 30));
		d20.setHorizontalAlignment(JLabel.CENTER);
		d20.setBackground(Color.white);
		
		dado = new JButton();
		dado.setBounds(0, 0, 120, 90);
		dado.setHorizontalTextPosition(JButton.RIGHT);
		dado.setIcon(new ImageIcon(getClass().getResource("/files/dice/d20-70.png")));
		dado.addActionListener(this);
		dado.setFocusable(false);
		
		this.add(dado);
		this.add(d20);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		exibeDado(d20, 20);
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
