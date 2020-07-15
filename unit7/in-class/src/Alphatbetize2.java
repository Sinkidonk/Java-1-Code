import javax.swing.JOptionPane;
public class Alphatbetize2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = JOptionPane.showInputDialog(null, "Please enter a Sting");
		String input2 = JOptionPane.showInputDialog(null, "Please enter a Sting");
		String input3 = JOptionPane.showInputDialog(null, "Please enter a Sting");
		String swapValue = "";
		String msg = "The following:"
				+ "\n" + input1
				+ "\n" + input2
				+ "\n" + input3;
		
		//code will go here
		if(input1.compareToIgnoreCase(input2) > 0)
		{
			swapValue = input1;
			input1 = input2;
			input2 = swapValue;
			
		}
		if(input1.compareToIgnoreCase(input3) > 0)
		{
			swapValue = input1;
			input1 = input3;
			input3 = swapValue;
			
		}
		if(input2.compareToIgnoreCase(input3) > 0)
		{
			swapValue = input2;
			input2 = input3;
			input3 = swapValue;
			
		}
		
		
		msg += "\nare aplhabetized like this:"
				+ "\n" + input1
				+ "\n" + input2
				+ "\n" + input3;
		
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
