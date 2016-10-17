import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class ConwaysLife implements MouseListener, ActionListener {
	
	final int WIDTH = 20 ;
	final int HEIGHT= 20 ;
	JFrame frame = new JFrame( "Game of life" ) ;
	boolean[][] grid = new boolean [WIDTH] [HEIGHT] ;
	MyPanel panel = new MyPanel( grid ) ;
	
	JButton step = new JButton( "Step" ) ;
	JButton start = new JButton( "Start" ) ;
	JButton stop = new JButton( "Stop" ) ;
	Container south = new Container() ;
	
	public ConwaysLife() {
		frame.setSize( 600, 600 ) ;
		frame.setLayout( new BorderLayout() ) ;
		frame.add( panel, BorderLayout.CENTER ) ;
		south.setLayout( new GridLayout( 1, 3));
		south.add(step);
		south.add(start);
		south.add(stop);
		frame.add(south, BorderLayout.SOUTH);
		//Add mouse listener for input.
		panel.addMouseListener( this );
		//Make frame visible and set exit on close.
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
		int row = Math.min( ev.getY() / ( panel.getHeight() / HEIGHT), HEIGHT -1 ) ;
		int col = Math.min( ev.getX() / ( panel.getWidth() / WIDTH ), WIDTH - 1) ;
		grid[col][row] = !grid[col][row];
		
		frame.repaint();	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(step) == true) {
			step();
		}
	}
	
	public void step() {
		for (int x = 0; x < grid.length; x++) {
			for(int y = 0; y < grid.length; y++) {
				int neighborCount = 0;
				if(y > 0 && grid[x][y-1] == true) {
					neighborCount++;
				}
				if(x > 0 && grid[x-1][y] == true) {
					neighborCount++;
				}
				//TODO add rest of neighbours 
				
				
			}
		}
	}
	
	
	
}