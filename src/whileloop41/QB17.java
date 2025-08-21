package whileloop41;
//17. Reverse the digits of a number (e.g., 123 → 321).
public class QB17 {
public static void main(String[] args) {
	
	int a = 123;
	int rev = 0;
	int b = a;
	
	while(a!=0) {
		int i = a%10;
		rev = rev * 10+i;
	    a/=10;
		System.out.println(rev);
		}
	
}
}
