import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D12 extends JPanel implements ActionListener {

	protected JLabel d12;
	protected JButton dado;
	protected int resultado;
	protected Random aleatorio;
	D12() {
		
		this.setBounds(460, 250, 90, 117);
		this.setLayout(null);
		this.setBackground(Color.black);
		
		d12 = new JLabel();
		d12.setBounds(0, 90, 90, 30);
		d12.setOpaque(true);
		d12.setFont(new Font("Arial", Font.PLAIN, 30));
		d12.setHorizontalAlignment(JLabel.CENTER);
		d12.setBackground(Color.white);
		
		dado = new JButton();
		dado.setBounds(0, 0, 90, 90);
		dado.setHorizontalTextPosition(JButton.RIGHT);
		dado.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Tabuleiro(Tentativa)\\src\\files\\d12-70.png"));
		dado.addActionListener(this);
		dado.setFocusable(false);
		
		this.add(dado);
		this.add(d12);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		aleatorio = new Random();
		resultado = aleatorio.nextInt((11) + 1) + 1;
		d12.setText(Integer.toString(resultado*Frame.resultado));
	}

}
