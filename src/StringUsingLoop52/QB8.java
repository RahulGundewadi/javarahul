package StringUsingLoop52;
//8. Replace all vowels with '*'.
public class QB8 {
	public static void main(String[] args) {

String name = "Rahul";
	
String Replace = "";
	
	
	
	for(int i=0;i<name.length();i++) {
		char c = name.charAt(i);
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
		   c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
		
			Replace = Replace+'*';
		}else {
			Replace = Replace+c;
		}
		}
	
	System.out.println(name);

	System.out.println(Replace);
}
}