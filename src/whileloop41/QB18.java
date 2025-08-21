package whileloop41;
//18. Check if a number is a palindrome.
public class QB18 {
public static void main(String[] args) {
	
	int a = 121;
	int b= a;
	int rev = 0 ;
	
	while(a!=0) {
		int i = a%10;
		rev = rev*10+i;
		a/=10;
		System.out.println(rev);
		if(b==rev) {
			System.out.println("is a palindrome");
		}else {
			System.out.println("is not a palindrome");
		}
	}
	
}
}
