
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray1 = new int[5];
		int[] intArray2 = {1, 2, 502139, 4, 5};
		
		for(int i = 0; i < intArray1.length; i++)
		{
			intArray1[i] = i + 1;
			
		}
		
		for(int i = 0; i < intArray1.length; i++)
		{
			System.out.println(i);
			
		}
		
		for(int value : intArray1)
		{
			System.out.println(value);
		}
	}

}
