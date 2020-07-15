// Alex Parys
// 9/9/2017

/* 
import java.util.Scanner;
public class GetUserInfo
{
	public static void main(String[] args)
	{
		String name;
		int age;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter your name >> ");
		name = inputDevice.nextLine();
		System.out.print("Please enter your age >> ");
		age = inputDevice.nextInt();
		System.out.println("Your name is " + name + " and you are " + age + " years old.");
	}
} 
*/

/* 
import java.util.Scanner;
public class GetUserInfo
{
	public static void main(String[] args)
	{
		String fname;
		String lname;
		int age;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter your First name >> ");
		fname = inputDevice.nextLine();
		System.out.print("Please enter your Last Name >>");
		lname = inputDevice.nextLine();
		System.out.print("Please enter your age >> ");
		age = inputDevice.nextInt();
		System.out.println("Your name is " + fname + " " + lname + " and you are " + age + " years old.");
	}
}  
*/

import javax.swing.JOptionPane;
import java.util.Scanner;
public class GetUserInfo
{
	public static void main(String[] args)
	{
		String fname;
		String lname;
		int age;
		Scanner inputDevice = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "Please enter your First name >> ");
		fname = inputDevice.nextLine();
		JOptionPane.showMessageDialog(null, "Please enter your Last Name >>");
		lname = inputDevice.nextLine();
		JOptionPane.showMessageDialog(null, "Please enter your age >> ");
		age = inputDevice.nextInt();
		JOptionPane.showMessageDialog(null, "Your name is " + fname + " " + lname + " and you are " + age + " years old.");
	}
} 