package StringUsingLoop52;
//23. Shift characters by one (e.g., 'a' → 'b').
public class QB23 {
public static void main(String[] args) {
	
	String name = "Rahul";
	String Shift = "";
	
	for(int i=0; i<name.length();i++) {
		char c = name.charAt(i);
		
			if(c>='a' && c<='z') {
			c = (char)((c-'a'+1)%26+'a');
		}else if(c>='A' && c<='Y') {
			c = (char)((c-'A'+1)%26+'A');
		}
		Shift = Shift+c;
	
	}
	System.out.println("Original: " + name);
    System.out.println("Shifted : " + Shift);
}
}