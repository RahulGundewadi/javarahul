package Assiment3;

import java.util.Scanner;

/*ATM Withdrawal
Input balance and withdrawal amount.
If withdrawal is a multiple of 100 and ≤ balance, approve. Else reject*/
public class ATMWithdrawal {
        public static void main(String[] args) {
	/*long a;
    long h;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total balance amount :");
   
      h = sc.nextLong();
      System.out.println("Enter the withdrawal amount");
    a = sc.nextLong();*/
        	int b = 300;
        	int a = 250;
        	
    
    if( b>a&&a%100==0 ) {
    	 System.out.println("withdrawal amount approve");
    }else {
    	System.out.println("withdrawal amount reject");
    }
	}
}
