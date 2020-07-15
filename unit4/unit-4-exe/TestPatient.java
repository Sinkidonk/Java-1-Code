public class TestPatient
{
   public static void main(String[] args)
   {
      Patient pat1 = new Patient();
      Patient pat2 = new Patient(1234, 25, "AB", "-");
      
      pat1.displayPatient();
      pat2.displayPatient();
   }
}