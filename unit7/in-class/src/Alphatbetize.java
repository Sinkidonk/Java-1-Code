import javax.swing.JOptionPane;
public class Alphatbetize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = JOptionPane.showInputDialog(null, "Please enter a Sting");
		String input2 = JOptionPane.showInputDialog(null, "Please enter a Sting");
		String input3 = JOptionPane.showInputDialog(null, "Please enter a Sting");
		boolean isAlpabetical = false;
		
		System.out.println(input1.compareTo(input2));
		
		if(input1.compareToIgnoreCase(input2) <= 0)
		{
			if(input2.compareToIgnoreCase(input3) <= 0)
			{
				isAlpabetical = true;
			}
		}
		
		if(isAlpabetical)
		{
			JOptionPane.showMessageDialog(null, "These are in alphabetical order");
			
		} else {
			JOptionPane.showMessageDialog(null, "These are not in alphabetical order");
		}
		
		
	}

}
