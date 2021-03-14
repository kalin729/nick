package nick;

public interface Message {

	//Метод, който взема String и изпраща поздрав от негово име
	public static void greet(String name) {
		System.out.println("Greetings from " + name);
	}
	
}
