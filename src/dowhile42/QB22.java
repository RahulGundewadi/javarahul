package dowhile42;

import java.util.Scanner;

//22. Ask the user to enter a number greater than 100; repeat if input is smaller.
public class QB22 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number;
	do {
		if(number>=100) {
		number = sc.nextInt();
		System.out.println("That's not a valid number: " + number);
		}
	}while (number<=100);
	System.out.println("Thank you! You entered: " + number);
	
}
}
