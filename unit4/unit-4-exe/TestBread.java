public class TestBread {
	 public static void main(String[] args) {
		 Bread data1 = new Bread();
		 System.out.println(data1.getBreadType());
         System.out.println(data1.getCaloriesPerSlice());
         System.out.println(Bread.MOTTO);
         
         Bread data2 = new Bread("white", 200);
         
         System.out.println(data2.getBreadType());
         System.out.println(data2.getCaloriesPerSlice());
         System.out.println(Bread.MOTTO);
         Bread data3 = new Bread("Banana", 300);
         System.out.println(data3.getBreadType());
         System.out.println(data3.getCaloriesPerSlice());
         System.out.println(Bread.MOTTO);


       
	 }

}