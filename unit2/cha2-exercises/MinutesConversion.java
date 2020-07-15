import java.util.Scanner;
import javax.swing.JOptionPane;
public class MinutesConversion
{
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in);
		final double NUMBER_MIN_IN_DAY = 1440;
		final double NUMBER_MIN_IN_HOURS = 60;
		
		int min = 0;
		double timeInDays = 0;
		double timeInHours = 0;
		String minInput = JOptionPane.showInputDialog(null, "Please enter your time in min");
		min = Integer.parseInt(minInput);
		
		timeInDays = min / NUMBER_MIN_IN_DAY;
		timeInHours = min / NUMBER_MIN_IN_HOURS;
		
		JOptionPane.showMessageDialog(null, "That is " + timeInDays +
		" Days or " + timeInHours + " Hours");
	}   
}
/* 
import java.util.Scanner;
public class MinutesConversion
{
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in);
		final double NUMBER_MIN_IN_DAY = 1440;
		final double NUMBER_MIN_IN_HOURS = 60;
		
		int min = 0;
		double timeInDays = 0;
		double timeInHours = 0;
		
		System.out.println("Please enter your time in min");
		min = inputDevice.nextInt();
		
		timeInDays = min / NUMBER_MIN_IN_DAY;
		timeInHours = min / NUMBER_MIN_IN_HOURS;
		
		System.out.println("That is " + timeInDays +
		" Days or " + timeInHours + " Hours");
	}   
}

 */