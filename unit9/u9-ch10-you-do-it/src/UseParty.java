import java.util.*;
public class UseParty {

	private static Scanner keyboard;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guests;
		Party aParty = new Party();
		keyboard = new Scanner(System.in);
		
		System.out.print("Enter number of guests for the party >> ");
		guests = keyboard.nextInt();
		aParty.setGuests(guests);
		System.out.println("The party has " + aParty.getGuests() 
		+ " guests");
		
		aParty.displayInvitation();
	}

}
