public class Horse
{
   private String name;
   private String color;
   private String birth;
   
   public Horse(String name, String color, String birth)
   {
      this.name = name;
      this.color = color;
      this.birth = birth;
   }

public String getName() {
      return this.name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public String getColor() {
      return this.color;
   }
   
   public void setColor(String color) {
      this.color = color;
   }

   public String getBirth()
   {
      return this.birth;
   }
   
   public void setBirth(String birth)
   {
      this.birth = birth;
   }
   
   public void display()
   {
      System.out.println("The horses name is " + this.name);
      System.out.println("Color: " + this.color);
      System.out.println("Birth: " + this.birth);
   }
}