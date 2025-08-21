package static508;

public class Animal {

	static int age = 23;
	
	static {
		System.out.println("static block");
	}
	
	
	
	public Animal() {
		System.out.println("Constructor");
	}
}
