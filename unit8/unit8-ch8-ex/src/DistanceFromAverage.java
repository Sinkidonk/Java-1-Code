import javax.swing.JOptionPane;
public class DistanceFromAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = new double[20];
		int i = 0, j = 0;
		int exitValue = 99999;
		/*
		double array[] = {
				50, 20, 10, 10
				};
				*/
		int arrayLength = array.length - 1;
		while(exitValue != j)
		{
			if(i <= arrayLength) 
			{
				
				array[i] = DoubleValidationHelper.getDouble("Please enter an double\n"
						+ "Enter 99999(5, 9) to exit or enter 20 number");
			}
			
			if (i == arrayLength)
			{
				j = exitValue;
			}
			else if(array[i] == exitValue)
			{
				array[i] = 0.0;
				j = exitValue;
			}
			
			if( ( (array[i] != exitValue ) && (j != exitValue) ) )
			{
				i++;
			}
		}
		int totalNumberCount = 0;
		double totalNumber = 0;
		
		for(i = 0; i < arrayLength; i++)
		{
			if(array[i] != 0.0)
			{
				totalNumberCount = totalNumberCount + 1;
				totalNumber = totalNumber + array[i];
				
			}
		}
		double totalNumberValue = 0;
		double totalNumberDivde = 0;
		//System.out.println("Total number " + totalNumber + " Total Number Count " + totalNumberCount);

		for(double value : array)
		{
				
			if(value != 0.0)
			{
				totalNumberDivde = totalNumber/totalNumberCount;
				totalNumberValue = totalNumberDivde-value;
				System.out.println(value + " Average is " 
						+ (totalNumberDivde) + " Value " + value 
						+ " is " + (totalNumberValue) + " away from the Average");
			}
			
		}
		
		
		if(array[0] == 0.0)
		{
			System.out.println("Error");
		} 
		
		
	}

}
