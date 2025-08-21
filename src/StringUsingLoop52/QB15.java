package StringUsingLoop52;
//15. Calculate ASCII sum of all characters.
public class QB15 {
public static void main(String[] args) {
	
String name = "rahul";
	int  sum = 0;
	
	for(int i = 0; i<name.length();i++) {
	
		char c = name.charAt(i);
		
		sum = sum+(int)c;
		
		
	}
	System.out.println(sum);
	
	
}
	
	  /*  public static void main(String[] args) {
	        String input = "rahul";
	        int asciiSum = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            asciiSum += (int) c;
	        }

	        System.out.println("ASCII sum of all characters: " + asciiSum);
	    }*/
	
}
