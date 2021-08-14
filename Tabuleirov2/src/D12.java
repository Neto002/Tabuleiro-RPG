import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D12 extends JPanel implements ActionListener, Dados {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JLabel d12;
	protected JButton dado;
	protected int resultado;
	protected Random aleatorio;
	D12() {
		
		this.setBounds(520, 250, 120, 160);
		this.setLayout(null);
		this.setBackground(Color.black);
		
		d12 = new JLabel();
		d12.setBounds(0, 90, 120, 70);
		d12.setOpaque(true);
		d12.setFont(new Font("Arial", Font.PLAIN, 30));
		d12.setHorizontalAlignment(JLabel.CENTER);
		d12.setBackground(Color.white);
		
		dado = new JButton();
		dado.setBounds(0, 0, 120, 90);
		dado.setHorizontalTextPosition(JButton.RIGHT);
		dado.setIcon(new ImageIcon(getClass().getResource("/files/dice/d12-70.png")));;
		dado.addActionListener(this);
		dado.setFocusable(false);
		
		this.add(dado);
		this.add(d12);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		exibeDado(d12, 12);
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
