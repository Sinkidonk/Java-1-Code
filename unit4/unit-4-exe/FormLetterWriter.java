public class FormLetterWriter {
	public static void main(String[] args) 
	{
		String fName = "Alex";
		String lName = "Parys";
		displaySalutation(lName);
		displaySalutation(fName, lName);
		
		
	}
	
	public static void displaySalutation(String lN)
	{
		System.out.println("Dear Mr. or Ms. " + lN + " Thank you for your recent order");
	}
	
	public static void displaySalutation(String fN, String lN)	
	{
		System.out.println("Dear Mr. or Ms. " + fN + " " + lN + " Thank you for your recent order");
	}
	
}