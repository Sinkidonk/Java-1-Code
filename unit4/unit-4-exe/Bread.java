public class Bread {
	private String breadType;
	private int caloriesPerSlice;
	public final static String MOTTO = "The staff of life";
	
	Bread() 
	{
		this.breadType = "rye";
		this.caloriesPerSlice = 50;
	}
	
	Bread(String breadType, int caloriesPerSlice) 
	{
		this.breadType = breadType;
		this.caloriesPerSlice = caloriesPerSlice;
	}
	
	public String getBreadType() 
	{
		return this.breadType;
	}
   
   public void setBreadType(String breadType)
   {
	   this.breadType = breadType;
   }
	
	public int getCaloriesPerSlice()
	{
		return this.caloriesPerSlice;
	}
	
	public void setCaloriesPerSlice(int caloriesPerSlice)
	{
		this.caloriesPerSlice = caloriesPerSlice;
	}
}