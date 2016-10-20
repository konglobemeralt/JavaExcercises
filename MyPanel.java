import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class MyPanel extends JPanel {
	
	boolean [] [] grid ;
	
	public MyPanel( boolean[][] newGrid ) { 
		grid = newGrid ;
	}
	
	public void setGrid(boolean[][] newGrid){
			grid = newGrid ;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g) ;
		
		double boxWidth = this.getWidth() / grid.length ;
		double boxHeight = this.getHeight() / grid.length ;
		
		
		//Draw fill
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
					if (grid[i][j] == true) {
						g.setColor(Color.BLUE) ;
						g.fillRect((int)( i * boxWidth), (int)(j * boxHeight), (int)(boxWidth), (int)(boxHeight));
					}
			}
		}
		
		
	//Draw vertical	
	for ( int i = 0 ; i < grid.length+1; i++) {
		g.drawLine((int)( i * boxWidth ), 0 , (int)( i * boxWidth ), this.getHeight() );
		
	}
	
	//Draw horizontal
	for ( int i = 0 ; i < grid.length+1; i++) {
		g.drawLine(0 , (int)( i * boxHeight ), this.getWidth(), (int)( i * boxHeight ) );
		
	}

	
	
	
	
	}
}