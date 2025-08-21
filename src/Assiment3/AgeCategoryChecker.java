package Assiment3;

import java.util.Scanner;

/*Input age.
Categorize:
0–12: Child
13–17: Teen
18–59: Adult
60+: Senior*/
public class AgeCategoryChecker {

	public static void main(String[] args) {
		
		int age = 15;
		
			/*Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter age :");
			
			age = sc.nextInt();*/
			
      		if(age>=0 && age<=12) {
      			System.out.println("It is Child :");
      		}
      		else if(age>=13 && age<=17) {
      			System.out.println("It is Teen :");	
      		}
      		else if(age>=18 && age<=59) {
      			System.out.println("It is Adult :");	
      		}
      		else {
      			System.out.println("It is Senior" );	
      		}
	}
}
