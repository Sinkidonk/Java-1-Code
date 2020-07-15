import java.util.Random;
import javax.swing.*;
public class BabyNameComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = JOptionPane.showInputDialog(null, "Please enter first name");
		String name2 = JOptionPane.showInputDialog(null, "Please enter first name");
		String name3 = JOptionPane.showInputDialog(null, "Please enter first name");
		String[] names = new String[]{name1, name2, name3};
        for (int i = 0; i < 9; i++) {
            Random rand = new Random();
            int rand1 = rand.nextInt(3);
            System.out.println(names[rand.nextInt(3)] +
                    names[rand1] +
                    names[rand.nextInt(3)]);
        }
		
	}

}
