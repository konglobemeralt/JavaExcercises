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
		step.addActionListener(this);
		south.add(start);
		start.addActionListener(this);
		south.add(stop);
		stop.addActionListener(this);
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
		boolean[][] newGrid = new boolean[grid.length][grid.length];
		for (int x = 0; x < grid.length; x++) {
			for(int y = 0; y < grid.length; y++) {
				int neighborCount = 0;
			if(y > 0 && grid[x][y-1] == true) {		//Above
				neighborCount++;
			}
			if(y < grid.length - 1  && grid[x][y+1] == true) {	//beneath
				neighborCount++;
			}
			if ( y < grid.length - 1 && x < grid.length - 1 && grid[x + 1][ y +1] == true) { // down right
				neighborCount++;
			}
			if ( y > 0 && x < grid.length - 1 && grid[x + 1][ y -1] == true) { // up right
				neighborCount++;
			}
			if ( y < grid.length - 1 && x > 0 && grid[x - 1][ y +1] == true) { // down left
				neighborCount++;
			}
			if ( y > 0 && x > 0 && grid[x - 1][ y -1] == true) { // up left
				neighborCount++;
			}
			if(x < grid.length - 1 && grid[x+1][y] == true) { 	//Check to right
			neighborCount++;
			}
			if(x > 0 && grid[x-1][y] == true) { 	//Check to left
				neighborCount++;
			}
			
				
				if(grid[x][y] == true)	{
					if (neighborCount == 2 || neighborCount == 3) {
						newGrid[x][y] = true;
					}
					else {
						newGrid[x][y] = false;
					}
				}
				else { 
					if (neighborCount == 3) {
						newGrid[x][y] = true;
					}
					else{
						newGrid[x][y] = false;
					}
				}
			}
		}
		grid = newGrid;
		panel.setGrid(newGrid);
		frame.repaint();
	}
}