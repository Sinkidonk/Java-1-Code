public class BloodData {
   private String bloodType;
   private String rhFactor;
   
   BloodData() {
      this.bloodType = "O";
      this.rhFactor = "-";
      
   }
   
   BloodData(String bloodType, String rhFactor){
      this.bloodType = bloodType;
      this.rhFactor = rhFactor;
   }
   
   public String getBloodType() {
      return this.bloodType;
   }
   
   public void setBloodType(String bloodType)
   {
      this.bloodType = bloodType;
   }
   
   public String getRhFactor() {
      return this.rhFactor;
   }
   
   public void setRhFactor(String rhFactor)
   {
      this.rhFactor = rhFactor;
   }
 }

