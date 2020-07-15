import javax.swing.JOptionPane;

public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int PARK_VIEW_COST = 150000;
		final String PARK_VIEW_MSG = "Park View";
		
		final int GOLF_COURSE_VIEW_COST = 170000;
		final String GOLF_COURSE_VIEW_MSG = "Golf Course View";
		
		final int LAKE_VIEW_COST = 210000;
		final String LAKE_VIEW_MSG = "Lake View";
		
		int viewCost;
		String viewType;
		
		
		int userInput = 0;
		
		String userDialog = JOptionPane.showInputDialog(null, "Please enter 1 for park view\n"
				+ "2 for golf course view\n and 3 for lake view");
		userInput = Integer.parseInt(userDialog);
		
		switch(userInput)
		{
		case 1:
			viewType = PARK_VIEW_MSG;
			viewCost = PARK_VIEW_COST;
			break;
		case 2:
			viewType = GOLF_COURSE_VIEW_MSG;
			viewCost = GOLF_COURSE_VIEW_COST;
			break;
		case 3:
			viewType = LAKE_VIEW_MSG;
			viewCost = LAKE_VIEW_COST;
			break;
		default:
			viewType = "invalid";
			viewCost = 0;
		}
		
		JOptionPane.showMessageDialog(null, "You pick " + viewType 
				+ "\nYour total cost will be " + viewCost);
		
		
	}
	
	

}
