package StringUsingLoop52;
//29. Check if string contains all unique characters.
public class QB29 {
public static void main(String[] args) {
	
	String name = "asdfghthgh";
	boolean allUnique = true;
	
	for(int i = 0; i<name.length(); i++) {
		char c = name.charAt(i);
		
		allUnique = false;
	
		/*if(allUnique) {
			System.out.println("all unique characters");
		}else {
			System.out.println("all not unique characters");
		}*/
	}
	if(allUnique) {
		System.out.println("all unique characters");
	}else {
		System.out.println("all not unique characters");
	}
}
}
