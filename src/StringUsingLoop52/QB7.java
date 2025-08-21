package StringUsingLoop52;
//7. Remove spaces from a string.
public class QB7 {
public static void main(String[] args) {
String name = "Ra  u  l";
	
	int spaces = 0;
	
	//name = name.toUpperCase();
	
	for(int i=0;i<name.length();i++) {
		char c = name.charAt(i);
		if(Character.isSpace(c)) {
			spaces++;
		}
	}
	System.out.println(spaces);
}
}
