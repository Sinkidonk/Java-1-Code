import javax.swing.*;
 
public class DoubleValidationHelper
{
   public static double getDouble(String message)
   {
      boolean isValidated = false;
      double doubleOutput = 0;
   
      if(message == ""){
         message = "Enter an Double";
      }
      
      String doubleInput = JOptionPane.showInputDialog(null, message);
      
      do
      {
         try
         {
            doubleOutput = Integer.parseInt(doubleInput);
            isValidated = true;
         }
         catch (NumberFormatException e)
         {
            doubleInput = JOptionPane.showInputDialog(null, message + 
               "\n<html><font color='red'>Please Input an Double</font></html>");
         }
      } while(isValidated == false);
      
      return doubleOutput;
   }
    
}