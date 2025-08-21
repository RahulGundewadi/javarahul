package StringUsingLoop52;
//24. Compress string as counts (e.g., "aaabb" → "a3b2" ).
public class QB24 {
public static void main(String[] args) {
	
	String name = "rrrhhllll";
	String Compress = "";
	int count = 1;
	
	for(int i = 0; i<name.length();i++) {
		if(i < name.length()-1 && name.charAt(i)==name.charAt(i+1)) {
			count++; 
		}else {
			Compress = Compress+name.charAt(i)+String.valueOf(count);
			count = 1;
		}
	}
	
	System.out.println(Compress);
}
}
