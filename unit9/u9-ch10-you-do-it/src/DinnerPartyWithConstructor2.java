
public class DinnerPartyWithConstructor2 extends PartyWithConstructor2 {
	public DinnerPartyWithConstructor2(int numGuests) {
		super(numGuests);
		// TODO Auto-generated constructor stub
	}

	private int dinnerChoice;

	public int getDinnerChoice() {
		return dinnerChoice;
	}

	public void setDinnerChoice(int choice) {
		this.dinnerChoice = choice;
	}
	
	@Override
	public void displayInvitation()
	{
		System.out.println("Please come to my dinner Party!");
	}
	
}
