
public class JobApplicant {
	
	private String name;
	private String phone;
	public boolean word = false;
	public boolean sheets = false;
	public boolean database = false;
	public boolean graphic = false;
	public int tOrDCount = 0;
	
	JobApplicant()
	{
		this.name = "Alex";
		this.phone = "555-555-5555";
		this.word = true;
		this.sheets = false;
		this.database = true;
		this.graphic = true;
	}
	
	JobApplicant(String name, String phone, boolean word, 
			boolean sheets, boolean database, boolean graphic)
	{
		this.name = name;
		this.phone = phone;
		this.sheets = sheets;
		this.database = database;
		this.graphic = graphic;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean getWord() {
		return word;
	}
	public void setWord(boolean word) {
		this.word = word;
	}
	public boolean getSheets() {
		return sheets;
	}
	public void setSheets(boolean sheets) {
		this.sheets = sheets;
	}
	public boolean getDatabase() {
		return database;
	}
	public void setDatabase(boolean database) {
		this.database = database;
	}
	public boolean getGraphic() {
		return graphic;
	}
	public void setGraphic(boolean graphic) {
		this.graphic = graphic;
	}

	public int getTOrDCount() {
		return tOrDCount;
	}

	public void setTOrDCount(int tOrDCount) {
		this.tOrDCount = tOrDCount;
	}
	
	

}
