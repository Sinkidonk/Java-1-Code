import java.util.Scanner;
import javax.swing.JOptionPane;
public class ShowStudent2 {
	public static void main(String[] args) {


		int idNum = 9999;
		int creditHour = 3;
		int point = 4;
		int gpa = (creditHour*4) / point;
		
		JOptionPane.showMessageDialog(null, "Student " + idNum + " you earn "
       + point + " points and your GPA is " + gpa);
		
		
	}
}