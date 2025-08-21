package dowhile42;
//40. Check if a number has more even digits or odd digits.
public class QB40 {
public static void main(String[] args) {
	
	int number = 47289;
	int a = number;
	
	int evenCount = 0;
	int oddCount = 0;
	
	do {
		int digit = number%10;
		if(digit%2 == 0) {
			evenCount++;
		}else {
			oddCount++;
		}
		number = number/10;
	}while(number>0);
	System.out.println("Number of Even number:"+evenCount);
	System.out.println("Number of Even number:"+oddCount);
	
}
}
