package Assiment3;

import java.util.Scanner;

/*Input three numbers.
If all are odd → print "Odd Chain".
If all are even → "Even Chain".
Else → "Mixed Chain*/
public class OddEvenChainReaction {
		public static void main(String[] args) {
			
			int a;
			int b;
			int c;
			
			System.out.println("enter the number a:");
			System.out.println("enter the number b:");
			System.out.println("enter the number c:");
			
			Scanner sc = new Scanner(System.in);
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a%2==0 && b%2==0 && c%2==0) {
				System.out.println("all are Even Chain");
			}else if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0) {
				System.out.println("all are Odd Chain");
			}
			else {
				System.out.println("all are Mixed Chain");	
			}
			
		}
}
