import java.awt.*;
import javax.swing.*;

public class ConwaysLife {
	
	final int WIDTH = 20;
	final int HEIGHT= 20;
	JFrame frame = new JFrame( "Game of life" );
	MyPanel panel = new MyPanel();
	
	public ConwaysLife() {
		frame.setSize( 600, 600 );
		frame.setLayout( new BorderLayout());
		frame.add( panel, BorderLayout.CENTER );
		
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		frame.setVisible( true );
	}

	public static void main( String[] args) {
		new ConwaysLife();		
	}
}