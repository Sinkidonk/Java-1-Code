import java.util.Scanner;
import javax.swing.JOptionPane;
public class ShowStudent {
	public static void main(String[] args) {
		Student student = new Student();

		int idNum = student.getID();
		int creditHour = student.getCredit();
		int point = student.getPoint();
		int gpa = student.getGPA(point, creditHour);
		
		JOptionPane.showMessageDialog(null, "Student " + idNum + " you earn "
       + point + " points and your GPA is " + gpa);
		
		
	}
}