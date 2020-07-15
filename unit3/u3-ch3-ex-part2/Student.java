import java.util.Scanner;
import javax.swing.JOptionPane;
public class Student {

	
	public static int getID() {
		
		String id = JOptionPane.showInputDialog(null, "Please enter your ID Number");
		return Integer.parseInt(id);
		
	}
	
	public static int getCredit() {
		String credit = JOptionPane.showInputDialog(null, "Please enter the Credit hour");
		return Integer.parseInt(credit);
		
	}
	
	public static int getPoint() {
		String pointEarn = JOptionPane.showInputDialog(null, "Please enter the Point");
		return Integer.parseInt(pointEarn);
	}
	
	public static int getGPA(int p, int c) {
   System.out.println(p + "");
   System.out.println(c + "");
		int gpa = (c*4) / p;
		return gpa;
	}
}