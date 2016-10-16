import javax.swing.JPanel;
import java.awt.Graphics;

public class MyPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine( 10, 20, 300, 450 );
		
	}
}