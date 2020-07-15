import javax.swing.*;
 
public class ValidationHelper
{
   public static int getInt(String message)
   {
      boolean isValidated = false;
      int intOutput = 0;
   
      if(message == ""){
         message = "Enter an Integer";
      }
      
      String intInput = JOptionPane.showInputDialog(null, message);
      
      do
      {
         try
         {
            intOutput = Integer.parseInt(intInput);
            isValidated = true;
         }
         catch (NumberFormatException e)
         {
            intInput = JOptionPane.showInputDialog(null, message + 
               "\n<html><font color='red'>Please Input an Integer</font></html>");
         }
      } while(isValidated == false);
      
      return intOutput;
   }
    
}