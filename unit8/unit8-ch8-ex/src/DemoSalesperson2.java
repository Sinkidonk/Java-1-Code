
public class DemoSalesperson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salesperson[] salespersonArray = new Salesperson[10];
		
		int arrayLength = salespersonArray.length;
		for(int i = 0; i < arrayLength; i++)
		{
		if(i == 0) {
			salespersonArray[i] = new Salesperson(111, 25000);
		} else 
		{
			salespersonArray[i] = new Salesperson(
					salespersonArray[i - 1].getIDNumber() + 1,
					salespersonArray[i - 1].getAnnualSalesAmount() + 5000);
		}
		
		System.out.println(salespersonArray[i].getIDNumber()
				+ " " + salespersonArray[i].getAnnualSalesAmount());
		}
	}
}
		
