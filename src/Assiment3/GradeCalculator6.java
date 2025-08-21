package Assiment3;

import java.util.Scanner;

//Input marks (0–100).
//Print grade based on this:
//90–100: A
//80–89: B
//70–79: C
//60–69: D
//Below 60: F
public class GradeCalculator6 {
	
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 int a;
		 
		 System.out.println("Enter a Marks");
		
		 
		 a = sc.nextInt();
		 if(a>=90 && a<=100) {
		 System.out.println("grade is A");
		 }
		 else if(a>=80 && a<=89) {
			 System.out.println("grade is B");	 
		 }
		 else if(a>=70 && a<=79) {
			 System.out.println("grade is C");	 
		 }
		 else if(a>=60 && a<=69) {
			 System.out.println("grade is D");	 
		 }
		 else  {
			 System.out.println("grade is F");	 
		 }
		}
	}
