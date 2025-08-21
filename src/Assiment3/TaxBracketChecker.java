package Assiment3;

import java.util.Scanner;

/*Input income.
Tax slabs:
<2.5L: No tax
2.5L–5L: 5%
5L–10L: 20%
10L: 30%*/
public class TaxBracketChecker {
    public static void main(String[] args) {
    	
    	long g;
    	
      System.out.println("Enter the income");
      
      Scanner sc = new Scanner(System.in);
      
      g = sc.nextLong();
      
      if(g<250000) {
    	  System.out.println("It is No tax");
      }
      else if(g>=250000 && g<=500000) {
    		  System.out.println("It is 5% tax");
    	  }
    	  else  if(g>=500000 && g<=1000000) {
    			  System.out.println("It is 20% tax");
    		  }
    			  
    else {
    	System.out.println("It is 30% tax");
    }
    }
}
