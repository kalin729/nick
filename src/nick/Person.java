package nick;

public abstract class Person implements Comparable<Person>{

	//Типът на EGN е String, за да може да се пишат нули преди него.
	//Ако е int ще ги отрязва.с
	private String name;
	private String EGN;
	
	//Празен конструктор, който присвоява празни данни
	public Person() {
		name = "";
		EGN = "";
	}
	
	//Конструктор, който запълва данни
	public Person(String getName, String getEGN){
		name = getName;
		EGN = getEGN;
	}

	//Getter/Setter методи
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEGN() {
		return EGN;
	}

	public void setEGN(String eGN) {
		EGN = eGN;
	}

	//toString метод предназначен за Person класа
	@Override
	public String toString() {
		return "Person name=" + name + ", EGN=" + EGN;
	}
	
	//Абстрактен метод yearsActivity, който ще бъде зададен в класовете, които наследяват Person
	public abstract double yearsActivity();
	
	//Метод, сравняващ имената.
	@Override
	public int compareTo(Person getPerson) {
		return this.name.compareTo(getPerson.getName());
	}
	
}
