package nick;

public class Student extends Person{

	private int course;
	private String speciality;
	
	//Конструктори
	public Student() {
		super();
		course = 0;
		speciality = "";
	}


	public Student(String getName, String getEGN, String getSpeciality, int getCourse) {
		super(getName, getEGN);
		course = getCourse;
		speciality = getSpeciality;
	}

	//Метод, който извежда годините, които човекът се занимава с дейността си
	@Override
	public double yearsActivity() {
		// TODO Auto-generated method stub
		return course;
	}	
	
	//toString метод предназначен за Student класа.
	@Override
	public String toString() {
		return "Student name: "+ super.getName() + ", EGN: " + super.getEGN() + ", Speciality: " + speciality;
	}

	//Getter/Setter методи
	public int getCourse() {
		return course;
	}


	public void setCourse(int course) {
		this.course = course;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
}
