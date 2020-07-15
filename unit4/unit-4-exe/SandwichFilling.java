public class SandwichFilling {
	private String sandwichFillingType;
	private int calories;
	
	SandwichFilling() 
	{
		this.sandwichFillingType = "egg salad";
		this.calories = 50;
	}
	
	SandwichFilling(String sandwichFillingType, int calories) 
	{
		this.sandwichFillingType = sandwichFillingType;
		this.calories = calories;
	}
	
	public String getSandwichFillingType() 
	{
		return this.sandwichFillingType;
	}
   
   public void setSandwichFillingType(String sandwichFillingType)
   {
	   this.sandwichFillingType = sandwichFillingType;
   }
	
	public int getCalories()
	{
		return this.calories;
	}
	
	public void setCalories(int calories)
	{
		this.calories = calories;
	}
}