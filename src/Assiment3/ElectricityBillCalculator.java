package Assiment3;

import java.util.Scanner;

/*Input total units consumed.
Use nested if-else to calculate cost:
≤100 units: ₹5/unit
101–300: ₹7/unit
300: ₹10/unit*/
public class ElectricityBillCalculator {
	public static void main(String[] args) {
		
	/*	int  totalUnits;
		
	Scanner sc = new Scanner(System.in);
	int totalUnits = sc.nextInt();
	*/
		
		int totalUnits = 20;
	if(totalUnits<=100) {
		int sum = totalUnits*5;
		System.out.println("It is 5ru/unit");
		System.out.println(sum);
	}
	else if(totalUnits>101 && totalUnits<300) {
		int sum = totalUnits*7;
		System.out.println("It is 7ru/unit");
		System.out.println(sum);
	}
	else {
		int sum = totalUnits*10;
		System.out.println("It is 10ru/unit");
		System.out.println(sum);
	}
	}
}
