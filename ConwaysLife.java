import javax.swing.*;

public class ConwaysLife {
	
	JFrame frame = new JFrame( "Game of life" );
	MyPanel panel = new MyPanel();
	
	public ConwaysLife() {
		frame.setSize( 600, 600 );
		
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		frame.setVisible( true );
	}

	public static void main( String[] args) {
		new ConwaysLife();		
	}
}