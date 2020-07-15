public class DogTriathlonParticipant
{
	private final int NUM_EVENT;
	private static int totalCumulativeScore = 0;
	
	private String name;
	private int obedienceScore;
	private int conformationScore;
	private int agilityScore;
	private int total;
	private double avg;
	
	public DogTriathlonParticipant(String name,
		int numEvents, int score1, int score2, int score3)
	{
		this.name = name;
		NUM_EVENT = numEvents;
		obedienceScore = score1;
		conformationScore = score2;
		agilityScore = score3;
		
		total = obedienceScore 
			+ conformationScore + agilityScore;
		
		avg = (double) total / NUM_EVENT;
		totalCumulativeScore = totalCumulativeScore
		+ total;
	}
	
	public void display()
	{
		System.out.println(name + " participated in "
		+ NUM_EVENT
		+ " events and has an average score of " + avg);
		
		System.out.println(" " + name +
		" has a total score of " + total
		+ " bringing the total cumulative score to " 
		+ totalCumulativeScore);
	}
}