package Assiment4;

import java.util.Scanner;

/*8. Write a Java program to display the cube of the given number up to an integer.
Test Data
Input number of terms : 4
Expected Output :
1 Number is : 1 and cube of 1 is : 1
2 Number is : 2 and cube of 2 is : 8
3 Number is : 3 and cube of 3 is : 27
4 Number is : 4 and cube of 4 is : 64*/

public class displayCube18 {
public static void main(String[] args) {
	
	int a = 4;
	
	System.out.println("input number: "+a);
	
	for(int i=1;i<=a;i++) {
		
		int cube = i*i*i;
		
		System.out.println(i+"the number is: "+i+"and cube of : "+i+"is:"+cube);
	}
	
	  
}
}
