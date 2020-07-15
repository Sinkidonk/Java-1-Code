import java.util.Scanner;
import javax.swing.JOptionPane;
public class InchesToFeet
{
	public static void main(String[] args)
	{
		final int INCHES_IN_FEETS = 12;
		int inches = 0;
		
		int totalInches = 0;
		int totalFeets = 0;
		
		Scanner inputDevice = new Scanner(System.in);
		String inchesInput = JOptionPane.showInputDialog(null, "Please enter your inches that you want to convert to feet and inches: ");
		inches = Integer.parseInt(inchesInput);
		
		totalFeets = inches/INCHES_IN_FEETS;
		totalInches = inches%INCHES_IN_FEETS;
		
		JOptionPane.showMessageDialog(null, "Feets: " + totalFeets + " Inches: " + totalInches);
		
		
	}
}
		