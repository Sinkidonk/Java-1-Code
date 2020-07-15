
public class WhenProfitable {
	public static void main(String[] args) {
		double grossProfit = 20000;
		double expenses = 35000;
		double netProfit;
		final double GROSS_PROFIT_INCREASE = 0.1;
		final double EXPENSES_INCREASE = 0.04;
		final int TOTAL_YEARS = 20;
		boolean firstYearProfitValue = false;
		String firstYearProfitGain = null;
		
		for (int i = 0; i < TOTAL_YEARS; i++) {
			
			grossProfit = grossProfit * (1 + GROSS_PROFIT_INCREASE);
			expenses = expenses * (1+ EXPENSES_INCREASE);
			netProfit = grossProfit - expenses;
			
			if(netProfit > 0 && firstYearProfitValue == false)
			{
				firstYearProfitGain = "The First Year an Net Profit was reported was in year " + i;
				firstYearProfitValue = true;
			}
			
			System.out.println(i + " Year, The gross profit is " + Math.round(grossProfit)
					+ ", The Expenses is " + Math.round(expenses) + ", and the Net Profit is " + Math.round(netProfit));
		}
		System.out.println(firstYearProfitGain);
		
	}
}
