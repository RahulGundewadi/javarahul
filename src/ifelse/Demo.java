package ifelse;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int a ;
		a = sc.nextInt();
		
		if(a == 1) {
			System.out.println("monday");
		}if(a == 2) {
			System.out.println("Tuesday");
		}if(a == 3) {
			System.out.println("Wenesday");
		}if(a == 4) {
			System.out.println("Thursday");
		}if(a == 5) {
			System.out.println("Friday");
		}if(a == 6) {
			System.out.println("Saturday");
		}if(a == 7) {
			System.out.println("sunday");
		}
		
	}

}
