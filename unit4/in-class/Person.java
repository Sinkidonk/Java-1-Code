public class Person {
   private String name;
   private static int numberOfPeople = 0;
   
   Person() {
      name = "Ted";
}

   Person(String name) {
      this.name = name;
      this.numberOfPeople += 1;

   }
   
   public String getName(){
      return this.name;
   }
   
   public int getNumberOfPeople() {
      return numberOfPeople;
   }
   
   }