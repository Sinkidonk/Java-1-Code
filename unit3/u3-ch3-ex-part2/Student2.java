import java.util.Scanner;
import javax.swing.JOptionPane;
public class Student2 {

	
	public static int getID(int id) {
      return id;
   
	}
	
	public static int getCredit(int credit) {
		return credit;
		
	}
	
	public static int getPoint(int pointEarn) {
		return pointEarn;
	}
	//Integer.parseInt(
	public static int getGPA(int p, int c) {
   System.out.println(p + "");
   System.out.println(c + "");
		int gpa = (c*4) / p;
		return gpa;
	}
}