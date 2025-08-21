package whileloop41;
//16. Calculate the factorial of a number.
public class QB16 {
public static void main(String[] args) {
	
	int fact = 1;
	int a = 5;
	int b= a;
	while(b>=1) {
		
		fact *=b;
		System.out.println(fact);
		b--;
	}
}
}
