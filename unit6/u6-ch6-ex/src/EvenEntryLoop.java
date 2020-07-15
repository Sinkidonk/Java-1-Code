import java.util.Scanner;
import javax.swing.JOptionPane;
public class EvenEntryLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		int x = 0;
		while(x != 999)
		{
			x = ValidationHelper.getInt("Please input 999 to Exit");
			
			if ( x % 2 == 0)
			{
				JOptionPane.showMessageDialog(null, "Good Job!");
			}else if( x == 999)
			{
				JOptionPane.showMessageDialog(null, "Exit!");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Error please input another number");
			}
			
		}
	}
}


