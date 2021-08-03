import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String path;
	private ImageIcon icon;
	
	Player(String path) {
		this.setPath(path);
		icon = new ImageIcon(path);
		this.setIcon(icon);
		this.setBounds(200, 113, 34, 48);
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}