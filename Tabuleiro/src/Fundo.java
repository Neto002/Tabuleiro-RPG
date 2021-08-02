import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fundo extends JPanel {

	String path = "";
	Image background;
	
	Fundo(String caminho) {
		this.path = caminho;
		background = new ImageIcon(path).getImage();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(background, 0, 1, 736, 841, null);
		//repaint();
		
	}
	
	public void setFundo(String caminho) {
		background = new ImageIcon(caminho).getImage();
	}

}
