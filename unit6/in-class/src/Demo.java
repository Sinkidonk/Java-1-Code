public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i < 10)
		{
			i++;
			System.out.print("the counter is at " + i + " - ");
			int j = 0;
			while(j < i)
				j++;
			if(j == i) {
				System.out.print(j + " ");
				}
			else
				System.out.print(j + ", ");
			System.out.println(j + ", ");
			}
		
			}
			
			
		}
	


