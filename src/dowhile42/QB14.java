package dowhile42;
//14. Count the number of digits in a number
public class QB14 {
public static void main(String[] args) {
	
int n = 10023;
	
	int count = 0;
	
	do {
		n = n/10;
		
		count++;
		
	}while(n!=0);
	System.out.println(count);
}
}
