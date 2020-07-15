import java.util.Scanner;

public class YourVoteCount {

		public static Scanner input = new Scanner(System.in);
		public static Question question[] = new Question[4];
		
		public static void main(String[] args) {
			createQuestions();
			displayMainMenu();
			int choice = getUserChoice();
			runSurvey(choice);
		}
		
		public static void displayMainMenu() 
		{
			System.out.println("");
			System.out.println("****************************");
			System.out.println("*       Main Menu          *");
			System.out.println("* ------------------------ *");
			System.out.println("* 1. Take the Survey       *");
			System.out.println("* 2. View Tallies          *");
			System.out.println("* 3. Edit Questions        *");
			System.out.println("* 4. Exit                  *");
			System.out.println("*                          *");
			System.out.println("****************************");
			System.out.println("");
		}
		
		public static int getUserChoice()
		{
			int userChoice = 0;
			while(userChoice < 1 || userChoice > 4 ) {
			System.out.println("Enter your selection >>");
			userChoice = input.nextInt();
			}
			return userChoice;
		}
		
		public static void runSurvey(int choice)
		{
			while(choice != 4) {
				switch(choice) {
				case 1:
					displaySurvey();
					displayMainMenu();
					choice = getUserChoice();
					break;
				case 2:
					for(int i = 0; i < 4; i++) {
					System.out.println(question[i].getQuestion());
					question[i].displayTallies();
					}
					displayMainMenu();
					choice = getUserChoice();
					break;
				case 3:
					displayEditMenu();
					displayMainMenu();
					choice = getUserChoice();
					break;
				}
				
			}
			System.out.println("");
			System.out.println("███████╗ █████╗ ██████╗ ███████╗██╗    ██╗███████╗██╗     ██╗         ");
			System.out.println("██╔════╝██╔══██╗██╔══██╗██╔════╝██║    ██║██╔════╝██║     ██║         ");
			System.out.println("█████╗  ███████║██████╔╝█████╗  ██║ █╗ ██║█████╗  ██║     ██║         ");
			System.out.println("██╔══╝  ██╔══██║██╔══██╗██╔══╝  ██║███╗██║██╔══╝  ██║     ██║         ");
			System.out.println("██║     ██║  ██║██║  ██║███████╗╚███╔███╔╝███████╗███████╗███████╗    ");
			System.out.println("╚═╝     ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝ ╚══╝╚══╝ ╚══════╝╚══════╝╚══════╝    ");
			System.out.println("");
			                                                                      

		}
		

		private static void displaySurvey() {
			for(int i = 0; i < 4; i++) {
			System.out.println(question[i].getQuestion());
			System.out.println(question[i].getAnswers1());
			System.out.println(question[i].getAnswers2());
			System.out.println(question[i].getAnswers3());
			System.out.println(question[i].getAnswers4());
			int choice = getUserChoice();
			question[i].addToTotal(choice);
			}
		}
		
