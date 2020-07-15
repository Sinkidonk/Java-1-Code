public class TestSandwitch {
	 public static void main(String[] args) {
		 Sandwitch data1 = new Sandwitch();
		 Sandwitch data2 = new Sandwitch("white", 200, "Eggs", 100);
		 Sandwitch data3 = new Sandwitch("banana", 400, "peanut butter", 60);
		 
		 data1.totalCalories = data1.caloriesBread * 2 + data1.caloriesFilling;
		 data2.totalCalories = data2.caloriesBread * 2 + data2.caloriesFilling;
		 data3.totalCalories = data3.caloriesBread * 2 + data3.caloriesFilling;
		 
		 System.out.println(data1.getBread());
		 System.out.println(data1.getFilling());
		 System.out.println(data1.getTotalCalories());
		 System.out.println("");
		 System.out.println(data2.getBread());
		 System.out.println(data2.getFilling());
		 System.out.println(data2.getTotalCalories());
		 System.out.println("");
		 System.out.println(data3.getBread());
		 System.out.println(data3.getFilling());
		 System.out.println(data3.getTotalCalories());
	   
	 }
}