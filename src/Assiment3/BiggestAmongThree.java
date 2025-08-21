package Assiment3;

import java.util.Scanner;

/* Biggest Among Three
Input 3 numbers.
Use nested if-else to find and print the greatest number.*/
public class BiggestAmongThree {
     public static void main(String[] args) {
    	 
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.println("Enter Three numbers ");
    	 
    	 int a = sc.nextInt();
    	 int b = sc.nextInt();
    	 int c = sc.nextInt();
    	 
    	 if(a>b && a>c ) {
    		 System.out.println("the greatest number is a");
    	 }
    	 else if(b>a && b>c){
    		 System.out.println("the greatest number b");
    	 }	 
    	 else {
    		 System.out.println("the greatest number c");
    	 }
     }
}
