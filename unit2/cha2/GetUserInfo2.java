// Alex Parys
// 9/12/2017
import java.util.Scanner;
public class GetUserInfo2
{
	public static void main(String[] args)
	{
		String name;
		int age;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter your age >> ");
		age = inputDevice.nextInt();
		System.out.print("Please enter your name >> ");
		name = inputDevice.nextLine();
		System.out.println("Your Name is " + name +
	" and you are " + age + " years old.");
	}
}