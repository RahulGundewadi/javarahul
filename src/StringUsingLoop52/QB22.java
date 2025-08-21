package StringUsingLoop52;
//22. Capitalize the first letter of each word.
public class QB22 {
public static void main(String[] args) {
	String name = "rahul appaso gundewadi";
	
	String cap ="  ";
	boolean first = true;
	
	for(int i=0;i<name.length();i++) {
		char c = name.charAt(i);
		
		if(first && Character.isLetter(c) ) {
			cap = cap+Character.toUpperCase(c);
			 first = false;
				
		}else {
			cap = cap+c;	
		}if(c == ' ') {
			 first = true;
		}
	}
	System.out.println(name);
	System.out.println(cap);
}
}
