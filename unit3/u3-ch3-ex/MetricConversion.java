import java.util.Scanner;
import javax.swing.JOptionPane;
public class MetricConversion {
	public static void main(String[] args) {
		
		final double CENT_TO_INCH = 2.54;
		final double LITERS_TO_GALLON = 3.7854;
		
		String numberInput = JOptionPane.showInputDialog(null, "Please enter the centimeters and or Liters you want to converts");
		int number = Integer.parseInt(numberInput);
		
		computeGallon(LITERS_TO_GALLON, number);
		computeInch(CENT_TO_INCH, number);
		}
		
		
		public static void computeGallon(double inch, int num) {
			displayMsg("Liters to gallon " + (num / inch));
		}
		
		public static void computeInch(double cent, int num) {
			
			displayMsg("Centimeters to Inch " + (num / cent));
		}
		
		public static void displayMsg(String msg) {
			JOptionPane.showMessageDialog(null, msg);
		}

}