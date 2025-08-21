package Assiment3;

import java.util.Scanner;

/*Input marks in 3 subjects.
If any subject is below 33, print "Fail", else print "Pass"*/
public class ExamPassFail {
      public static void main(String[] args) {
    	  
    	  int english;
    	  int maths;
    	  int science;
    	  
    	  System.out.println("Enter three subject marks");
    	  
    	  Scanner sc = new Scanner(System.in);
    	  
    	  english = sc.nextInt();
    	  maths = sc.nextInt();
    	  science = sc.nextInt();
    	  
    	  if(english>33 && maths>33 && science>33) {
    		   System.out.println("it is the pass");
    	  }
    	  else {
			  System.out.println("it is the subject has marks  less than 33 . it is  fail");
		  }
      }
}
