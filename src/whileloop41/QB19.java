package whileloop41;
//19. Find the product of digits in a number.
public class QB19 {
public static void main(String[] args) {
	
	int a = 263;
	int b = a;
	int pro = 1;
	
	while(a!=0) {
		int i = a%10;
		pro *=i;
		a/=10;
		
		
		System.out.println(pro);
	}
}
}