package dowhile42;
//18. Find the product of digits in a number.
public class QB18 {
public static void main(String[] args) {
	int a = 263;
	int b = a;
	int pro = 1;
	
	do {
		int i = a%10;
		pro *=i;
		a/=10;
		
		System.out.println(pro);
	}while(a!=0);
}
}
