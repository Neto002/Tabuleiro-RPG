import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Fundo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String path = "";
	Image background;
	
	/*Fundo(String caminho) {
		this.path = caminho;
		background = new ImageIcon(path).getImage();
	}*/
	
	Fundo() {
		try {
			background = ImageIO.read(getClass().getResource("/files/maps/hills-r.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(background, 0, 1, 736, 841, null);
		repaint();
		
	}
	
	public void setFundo(String caminho) {
		try {
			background = ImageIO.read(getClass().getResource(caminho));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
