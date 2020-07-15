
public class RaceHorse extends Horse {
	private int numRaces;
	
	public RaceHorse(String name, String color, String birth, int numRaces) {
		super(name, color, birth);
		this.numRaces = numRaces;
		// TODO Auto-generated constructor stub
	}

	public int getNumRaces() {
		return numRaces;
	}

	public void setNumRaces(int numRaces) {
		this.numRaces = numRaces;
	}
	public void display()
	{
		System.out.println("The Race horses name is " + this.getName());
		System.out.println("Color: " + this.getColor());
		System.out.println("Birth: " + this.getBirth());
		System.out.println("Number: " + this.getNumRaces());
	}
}
