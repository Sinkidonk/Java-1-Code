import java.util.Scanner;
import javax.swing.JOptionPane;
public class NumberDemo {
   public static void main(String[] args) {
      int num1 = getInt(), num2 = getInt();
      displayTwiceTheNumber(num1);
      displayTwiceTheNumber(num2);
      displayNumberPlusFive(num1);
      displayNumberPlusFive(num2);
      displayNumberSquared(num1);
      displayNumberSquared(num2);
   }
   
   public static int getInt()
   {
      String userInputs = JOptionPane.showInputDialog(null, "Please enter an integer");
      return Integer.parseInt(userInputs);
   }
   /*
   public static double getDouble()
   {
      String userInputs = JOptionPane.showInputDialog(null, "Please enter an integer2");
      return Double.parseDouble(userInputs);
   }
   */
   public static void displayTwiceTheNumber(int number)
   {
      displayMsg((number + number) + "");
      //number*2
   }
   
   public static void displayNumberPlusFive(int number)
   {
      displayMsg((number + 5) + "");
   }
   public static void displayNumberSquared(int number)
   {
      displayMsg((number * number) + "");
   }
   public static void displayMsg(String message) {
      JOptionPane.showMessageDialog(null, message);
      
      
   }
}