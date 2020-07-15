import java.text.DecimalFormat;
public class Inspections {
	public static void main(String[] args) {
		
		double factory1 = 0;
		double factory2 = 0;
		double factory3 = 0;
		double factory4 = 0;
		
		int totalWeeks = 52;
		DecimalFormat df = new DecimalFormat("#");
		
		
		
		
		for(int i = 1; i < 53; i++)
		{
			int ran = 1 + (int)(Math.random() * 4);
			System.out.print("Week " + i);
			if( ran == 1)
			{
				System.out.print(" factory 1 will be  Inspection\n");
				factory1++;
			}else if( ran == 2)
			{
				System.out.print(" factory 2 will be  Inspection\n");
				factory2++;
			}else if( ran == 3)
			{
				System.out.print(" factory 3 will be  Inspection\n");
				factory3++;
			}
			else
			{
				System.out.print(" factory 4 will be  Inspection\n");
				factory4++;
			}
			
		}
		System.out.println(df.format(factory1) + " " + df.format(factory2) + " " 
		+ df.format(factory3) + " " + " " + df.format(factory4));
		double factory1Percent = factory1/totalWeeks * 100;
		double factory2Percent = factory2/totalWeeks * 100;
		double factory3Percent = factory3/totalWeeks * 100;
		double factory4Percent = factory4/totalWeeks * 100;
		System.out.println("factory 1 get " + df.format(factory1Percent) + "% Inspection\n" 
				+ "factory 2 get " + df.format(factory2Percent) + "% Inspection\n"
				+ "factory 3 get " + df.format(factory3Percent) + "% Inspection\n"
				+ "factory 4 get " + df.format(factory4Percent) + "% Inspection\n");
		
	}
}
