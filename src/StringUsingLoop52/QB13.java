package StringUsingLoop52;
//13. Extract digits from a string
public class QB13 {
public static void main(String[] args) {
	
	String name = "Rahul123";
	String digit = "";
	
	for(int i = 0; i<name.length();i++) {
		char c = name.charAt(i);
		
		if(Character.isDigit(c)) {
			digit = digit+c;
			
		}
	}
	System.out.println("Digit in String : "+digit);
}
}
