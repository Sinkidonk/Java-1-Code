import java.util.Scanner;
import javax.swing.JOptionPane;
public class Sandwich {
	public static void main(String[] args) {
		
		String main = getMain();
		String bread = getBread();
		double price = getPrice();
		
		JOptionPane.showMessageDialog(null, "you pick " + main + 
		" as your main ingredient, and you pick " 
		+ bread + " as your bread type, it will cost you $" + price);
		
		
	}
	
	public static String getMain() {
		
		String userInput = JOptionPane.showInputDialog(null, "Please enter your main ingredient");
		return userInput;
		
	}
	
	public static String getBread() {
		
		String userInput = JOptionPane.showInputDialog(null, "Please enter your type of Bread");
		return userInput;
		
	}
	
	public static double getPrice() {
		
		String userInput = JOptionPane.showInputDialog(null, "Please enter the Price");
		return Double.parseDouble(userInput);
		
	}
}