public class Billing {
	public final static double tax = 0.08;


	
		public static void computeBill(double price)
	{
		double totalPrice = Math.round(price / this.tax);
		System.out.println(totalPrice);
	}
   
   public static void computeBill(double price, int quan)
   {
	  double totalPrice = Math.round((price * quan) / this.tax);
      System.out.println(totalPrice);
   }
   
      public static void computeBill(double price, int quan, double coupon)
   {
	  double totalPrice = Math.round(price * quan * coupon / this.tax);
      System.out.println(totalPrice);
   }

}
