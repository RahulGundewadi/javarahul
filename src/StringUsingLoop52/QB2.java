package StringUsingLoop52;
//2.Count consonants in a string.
public class QB2 {
public static void main(String[] args) {
	
	String name ="RAHUL";
	
	int consonantCount = 0;

	name = name.toUpperCase();
	
		for	(int i=0;i<name.length();i++){
		char c = name.charAt(i);
		
		if(c != 'A' && c != 'E' &&  c != 'I' &&  c != 'O'&&  c != 'U'){
			consonantCount++;
		
	}
	}
    System.out.println(consonantCount);

}
}
