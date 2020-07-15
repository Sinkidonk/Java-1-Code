
public class Salesperson {
	private int IDNumber;
	private double annualSalesAmount;
	
	
	public Salesperson(int IDNumber, double annualSalesAmount)
	{
		this.IDNumber = IDNumber;
		this.setAnnualSalesAmount(annualSalesAmount);
	}
	
	public int getIDNumber()
	{
		return this.IDNumber;
	}
	
	public void setIDNumber(int IDNumber)
	{
		this.IDNumber = IDNumber;
	}


	public double getAnnualSalesAmount() {
		return annualSalesAmount;
	}


	public void setAnnualSalesAmount(double annualSalesAmount) {
		this.annualSalesAmount = annualSalesAmount;
	}

}
