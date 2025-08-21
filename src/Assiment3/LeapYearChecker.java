package Assiment3;

import java.util.Scanner;

/*
Input a year.
Check if itʼs a leap year using nested conditions (divisible by 4, not 100 unless divisible by 400).*/

public class LeapYearChecker {
				public static void main(String[] args) {
					
					int year;
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Enter the year :");
					
					year = sc.nextInt();
					
					if(year % 4 == 0) {
						System.out.println("It is the leap year :");
					}
					else if(year % 100 == 0) {
						System.out.println("It is the leap year :");
					}
					else if(year % 400 == 0) {
						System.out.println("It is the leap year :");
					}
					
					else  {
						System.out.println("It is the not leap year :");
					}
				}
}
