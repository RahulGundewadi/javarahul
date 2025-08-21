package StringUsingLoop52;
//26. Count total words in a sentence.
public class QB26 {
public static void main(String[] args) {
	
	String sent = " dj bgc bu ";
	int count = 0;
	boolean word = false;
	
	for(int i = 0; i<sent.length();i++) {
		char c = sent.charAt(i);
		
		if(c!=' ' && !word) {
			word = true;
			count++;
		}else if(c == ' ') {
			word = false;
		}
	}
	System.out.println(sent);
	System.out.println(count);
}
}
