import java.util.Scanner;
import javax.swing.JOptionPane;
public class ShowStudent2 {
	public static void main(String[] args) {
		Student2 student = new Student2();

		int idNum = student.getID(9999);
		int creditHour = student.getCredit(3);
		int point = student.getPoint(12);
		int gpa = student.getGPA(point, creditHour);
		
		JOptionPane.showMessageDialog(null, "Student " + idNum + " you earn "
       + point + " points and your GPA is " + gpa);
		
		
	}
}