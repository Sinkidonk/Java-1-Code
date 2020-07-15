import java.util.Scanner;
import javax.swing.JOptionPane;
public class QuartsToGallons {
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in);
		final int QUARTS_IN_GALLON = 4;
		int quartsNeeded = 0;
		int gallons = 0, quarts = 0;
		String quartsInput = JOptionPane.showInputDialog(null, "How many quarts do you need: ");
		quartsNeeded = Integer.parseInt(quartsInput);
		gallons = quartsNeeded/QUARTS_IN_GALLON;
		quarts = quartsNeeded % QUARTS_IN_GALLON;
		JOptionPane.showMessageDialog(null, "We need " + gallons + " gallons, and " + quarts + " quarts");
		}
}

/* 
import java.util.Scanner;
public class QuartsToGallons {
	public static void main(String[] args)
	{
		final int QUARTS_IN_GALLON = 4;
		int quartsNeeded = 0;
		int gallons = 0, quarts = 0;
		System.out.println("How many quarts do you need: ");
		
		Scanner inputDevice = new Scanner(System.in);
		quartsNeeded = inputDevice.nextInt();
		gallons = quartsNeeded/QUARTS_IN_GALLON;
		quarts = quartsNeeded % QUARTS_IN_GALLON;
		System.out.println("We need " + gallons + " gallons, and " + quarts + " quarts");
		}
}
 */