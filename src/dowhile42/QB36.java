package dowhile42;
//36. Print digits of a number from right to left using do-while .
public class QB36 {
public static void main(String[] args) {
	
	int num = 12345;
	
	do {
		int digit = num%10;
		System.out.println(digit);
		num = num/10;
	}while(num!=0);
}
}
