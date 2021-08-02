import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {
	
	private String path;
	private ImageIcon icon;
	
	Player(String path) {
		this.path = path;
		icon = new ImageIcon(path);
		this.setIcon(icon);
		this.setBounds(200, 113, 34, 48);
	}
}