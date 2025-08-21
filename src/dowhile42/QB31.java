package dowhile42;
//31. Find the first number greater than 100 that is divisible by both 4 and 6.
public class QB31 {
public static void main(String[] args) {
	int number = 105;
	
	do {
		if(number%4==0 && number%4==0 ) {
			
			System.out.println("The first number greater than 100 that is divisible by both 4 and 6 is: " + number);
		break;
		}
		//System.out.println("invalied input");
number++;
System.out.println("invalied input");
	}while(number>=100);
}
}
