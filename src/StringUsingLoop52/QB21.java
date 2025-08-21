package StringUsingLoop52;
//21. Replace spaces with hyphens.
public class QB21 {
public static void main(String[] args) {
	String name = "Rahul Appaso Gundewadi";
	String a = "";
	
	for(int i = 0; i<name.length();i++) {
		char c =name.charAt(i);
		if(c ==' ') {
			a = a+'-';

		}else {
			a = a+c;
		}
	}
	System.out.println(a);
}
}
