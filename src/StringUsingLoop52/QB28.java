package StringUsingLoop52;
//28. Remove special characters (keep alphanumeric only).
public class QB28 {
public static void main(String[] args) {
	
	String name = "Rahul@#$%123";
	
	String special = "";
	
	for(int i = 0; i<name.length();i++) {
		char c = name.charAt(i);
		
		if((c>='a'&&c<='z')||(c >= 'A' && c <= 'Z')||(c >= '0' && c <= '9')){
			special = special+c;
			
		}
	}
	System.out.println("Remove special:  "+special);
}
}
