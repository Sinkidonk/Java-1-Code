
public class TwelveInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[12];
		int i;
		
		for(i = 0; i < intArray.length; i++)
		{
			intArray[i] = 1 + i;
		}
		System.out.println("First to Last");
		for(int value : intArray)
		{
			System.out.println(value);
		}
		
		System.out.println("Last to First");
		for(i = 11; i > -1; i--)
		{
			System.out.println(intArray[i]);
		}
	}

}
