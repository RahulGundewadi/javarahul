package whileloop41;

import java.util.Scanner;

//9. Print the first n natural numbers.
public class QB9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int a = 1;
		
		while(a==n) {
			System.out.println(a);
			a++;
		}
	}

}
