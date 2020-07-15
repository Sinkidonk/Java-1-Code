
public class DemoSalesperson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salesperson[] salespersonArray = new Salesperson[10];
		
		for(Salesperson person : salespersonArray)
		{
			person = new Salesperson(9999, 0);
			System.out.println(person.getIDNumber() + " " + person.getAnnualSalesAmount());
		}
	}

}
