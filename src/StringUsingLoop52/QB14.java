package StringUsingLoop52;
//14. Check if all characters are alphabetic.
public class QB14 {
public static void main(String[] args) {
	
	String name = "gvjbg";
	boolean  alphabetic = true;
	
	for(int i = 0; i<name.length();i++) {
		char c = name.charAt(i);
		
		if(Character.isLetter(c)){
			
			alphabetic=true;
				
		}else {
			alphabetic=false;
		}
	}
	System.out.println(alphabetic);	
}
}
