package StringUsingLoop52;
//30. Print frequency of each character.
public class QB30 {
public static void main(String[] args) {
	
	String name = "Raaahul";
	int count = 0;
	char c = 'a';
	
	for(int i=0; i<name.length();i++) {
		if(c == name.charAt(i)) {
			count++;
		}
	}
	System.out.println(c+"frequency  character  "+count);
}
}
