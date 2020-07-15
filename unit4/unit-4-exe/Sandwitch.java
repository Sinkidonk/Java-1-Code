public class Sandwitch {
	private String bread;
	private String filling;
	public int caloriesFilling;
	public int caloriesBread;
	public int totalCalories;
	
	Sandwitch()
	{
		this.bread = "rye";
		this.caloriesBread = 50;
		this.filling = "Chips";
		this.caloriesFilling = 300;
	}
	
	Sandwitch(String bread, int caloriesBread, String filling, int caloriesFilling)
	{
		this.bread = bread;
		this.caloriesBread = caloriesBread;
		
		this.filling = filling;
		this.caloriesFilling = caloriesFilling;
		
	}
	
	public String getFilling()
	{
		return this.filling;
	}
	
	public void setFilling(String filling)
	{
		this.filling = filling;
	}
	
	public String getBread()
	{
		return this.bread;
	}
	
	public void setBread(String bread)
	{
		this.bread = bread;
	}
	
	public int getCaloriesBread()
	{
		return this.caloriesBread;
	}
	
	public void setCaloriesBread(int cB)
	{
		this.caloriesBread = cB;
	}
	
	public int getCaloriesFilling()
	{
		return this.caloriesFilling;
	}
	
	public void setCaloriesFilling(int cF)
	{
		this.caloriesFilling = cF;
	}
	
	public int getTotalCalories()
	{
		return this.totalCalories;
	}
	
	public void setTotalCalories(int tF)
	{
		this.totalCalories = tF;
	}
}
