package Assiment3;

import java.util.Scanner;

/*Input a number.
Check if it's positive, negative, or zero.*/
public class PositiveNegativeZero {
			public static void main(String[] args) {
				
				int a;
				System.out.println("Enter the number :");
				
			Scanner sc = new Scanner(System.in);
			
			a = sc.nextInt();
			
			if(a == 0) {
				System.out.println(" It is the zero :");
			}
			else if(a > 0) {
				System.out.println(" It is the positive :");
			}
			else {
				
				System.out.println(" It is the negative :");
			}
			
			}
}
