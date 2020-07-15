// Alex Parys
// 9/12/17
import java.util.Scanner;
public class IntegerDemoInteractive 
{
	
	public static void main(String[] args)
	{
		int anInt = 1234;
		byte aByte = 12;
		short aShort = 12345;
		long aLong = 1234567890987654321L;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer >> ");
		
		anInt = input.nextInt();
		
		System.out.print("Please enter a byte integer >> ");
		aByte = input.nextByte();
		System.out.print("Please enter a short integer >> ");
		aShort = input.nextShort();
		System.out.print("Please enter a long integer >> ");
		aLong = input.nextLong();
		
		
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);
		
		int anotherInt = anInt * 10000000;
		
		System.out.println("Another int is " + anotherInt);
	}
	
}