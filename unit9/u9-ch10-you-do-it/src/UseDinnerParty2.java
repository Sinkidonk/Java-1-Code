import java.util.Scanner;
public class UseDinnerParty2 {

	private static Scanner keyboard;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guests;
		int choice;
		Party aParty = new Party();
		DinnerParty2 DinnerParty2 = new DinnerParty2();
		keyboard = new Scanner(System.in);
		
		System.out.print("Enter number of guests for the party >> ");
		guests = keyboard.nextInt();
		aParty.setGuests(guests);
		System.out.println("The party has " + aParty.getGuests() 
		+ " guests");
		
		aParty.displayInvitation();
		
		System.out.print("Enter number of guests for the dinner party >> ");
		guests = keyboard.nextInt();
		DinnerParty2.setGuests(guests);
		
		System.out.print("Enter the menu option -- 1 for chicken or 2 for beef >> ");
		choice = keyboard.nextInt();
		DinnerParty2.setDinnerChoice(choice);
		System.out.println("The dinner party has "
				+ DinnerParty2.getGuests() + " guests");
		System.out.println("Menu option " 
				+ DinnerParty2.getDinnerChoice() + " will be served");
		
		DinnerParty2.displayInvitation();
	}

}
