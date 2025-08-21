package whileloop41;

import java.util.Scanner;

//10. Print the first n even numbers.
public class QB10 {
public static void main(String[] args) {
	
	//Scanner sc = new Scanner(System.in);
	System.out.println("Enter even number:  ");
	
	//int n = sc.nextInt();
	int n = 10;
	int a = 2;
	int b = 0;
	
	while(b<n) {
		System.out.println(a);
		a+=2;
		b++;
	}
}
}
