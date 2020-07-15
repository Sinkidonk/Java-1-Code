public class BillingTest {
   public static void main(String[] args) {
	   Billing data1 = new Billing();
	   double price = 6.99;
	   int quantity = 5;
	   double coupon = 0.5;
	   data1.computeBill(price);
	   data1.computeBill(price, quantity);
	   data1.computeBill(price, quantity, coupon);
	}
 }