public class TestBloodData{
   public static void main(String[] args) {
      BloodData data1 = new BloodData();
      System.out.println(data1.getBloodType());
      
      data1.setBloodType("AB");
      System.out.println(data1.getBloodType());
      System.out.println(data1.getRhFactor());
      
      BloodData data2 = new BloodData("B", "+");
      System.out.println(data2.getBloodType());
      System.out.println(data2.getRhFactor());
      
   }
}