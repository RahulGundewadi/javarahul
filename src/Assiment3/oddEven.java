/* Even or Odd Difference
Input two integers.
Print the larger one only if it is even; else print the smaller one.
*/

package Assiment3;

import java.util.Scanner;

public class oddEven {
	
	public static void main(String[] args){
		
		
		/* Scanner sc = new Scanner(System.in);
			
		
		 System.out.println("Enter two integers");
		 int a = sc.nextInt();
			int b = sc.nextInt();	*/
			int a = 6;
			int b = 2;
			
		 if(a%2==0 && b%2==0) {
			 if(a>b) {
			 System.out.println("the larger even is a");
		 }
		 }
		 else {
			 System.out.println("the smaller is b");
		 }
	}
}

