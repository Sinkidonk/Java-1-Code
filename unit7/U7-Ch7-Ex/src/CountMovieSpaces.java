import javax.swing.*;
public class CountMovieSpaces {
	public static void main(String[] args) {
		String movieQuote = JOptionPane.showInputDialog(null, "Please enter your movie quote");
		
		JOptionPane.showMessageDialog(null,"The total number of spaces are " 
		+ countSpaces(movieQuote));
		
	}
	
	
	
	static int countSpaces(String string) {
	    int spaces = 0;
	    for(int i = 0; i < string.length(); i++) {
	        spaces += (Character.isWhitespace(string.charAt(i))) ? 1 : 0;
	    }
	    return spaces;
	}
}
