import java.util.Scanner;

public class TryToParseDouble {
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		System.out.print("Enter a double value: ");
		String userInput = keyboard.nextLine();
		double userDouble = 0;
		String execptionMessage = "";
		
		try {
			userDouble = Double.parseDouble(userInput);
		} catch(NumberFormatException e) {
			execptionMessage = e.getMessage();
			userDouble = 0;
		} finally {
			if(!execptionMessage.isEmpty())
			{
				System.out.println("Error in the program, the number defaulted to "
						+ userDouble);
				System.out.println(execptionMessage);
			} else {
				System.out.println("The String has been converted to a double with the "
						+ "value of " + userDouble);
			}
		}
	}
}
