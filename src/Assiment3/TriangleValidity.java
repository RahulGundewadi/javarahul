package Assiment3;
/*Triangle Validity
Input 3 angles.
Check if they form a valid triangle (sum = 180 and all > 0)*/
import java.util.Scanner;

public class TriangleValidity {
	
    public static void main(String[] args) {
    	 
    	//Scanner sc = new Scanner(System.in);
    	int a = 60;
    	int b = 70;
    	int c = 50;
    	
    	/*System.out.println("Enter  angle a:");
    	System.out.println("Enter  angle b:");
    	System.out.println("Enter  angle c:");*/
    	
    	//int a = sc.nextInt();
    	//int b = sc.nextInt();
    	//int c = sc.nextInt();
    	
    	int totalTriangle = a+b+c;
    	
     	if(totalTriangle == 180 && a>0 && b>0 && c>0) {
     		System.out.println("valid triangle");
     	}
     	else {
     		System.out.println("not valid triangle");	
     	}
    }
}
