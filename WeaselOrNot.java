import java.util.Scanner;

public class WeaselOrNot {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner( System.in );
		String word;
		boolean yep, nope;
		
		System.out.println( "Please type the word \"Weasel\": " );
		word = keyboard.next();
		
		yep = "Weasel".equals( word ); //Possible to call string methods directly from string 
		nope = !word.equals( "Weasel" );
		
		System.out.println( "You typed what was requested: " + yep );
		System.out.println( "You misstyped: " + nope );
		}
}