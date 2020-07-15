public class CountByThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		int inputInt = ValidationHelper.getInt("Please include a number to count by");
		for(int i = 0; i <= 300; i += inputInt)
		{
			System.out.print(i + ", ");
			counter++;
			if(counter == 10) 
			{
				counter = 0;
				System.out.println("");
				
			}
		}
	}

}
