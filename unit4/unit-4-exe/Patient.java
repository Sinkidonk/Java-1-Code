public class Patient {
   private int idNumber;
   private int age;
   private BloodData bloodData;
   
   Patient() {
      this.idNumber = 0;
      this.age = 0;
      bloodData = new BloodData("O","+");
   }
   
   Patient(int idNumber, int age, String bloodType, String rhFactor){
      this.idNumber = idNumber;
      this.age = age;
      this.bloodData = new BloodData(bloodType, rhFactor);
   }
   
   public int getIdNumber()
   {
      return this.idNumber;
   }
   
   public int getAge() 
   {
      return this.age;
   }
   
   public String getBloodData()
   {
      return this.bloodData.getBloodType() + this.bloodData.getRhFactor();
   }
   
   public void displayPatient()
   {
      System.out.println("Patient ID: " + getIdNumber()
         + "\nPatient Name: " + getAge()
         + "\nPatient Blood Type: " + getBloodData());
   }
}