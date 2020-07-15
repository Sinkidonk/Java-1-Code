public class Demo2
{
   public static void main(String[] args)
   {
	   int testInt1 = 6;
	   switch(testInt1)
	   {
		    case 1:
				System.out.println("Test int is 1");
			break;
			
			case 2:
			case 3:
				System.out.println("Test int is 2 or 3");
			default:
				System.out.println("We didn't see your number");
			
	   }
   }
    /*     
   public static boolean returnTrue()
   {
      return true;
   }
   public static boolean returnFalse()
   {
      return false;
   }
   */
   
}