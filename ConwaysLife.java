import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class ConwaysLife implements MouseListener {
	
	final int WIDTH = 20 ;
	final int HEIGHT= 20 ;
	JFrame frame = new JFrame( "Game of life" ) ;
	boolean[][] grid = new boolean [WIDTH] [HEIGHT] ;
	MyPanel panel = new MyPanel( grid ) ;
	
	public ConwaysLife() {
		frame.setSize( 600, 600 ) ;
		frame.setLayout( new BorderLayout() ) ;
		frame.add( panel, BorderLayout.CENTER ) ;
		
		panel.addMouseListener( this );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE) ;
		frame.setVisible( true ) ;
	}

	public static void main( String[] args) {
		new ConwaysLife() ;		
	}
	
	public void mouseClicked(MouseEvent ev) {
		
	}
	
	public void mouseEntered(MouseEvent ev) {
		
	}
	
	public void mouseExited(MouseEvent ev) {
		
	}
	
	public void mousePressed(MouseEvent ev) {
		
	}
	
	public void mouseReleased(MouseEvent ev) {
		System.out.println( ev.getX() + "," + ev.getY()) ;
		int row = ev.getY() / ( panel.getHeight() / HEIGHT) ;
		int col = ev.getX() / ( panel.getWidth() / WIDTH );
		grid[row][col] = !grid[row][col];
	}
}