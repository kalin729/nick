package nick;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Съзадаваме списък от тип Person
		List<Person> ppl = new ArrayList<Person>();
		
		//Създаваме празен обект от тип Student и използваме getter и setter методите 
		//за да му запълним данни
		Student student1 = new Student();
		student1.setName("Georgi");
		student1.setEGN("001122334455");
		student1.setCourse(3);
		student1.setSpeciality("Management");
		
		//Добавяме вече създаденият обект student1
		ppl.add(student1);
		//Добавяме нов обект от тип Employee
		ppl.add(new Employee("Petar", "9512131416", "Construction Worker", 7));
		//Добавяме нов обект от тип Student
		ppl.add(new Student("Dimitar", "0412131415", "Electrical Engineering", 2));
		//Добавяме нов обект от тип Employee
		ppl.add(new Employee("Ivan", "9000001345", "Broker", 5));
		
		//Използваме цикъл от тип ForEach за да достигнем всеки елемент от списъка ppl под името p
		//и да извикаме написаните в скобите методи
		for(Person p : ppl) {
			System.out.println(p.toString());
			System.out.println("Years activity: " + p.yearsActivity());
		}
		
		System.out.println("=============S O R T I N G=============");
		
		Collections.sort(ppl);
		
		for(Person p : ppl) {
			System.out.println(p.toString());
			System.out.println("Years activity: " + p.yearsActivity());
		}
	}

}
