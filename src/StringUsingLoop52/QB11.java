package StringUsingLoop52;
//11. Count frequency of a specific character
public class QB11 {
public static void main(String[] args) {
	
	String name = "Raaalhk";
	char fre = 'o';
	
	int count = 0;
	
	for(int i = 0; i<name.length(); i++) {
		if(name.charAt(i)  ==  fre) {
			count++;
		}
	}
	System.out.println("frequency:"+count);
}
}
