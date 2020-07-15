
public class DemoHorse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse horse = new Horse("Tim", "Green", "11/7/19");
		RaceHorse raceHorse = new RaceHorse("Ruby", "gray", "5/5/15", 44);
		horse.display();
		raceHorse.display();
		
		horse.setName("Alex");
		raceHorse.setName("Bob");
		
		horse.setColor("Red");
		raceHorse.setColor("Blue");
		
		horse.setBirth("11/28/2016");
		raceHorse.setBirth("10/10/2015");
		
		raceHorse.setNumRaces(45);
		
		
		horse.display();
		raceHorse.display();
	}
}
