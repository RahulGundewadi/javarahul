package dowhile42;
//15. Calculate the sum of digits of a number

public class QB15 {
public static void main(String[] args) {
	
	int a = 123;
	int sum = 0;

	do {
		int digit = a%10;
		
	sum +=digit;
	a = a/10;
		System.out.println(sum);
		
	}while(a>0);
	
}

}
