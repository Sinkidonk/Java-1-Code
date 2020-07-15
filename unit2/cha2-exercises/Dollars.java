import java.util.Scanner;
import javax.swing.JOptionPane;
public class Dollars
{
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in);
		int totalDollars = 0;
		String dollarsInput = JOptionPane.showInputDialog(null, "Enter the total number dollars you want to convet (Full number only please): ");
		totalDollars = Integer.parseInt(dollarsInput);
		
		int total20Bills = 0;
		
		while (totalDollars >= 20) 
		{
			totalDollars = totalDollars - 20;
			total20Bills = total20Bills + 1;
		}
		
		int total10Bills = 0;
		
		while (totalDollars >= 10)
		{
			totalDollars = totalDollars - 10;
			total10Bills = total10Bills + 1;
		}
		
		int total5Bills = 0;
		
		while (totalDollars >= 5)
		{
			totalDollars = totalDollars - 5;
			total5Bills = total5Bills + 1;
		}
		
		int total1Bills = 0;
		
		while (totalDollars >= 1)
		{
			totalDollars = totalDollars - 1;
			total1Bills = total1Bills + 1;
		}
		
		JOptionPane.showMessageDialog(null, "You have an total of "
		+ total20Bills + " $20 dollars bills "
		+ total10Bills + " $10 dollars bills "
		+ total5Bills + " $5 dollars bills "
		+ total1Bills + " $1 dollars bills");
	}
}
/* 
import java.util.Scanner;
public class Dollars
{
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in);
		int totalDollars = 0;
		
		System.out.println("Enter the total number dollars you want to convet (Full number only please): ");
		totalDollars = inputDevice.nextInt();
		
		int total20Bills = 0;
		
		while (totalDollars > 20) 
		{
			totalDollars = totalDollars - 20;
			total20Bills = total20Bills + 1;
		}
		
		int total10Bills = 0;
		
		while (totalDollars > 10)
		{
			totalDollars = totalDollars - 10;
			total10Bills = total10Bills + 1;
		}
		
		int total5Bills = 0;
		
		while (totalDollars > 5)
		{
			totalDollars = totalDollars - 5;
			total5Bills = total5Bills + 1;
		}
		
		int total1Bills = 0;
		
		while (totalDollars > 1)
		{
			totalDollars = totalDollars - 1;
			total1Bills = total1Bills + 1;
		}
		
		System.out.println("You have an total of "
		+ total20Bills + " $20 dollars bills "
		+ total10Bills + " $10 dollars bills "
		+ total5Bills + " $5 dollars bills "
		+ total1Bills + " $1 dollars bills");
	}
} */

		