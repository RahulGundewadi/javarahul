package StringUsingLoop52;
//3. Count digits in a string.
public class QB3 {
public static void main(String[] args) {
	String name = "Rau500151l";
	
	int digitCount = 0;
	
	name = name.toUpperCase();
	
	for(int i=0;i<name.length();i++) {
		char c = name.charAt(i);
		if(Character.isDigit(c)) {
		digitCount++;
		}
	}
	System.out.println(digitCount);
}
}

