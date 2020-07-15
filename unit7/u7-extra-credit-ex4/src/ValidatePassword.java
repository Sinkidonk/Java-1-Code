import javax.swing.*;
public class ValidatePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exit = false;
		String password;
		int stringLength;
		int i;
		int uppercase = 0;
		int lowercase = 0;
		int digits = 0;
		char c;
		String finalMsg;
		while (!exit)
		{
			// Reset the variables back to default
			uppercase = 0;
			lowercase = 0;
			digits = 0;
			finalMsg = "The Password is ";
			
			password = JOptionPane.showInputDialog(null, "Please enter an password with at least\n"
					+ "Two lowercase letter\n"
					+ "Two uppercase letter\n"
					+ "and Two digits");
					
			stringLength = password.length();
			
			for(i = 0; i < stringLength; i++)
			{
				c = password.charAt(i);
				
				if(Character.isUpperCase(c))
				{
					uppercase = uppercase + 1;
				} else if(Character.isLowerCase(c))
				{
					lowercase = lowercase + 1;
				} else if(Character.isDigit(c))
				{
					digits = digits + 1;;
				}
			}
			
			if( (uppercase >= 2) && (lowercase >= 2) && (digits >= 2) )
			{
				exit = true;
				finalMsg += "Valid";
				
			} else if( (uppercase < 2) || (lowercase < 2) || (digits < 2) )
			{
				finalMsg += "Not Valid\n";
			}
			if(uppercase < 2)
			{
				finalMsg += "<html><font color='red'>You need to add at least two uppercase letters</font></html>\n";
			}
			if(lowercase < 2)
			{
				finalMsg += "<html><font color='red'>You need to add at least two lowercase letters</font></html>\n";
			}
			if(digits < 2)
			{
				finalMsg += "<html><font color='red'>You need to add at least two numbers</font></html>\n";
			}
			
			displayMsg(finalMsg);
		}
	}
	
	public static void displayMsg(String msg)
	{
		//System.out.println(msg);
		JOptionPane.showMessageDialog(null, msg);
	}

}
