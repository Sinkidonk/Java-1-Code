import java.util.Scanner;
import javax.swing.JOptionPane;

public class PaintCalculator {
	public static void main(String[] args) {
		final int GALLON_TO_SQ_FT = 250;
		
		
		String userLength = JOptionPane.showInputDialog(null, "Please enter the Length of the room");
		String userWidth = JOptionPane.showInputDialog(null, "Please enter the Width of the room");
		String userHeight = JOptionPane.showInputDialog(null, "Please enter the Height of the room");
		int length = Integer.parseInt(userLength);
		int width = Integer.parseInt(userWidth);
		int height = Integer.parseInt(userHeight);
		calcCost(length, width, height);
		
		
		
	}
	
	public static void calcCost(int l, int w, int h) {
		
		final double PRICE_PER_GALLON = 35;
		
		int sqFt = (l * w * h);
		
		double gallonSqFt = sqFt / 250;
		
		displayMsg("the number of Gallons you need is " + gallonSqFt);
		
		
		double price = gallonSqFt * PRICE_PER_GALLON;
		displayMsg("The cost is " + price);
		
		
		
	}
	
	public static void displayMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}


}