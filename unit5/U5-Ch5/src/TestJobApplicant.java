import javax.swing.JOptionPane;
public class TestJobApplicant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JobApplicant data1 = new JobApplicant();
		JobApplicant data2 = new JobApplicant("Jon", "515-715-9875", true, true, false, false);
		JobApplicant data3 = new JobApplicant("Fin", "745-999-9876", true, false, true, false);
		int tOrDCount = 0;
			if(data1.word == true)
			{
				tOrDCount++;
				System.out.println(tOrDCount);
			}
			if(data1.sheets == true)
			{
				tOrDCount++;
			}
			if(data1.database == true)
			{
				tOrDCount++;
			}
			if(data1.graphic == true)
			{
				tOrDCount++;
			}
			
			if(tOrDCount >= 3)
			{
				JOptionPane.showMessageDialog(null, data1.getName() + " You are qualified for the job\n"
						+ "We will call you at " + data1.getPhone());
			}
			else
			{
				JOptionPane.showMessageDialog(null, data1.getName() + " You are not qualified for the job\n"
						+ "We will call you at " + data1.getPhone());
			}
			
			tOrDCount = 0;
			if(data2.word == true)
			{
				tOrDCount++;
			}
			if(data2.sheets == true)
			{
				tOrDCount++;
			}
			if(data2.database == true)
			{
				tOrDCount++;
			}
			if(data2.graphic == true)
			{
				tOrDCount++;
			}
			
			if(tOrDCount >= 3)
			{
				JOptionPane.showMessageDialog(null, data2.getName() + " You are qualified for the job\n"
						+ "We will call you at " + data2.getPhone());
			}
			else
			{
				JOptionPane.showMessageDialog(null, data2.getName() + " You are not qualified for the job\n"
						+ "We will call you at " + data2.getPhone());
			}
			tOrDCount = 0;
			if(data3.word == true)
			{
				tOrDCount++;
			}
			if(data3.sheets == true)
			{
				tOrDCount++;
			}
			if(data3.database == true)
			{
				tOrDCount++;
			}
			if(data3.graphic == true)
			{
				tOrDCount++;
			}
			
			if(tOrDCount >= 3)
			{
				JOptionPane.showMessageDialog(null, data3.getName() + " You are qualified for the job\n"
						+ "We will call you at " + data3.getPhone());
			}
			else
			{
				JOptionPane.showMessageDialog(null, data3.getName() + " You are not qualified for the job\n"
						+ "We will call you at " + data3.getPhone());
			}
			
			}
}

