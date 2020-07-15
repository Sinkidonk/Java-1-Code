import javax.swing.JOptionPane;

public class CondoSales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int PARK_VIEW_COST = 150000;
		final String PARK_VIEW_MSG = "Park View";
		
		final int GOLF_COURSE_VIEW_COST = 170000;
		final String GOLF_COURSE_VIEW_MSG = "Golf Course View";
		
		final int LAKE_VIEW_COST = 210000;
		final String LAKE_VIEW_MSG = "Lake View";
		
		final int GARAGE_COST = 5000;
		
		int viewCost;
		String viewType;
		
		int userGarageInput = 0;
		int userViewInput = 0;
		
		String userViewDialog = JOptionPane.showInputDialog(null, "Please enter 1 for park view\n"
				+ "2 for golf course view\n and 3 for lake view");
		userViewInput = Integer.parseInt(userViewDialog);
		boolean tOrD;
		switch(userViewInput)
		{
		case 1:
			viewType = PARK_VIEW_MSG;
			viewCost = PARK_VIEW_COST;
			tOrD = true;
			break;
		case 2:
			viewType = GOLF_COURSE_VIEW_MSG;
			viewCost = GOLF_COURSE_VIEW_COST;
			tOrD = true;
			break;
		case 3:
			viewType = LAKE_VIEW_MSG;
			viewCost = LAKE_VIEW_COST;
			tOrD = true;
			break;
		default:
			viewType = "invalid";
			viewCost = 0;
			tOrD = false;
		}
		if (tOrD == true)
		{
		String userGarageDialog = JOptionPane.showInputDialog(null, "Please enter 1 if you want an one car garage\n"
				+ "2 if you want an two car garage\n"
				+ "0 if you don't want an garage");
		userGarageInput = Integer.parseInt(userGarageDialog);
		
		}
		else {
			userGarageInput = 0;
		}
		garage(viewCost, viewType, userGarageInput, GARAGE_COST);
	}
	private static void garage(int viewCost, String viewType, int userGarageInput, int garageCost) {
		// TODO Auto-generated method stub
		
		if( ( (userGarageInput == 0) || userGarageInput > 2 ) )
		{
			userGarageInput = 0;
			showMsg("You pick " + viewType 
					+ "\n with an " + userGarageInput + 
					" Car Garage your total cost will be $" + viewCost);
		}
		else if ( (userGarageInput == 1)  || (userGarageInput == 2))
		{
			int totalCost = viewCost + garageCost;
			showMsg("You pick " + viewType 
					+ "\n with an " + userGarageInput + 
					" Car Garage your total cost will be $" + totalCost);
		}
		
	}
	
	public static void showMsg(String msg)
	{
		JOptionPane.showMessageDialog(null, msg);
	}
	

}
