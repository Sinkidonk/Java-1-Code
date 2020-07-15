import java.util.Scanner;
import javax.swing.JOptionPane;
public class NauticalMiles 
{
	public static void main(String[] args)
	{
		final double NAUTICAL_MILES_IN_MILE = 1.150779;
		final double NAUTICAL_MILES_IN_KM = 1.852;
		double nauticalMiles = 0;
		Scanner inputDevice = new Scanner(System.in);
		String nauticalMilesInput = JOptionPane.showInputDialog(null, "Please enter your nauticalMiles: ");

		nauticalMiles = Double.parseDouble(nauticalMilesInput);
		
		
		
		double milesInNauticalMiles = 0;
		double kmInNauticalMiles = 0;
		
		milesInNauticalMiles = NAUTICAL_MILES_IN_MILE * nauticalMiles;
		kmInNauticalMiles = NAUTICAL_MILES_IN_KM * nauticalMiles;
		
		JOptionPane.showMessageDialog(null, "This is how many miles in an Nauical Mile: "
         + milesInNauticalMiles + 
		 "\nThis is how many KM is in an Nauical Mile: "
		 + kmInNauticalMiles + ".");
		 
	}
}
/* 
import java.util.Scanner;
public class NauticalMiles 
{
	public static void main(String[] args)
	{
		final double NAUTICAL_MILES_IN_MILE = 1.150779;
		final double NAUTICAL_MILES_IN_KM = 1.852;
		double nauticalMiles = 0;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Please enter your nauticalMiles");
		nauticalMiles = inputDevice.nextDouble();
		
		
		
		double milesInNauticalMiles = 0;
		double kmInNauticalMiles = 0;
		
		milesInNauticalMiles = NAUTICAL_MILES_IN_MILE * nauticalMiles;
		kmInNauticalMiles = NAUTICAL_MILES_IN_KM * nauticalMiles;
		
		System.out.println("This is how many miles in an Nauical Mile: "
         + milesInNauticalMiles + 
		 "\nThis is how many KM is in an Nauical Mile: "
		 + kmInNauticalMiles + ".");
		 
	}
}

 */