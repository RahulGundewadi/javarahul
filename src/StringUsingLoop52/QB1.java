package StringUsingLoop52;
//1. Count vowels in a string.
public class QB1 {
public static void main(String[] args) {
	
		String name ="RAHUL";
		
		int vowelcount = 0;
		
		name = name.toUpperCase();
		
			for	(int i=0;i<name.length();i++){
			char c = name.charAt(i);
			
			if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
			vowelcount++;
			
		}
		}
        System.out.println(vowelcount);
}
}
































