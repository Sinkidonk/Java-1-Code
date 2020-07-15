import javax.swing.JOptionPane;

public class SqrtException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double squareNum;
		squareNum = DoubleValidationHelper.getDouble("Enter a number");


		double sqrtResult;
		sqrtResult = Math.sqrt(squareNum);
		JOptionPane.showMessageDialog(null, sqrtResult);
	}
}
