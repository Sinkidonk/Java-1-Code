import javax.swing.JOptionPane;
public class AirlineDialog
{
	public static void main(String[] args)
	{
		int selection;
		boolean isYes;
		selection = JOptionPane.showConfirmDialog(null,
			"Do you want to upgrade to first class?\n I't only an $1,000 more USD");
		isYes = (selection == JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null,
			"You Responded " + isYes);
			
	}
}