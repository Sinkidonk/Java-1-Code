import java.util.Scanner;
import javax.swing.JOptionPane;
public class BookstoreCredit {
	public static void main(String[] args) {
		
		String name = getName();
		double GPA = getGPA();
		calc(name, GPA);
		
	}
	
	public static String getName() {
		
		String userName = JOptionPane.showInputDialog(null, "Please enter your name");
		return userName;
	}
	
	public static double getGPA() {
		
		String GPA = JOptionPane.showInputDialog(null, "Please enter your GPA");
		return Double.parseDouble(GPA);
		
	}
	
	public static void calc(String name, double GPA) {
		double total = GPA * 10;
		displayMsg((name + " your GPA is " + GPA + " you earn $" + total));
		
	}
	
	public static void displayMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
}