package StringUsingLoop52;
//9. Convert lowercase to uppercase (and vice versa).
public class QB9 {
public static void main(String[] args) {
	
	String name = "rahul";
	String name1 = "";
	
	for(int i=0; i<name.length();i++) {
		char c = name.charAt(i);
		
		if(Character.isUpperCase(c)) {
			name1 += Character.isLowerCase(c);
			
		}else if(Character.isLowerCase(c)) {
			name1 += Character.isUpperCase(c);
		}else {
			name1 += c;
		}
	}
	System.out.println(name);
	System.out.println(name1);
}
}
