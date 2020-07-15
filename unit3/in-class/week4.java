import javax.swing.JOptionPane;
public class week4 {
   public static void main(String[] args)
   {
      displayMsg("Your total with tax is " + calculateSalesTax(5.00, 0.5));
      
   }
    
   public static double calculateSalesTax(double price, double taxRate) 
   {
      
      return price * (1 + taxRate);
   }
   public static int addNumbers(int number1, int number2) 
   {
      
      return number1 + number2;
   }
   

   
   public static void displayMsg(String msg) {
      JOptionPane.showMessageDialog(null, msg);
   }
 }