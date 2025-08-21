package dowhile42;
//16. Calculate the factorial of a number using do-while .
public class QB16 {
	public static void main(String[] args) {
		
int a = 5;
long fact = 1;
int b = a;

do {
	fact *=b;

	System.out.println(fact);
	b--;
}while (b>=1);
}
}
