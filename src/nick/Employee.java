package nick;

public class Employee extends Person implements Message{

	private String company;
	private int yearsActive;
	
	//Конструктори
	public Employee() {
		super();
		company = "";
		yearsActive = 0;
	}
	
	public Employee(String getName, String getEGN, String getCompany, int getYearsActive) {
		super(getName, getEGN);
		company = getCompany;
		yearsActive = getYearsActive;
	}
	
	//Метод, който извежда годините, които човекът се занимава с дейността си
	@Override
	public double yearsActivity() {
		Message.greet(super.getName());
		// TODO Auto-generated method stub
		return yearsActive;
	}

	//Getter/Setter методи
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getYearsActive() {
		return yearsActive;
	}

	public void setYearsActive(int yearsActive) {
		this.yearsActive = yearsActive;
	}
	
	//toString метод предназначен за Employee класа.
	@Override
	public String toString() {
		return "Student name: "+ super.getName() + ", EGN: " + super.getEGN() + ", Company: " + company;
	}
	
}
