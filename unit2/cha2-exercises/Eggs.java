import java.util.Scanner;
import javax.swing.JOptionPane;
public class Eggs
{
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in);
		final double DOZEN_EGGS = 3.25;
		final double SINGLE_EGGS = 0.45;
		int totalEggs = 0;
		String eggsInput = JOptionPane.showInputDialog(null, "Please enter the number of eggs you would like: ");
		totalEggs = Integer.parseInt(eggsInput);
		int dozenCount = 0;
		int tempTotalEggs = totalEggs;
		double totalPrice = 0;
		
		while (tempTotalEggs >= 12) 
		{
			tempTotalEggs = tempTotalEggs - 12;
			dozenCount = dozenCount + 1;
		}
		totalPrice = dozenCount * DOZEN_EGGS + tempTotalEggs * SINGLE_EGGS;
		
		JOptionPane.showMessageDialog(null, "You order " + totalEggs + " eggs.\n That be "
		+ dozenCount + " dozen at " + DOZEN_EGGS + " per dozen and "
		+ tempTotalEggs + " loose eggs at 45 cents each for an total of "
		+ totalPrice);
		
	}
}
		