import javax.swing.JPanel;
import java.awt.Graphics;

public class MyPanel extends JPanel {
	
	boolean [] [] grid ;
	
	public MyPanel( boolean[][] newGrid ) { 
		grid = newGrid ;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g) ;
		
		int boxWidth = this.getWidth() / grid.length ;
		
		for ( int i = 0 ; i < grid.length+1; i++) {
			g.drawLine(i * boxWidth, 0 , i * boxWidth, this.getHeight() );
		}
		
		for ( int i = 0 ; i < grid.length+1; i++) {
			g.drawLine(0, this.getHeight() - (  i * boxWidth ), this.getWidth(), this.getHeight() - (  i * boxWidth ) );
		}
		
		
		
	}
}