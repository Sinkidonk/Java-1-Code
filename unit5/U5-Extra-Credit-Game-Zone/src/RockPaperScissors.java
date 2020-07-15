import java.util.Random;//Needed so we can create the object Random
import javax.swing.JOptionPane;
public class RockPaperScissors
{
   public static void main(String[] args)
   {
	   String userInput = JOptionPane.showInputDialog(null, "Pick Rock, Paper," 
		+ "or Scissors");
	   /*
	   if(userInput == "Rock")
	   {
		   userInput = "1";
	   } else if(userInput == "Paper")
	   {
		   userInput = "2";
	   } else if(userInput == "Scissors")
	   {
		   userInput = "3";
	   }
	   */
		int userChoice = Integer.parseInt(userInput);
		int computerChoice = getRandomNumber(3);
		System.out.println(getStringValue(userChoice) + " "
			+ getStringValue(computerChoice));
         String message = "You picked " 
			+ getStringValue(userChoice) + "\nComputer picked "
			+ getStringValue(computerChoice) + "\n";
			
         if(userChoice == computerChoice)
         {
            JOptionPane.showMessageDialog(null, "You picked " 
			+ getStringValue(userChoice) + "\nComputer picked "
			+ getStringValue(computerChoice)
			+ "\nIt was a tie!");
         } else {
			 switch(userChoice)
			 {
				 case 1:
					if(computerChoice == 2)
					{
						message += "You lost!";
					}
					else
					{
						message += "You win!";
					}
				break;
				case 2:
					if(computerChoice == 3)
					{
						message += "You lost!";
					}
					else
					{
						message += "You win!";
					}
				break;
				case 3:
					if(computerChoice == 1)
					{
						message += "You lost!";
					}
					else
					{
						message += "You win!";
					}
				break;
				default:
					message += "You win!";
				break;
			 }
			 
			 JOptionPane.showMessageDialog(null, message);
		 }
   }
   
   public static int getRandomNumber(int maxNum)
   {
      Random ran = new Random();
      //This will get a number between 0 and maxNum minus 1 (i.e. if maxNum is 3 the results could be 0,1,2)
      //We can add one to answer to return a more readable number
      return ran.nextInt(maxNum) + 1;
   }
   
   public static String getStringValue(int choice)
   {
	   switch(choice)
	   {
		   case 1:
		     return "Rock";
		   case 2:
			 return "Paper";
		   case 3:
		     return "Scissors";
		   default:
		     return "That didn't match the choice";
	   }
   }
}