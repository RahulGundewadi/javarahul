package StringUsingLoop52;
//18. Remove duplicate characters (preserve order).
public class QB18 {
public static void main(String[] args) {
	String name = "raahuulnn";
	String dupli = "";
	
	for(int i=0;i<name.length();i++) {
		char c = name.charAt(i);
		
		if( dupli.indexOf(c)== -1) {
			dupli = dupli+c;
		}
	}
	System.out.println(dupli);
}
}
