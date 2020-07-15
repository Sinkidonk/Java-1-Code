public class DogTriathlonParticipant3
{
	private final int NUM_EVENT;
	private static int totalCumulativeScore = 0;
	
	private String name;
	private int obedienceScore;
	private int conformationScore;
	private int agilityScore;
	private int total;
	private double avg;
	private boolean scoresAgree;
	
	public DogTriathlonParticipant2(String name,
		int numEvents, int score1, int score2, int score3)
	{
		this.name = name;
		NUM_EVENT = numEvents;
		
		int totalNot0 = 0;
		if(score1 != 0)
			totalNot0 = totalNot0 + 1;
		if(score2 != 0)
			totalNot0 = totalNot0 + 1;
		if(score3 != 0)
			totalNot0 = totalNot0 + 1;
		
		if(numEvents == totalNot0)
			scoresAgree = true;
		else
			scoresAgree = false;
		
		if(scoresAgree)
		{
		obedienceScore = score1;
		conformationScore = score2;
		agilityScore = score3;
		}
		else
		{
			obedienceScore = 0;
			conformationScore = 0;
			agilityScore = 0;
		}
		
		

		
		total = obedienceScore 
			+ conformationScore + agilityScore;
			
		if(NUM_EVENT == 0)
			avg = 0;
		else
			avg = (double) total / NUM_EVENT;
		
		totalCumulativeScore=totalCumulativeScore+total;
	}
	
	public void display()
	{
		if(!scoresAgree)
			System.out.println("\nNotice! Number of events for "
			+ name + " does not agree with scores reported");
		
		System.out.println(name + " participated in "
		+ NUM_EVENT
		+ " events and has an average score of " + avg);
		
		System.out.println(" " + name +
		" has a total score of " + total
		+ " bringing the total cumulative score to " 
		+ totalCumulativeScore + "\n \n");
	}
}