		private static void displayEditMenu() {
			//boolean validate = validateUser();
			Scanner put = new Scanner(System.in);
			String setQA;
			
			System.out.println("What Question, and Answers, do you want to edit");
			System.out.println("Do you want to edit Question and Answers for 1, 2, 3, or 4");
			int choice = getUserChoice();
			int choiceI = choice - 1;
			
			switch(choice) {
			case 1:
				System.out.println("Old Choice with old Answers are");
				System.out.println(question[choiceI].getQuestion());
				System.out.println(question[choiceI].getAnswers1());
				System.out.println(question[choiceI].getAnswers2());
				System.out.println(question[choiceI].getAnswers3());
				System.out.println(question[choiceI].getAnswers4());
				System.out.println("Please enter your new Questions, and Answers");
				
				System.out.println("Enter in your new Question");
				setQA = put.nextLine();
				question[choiceI].setQuestion(setQA);
				
				System.out.println("Enter in your new First Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers1(setQA);
				
				System.out.println("Enter in your new Second Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers2(setQA);
				
				System.out.println("Enter in your new Third Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers3(setQA);
				
				System.out.println("Enter in your new Fourth Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers4(setQA);
				break;
			case 2:
				System.out.println("Old Choice with old Answers are");
				System.out.println(question[choiceI].getQuestion());
				System.out.println(question[choiceI].getAnswers1());
				System.out.println(question[choiceI].getAnswers2());
				System.out.println(question[choiceI].getAnswers3());
				System.out.println(question[choiceI].getAnswers4());
				System.out.println("Please enter your new Questions, and Answers");
				
				System.out.println("Enter in your new Question");
				setQA = put.nextLine();
				question[choiceI].setQuestion(setQA);
				
				System.out.println("Enter in your new First Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers1(setQA);
				
				System.out.println("Enter in your new Second Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers2(setQA);
				
				System.out.println("Enter in your new Third Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers3(setQA);
				
				System.out.println("Enter in your new Fourth Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers4(setQA);
				break;
			case 3:
				System.out.println("Old Choice with old Answers are");
				System.out.println(question[choiceI].getQuestion());
				System.out.println(question[choiceI].getAnswers1());
				System.out.println(question[choiceI].getAnswers2());
				System.out.println(question[choiceI].getAnswers3());
				System.out.println(question[choiceI].getAnswers4());
				System.out.println("Please enter your new Questions, and Answers");
				
				System.out.println("Enter in your new Question");
				setQA = put.nextLine();
				question[choiceI].setQuestion(setQA);
				
				System.out.println("Enter in your new First Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers1(setQA);
				
				System.out.println("Enter in your new Second Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers2(setQA);
				
				System.out.println("Enter in your new Third Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers3(setQA);
				
				System.out.println("Enter in your new Fourth Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers4(setQA);
				break;
			case 4:
				System.out.println("Old Choice with old Answers are");
				System.out.println(question[choiceI].getQuestion());
				System.out.println(question[choiceI].getAnswers1());
				System.out.println(question[choiceI].getAnswers2());
				System.out.println(question[choiceI].getAnswers3());
				System.out.println(question[choiceI].getAnswers4());
				System.out.println("Please enter your new Questions, and Answers");
				
				System.out.println("Enter in your new Question");
				setQA = put.nextLine();
				question[choiceI].setQuestion(setQA);
				
				System.out.println("Enter in your new First Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers1(setQA);
				
				System.out.println("Enter in your new Second Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers2(setQA);
				
				System.out.println("Enter in your new Third Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers3(setQA);
				
				System.out.println("Enter in your new Fourth Answer");
				setQA = put.nextLine();
				question[choiceI].setAnswers4(setQA);
				break;
			}
			
			
			
		}
/*
		private static boolean validateUser() {
			String password = "iLoveDogs";
			String tryPassword;
			boolean truePassword = false;
			for(int i = 0; i < 3; i++)
			{
				System.out.println("Enter in your password: ");
				tryPassword = input.nextLine();
				if(Objects.equals(tryPassword, new String(password)))
				{
					i = 5;
					truePassword = true;
				}else if(password != tryPassword && i > 3){
					displayMainMenu();
					int choice = getUserChoice();
					truePassword = false;
				}
			}
			
			return truePassword;
		}
		*/

		private static void createQuestions()
		{
			Question ques1 = new Question();
			Question ques2 = new Question();
			Question ques3 = new Question();
			Question ques4 = new Question();
			
			question[0] = ques1;
			question[1] = ques2;
			question[2] = ques3;
			question[3] = ques4;
			
			
			String Question1 = "What is your favorite brand of cereal?";
			String Q1Answers1 = "1. Captain Crunch";
			String Q1Answers2 = "2. Cracklin Oats";
			String Q1Answers3 = "3. Lucky Charms";
			String Q1Answers4 = "4. Honey Nut Cheerios";
			
			String Question2 = "What is your favorite TV show?";
			String Q2Answers1 = "1. Captain Crunch";
			String Q2Answers2 = "2. Cracklin Oats";
			String Q2Answers3 = "3. Lucky Charms";
			String Q2Answers4 = "4. Honey Nut Cheerios";
			
			String Question3 = "What is your favorite Football team";
			String Q3Answers1 = "1. Captain Crunch";
			String Q3Answers2 = "2. Cracklin Oats";
			String Q3Answers3 = "3. Lucky Charms";
			String Q3Answers4 = "4. Honey Nut Cheerios";
			
			String Question4 = "What is your favorite software?";
			String Q4Answers1 = "1. Captain Crunch";
			String Q4Answers2 = "2. Cracklin Oats";
			String Q4Answers3 = "3. Lucky Charms";
			String Q4Answers4 = "4. Honey Nut Cheerios";
			
			question[0].setQuestion(Question1);
			question[0].setAnswers1(Q1Answers1);
			question[0].setAnswers2(Q1Answers2);
			question[0].setAnswers3(Q1Answers3);
			question[0].setAnswers4(Q1Answers4);
			
			question[1].setQuestion(Question2);
			question[1].setAnswers1(Q2Answers1);
			question[1].setAnswers2(Q2Answers2);
			question[1].setAnswers3(Q2Answers3);
			question[1].setAnswers4(Q2Answers4);
			
			question[2].setQuestion(Question3);
			question[2].setAnswers1(Q3Answers1);
			question[2].setAnswers2(Q3Answers2);
			question[2].setAnswers3(Q3Answers3);
			question[2].setAnswers4(Q3Answers4);
			
			question[3].setQuestion(Question4);
			question[3].setAnswers1(Q4Answers1);
			question[3].setAnswers2(Q4Answers2);
			question[3].setAnswers3(Q4Answers3);
			question[3].setAnswers4(Q4Answers4);
			
			System.out.println("");
			System.out.println("Welcome to the Student Survey");
		}
		
		
}
