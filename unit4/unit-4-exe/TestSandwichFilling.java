public class TestSandwichFilling {
	public static void main(String[] args) {
		
		SandwichFilling data1 = new SandwichFilling();
		SandwichFilling data2 = new SandwichFilling("chips", 500);
		SandwichFilling data3 = new SandwichFilling("mints", 300);
		
		System.out.println(data1.getSandwichFillingType());
		System.out.println(data1.getCalories());
		
		System.out.println(data2.getSandwichFillingType());
		System.out.println(data2.getCalories());
		
		System.out.println(data3.getSandwichFillingType());
		System.out.println(data3.getCalories());
		
		
		
		
	 }

}