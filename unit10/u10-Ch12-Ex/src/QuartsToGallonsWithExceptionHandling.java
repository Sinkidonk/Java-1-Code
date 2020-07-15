import java.util.Scanner;
import javax.swing.JOptionPane;
public class QuartsToGallonsWithExceptionHandling {
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in);
		final int QUARTS_IN_GALLON = 4;
		int quartsNeeded = 0;
		int gallons = 0, quarts = 0;
		quartsNeeded = IntValidationHelper.getInt("How many quarts do you need:");
		//String quartsInput = JOptionPane.showInputDialog(null, "How many quarts do you need: ");
		//quartsNeeded = Integer.parseInt(quartsInput);
		gallons = quartsNeeded/QUARTS_IN_GALLON;
		quarts = quartsNeeded % QUARTS_IN_GALLON;
		JOptionPane.showMessageDialog(null, "We need " + gallons + " gallons, and " + quarts + " quarts");
		}
}