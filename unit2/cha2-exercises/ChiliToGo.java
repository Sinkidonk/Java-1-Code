import java.util.Scanner;
import javax.swing.JOptionPane;
public class ChiliToGo
{
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in);
		final int ADULT_MEAL = 7;
		final int CHILD_MEAL = 4;
		
		int totalAdultMeal = 0;
		int totalChildMeal = 0;
		int totalAdultMealPrice = 0;
		int totalChildMealPrice = 0;
		int totalPrice = 0;
		String adultMealInput = JOptionPane.showInputDialog(null, "Please enter the total number of Adult Meals that you want: ");
		totalAdultMeal = Integer.parseInt(adultMealInput);
		String childMealInput = JOptionPane.showInputDialog(null, "Please enter the total number of Children Meals that you want: ");
		totalChildMeal = Integer.parseInt(childMealInput);
		
		
		totalAdultMealPrice = totalAdultMeal * ADULT_MEAL;
		totalChildMealPrice = totalChildMeal * CHILD_MEAL;
		totalPrice = totalAdultMealPrice + totalChildMealPrice;
		
		JOptionPane.showMessageDialog(null, "The total price for your adult meals is $"
		+ totalAdultMealPrice + " and your total price for the children meals is $"
		+ totalChildMealPrice + "\nGiving you an grand total cost of $"
		+ totalPrice);
		
		
	}
}
/* 
import java.util.Scanner;
public class ChiliToGo
{
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in);
		final int ADULT_MEAL = 7;
		final int CHILD_MEAL = 4;
		
		int totalAdultMeal = 0;
		int totalChildMeal = 0;
		int totalAdultMealPrice = 0;
		int totalChildMealPrice = 0;
		int totalPrice = 0;
		
		System.out.println("Please enter the total number of Adult Meals that you want: ");
		totalAdultMeal = inputDevice.nextInt();
		System.out.println("Please enter the total number of Children Meals that you want: ");
		totalChildMeal = inputDevice.nextInt();
		
		
		totalAdultMealPrice = totalAdultMeal * ADULT_MEAL;
		totalChildMealPrice = totalChildMeal * CHILD_MEAL;
		totalPrice = totalAdultMealPrice + totalChildMealPrice;
		
		System.out.println("The total price for your adult meals is $"
		+ totalAdultMealPrice + " and your total price for the children meals is $"
		+ totalChildMealPrice + "\nGiving you an grand total cost of $"
		+ totalPrice);
		
		
	}
}
 */