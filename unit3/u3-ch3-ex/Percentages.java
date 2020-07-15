import java.util.Scanner;
import javax.swing.JOptionPane;
public class Percentages {
	public static void main(String[] args) {
		
		double num1 = getDouble();
		double num2 = getDouble();
		computePercent(num1, num2);
		computePercent(num2, num1);
		
	}
	
	public static double getDouble() {
		
		String userInputs = JOptionPane.showInputDialog(null, "Please enter an double");
		return Double.parseDouble(userInputs);
		
	}
	
	public static void computePercent(double num1, double num2) {
		double results = (num1/num2)*100;
		displayMsg((num1 + " is " + results + " of " + num2));

	}
	
	public static void displayMsg(String msg) {
		
		JOptionPane.showMessageDialog(null, msg);
	}

}