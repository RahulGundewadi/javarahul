package dowhile42;

import java.util.Scanner;

//23. Keep asking for a username until "admin" is entered.
public class QB23 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String username;
	
	do {
		System.out.println("Enter username");
		username = sc.next();
	}while(!username.equals("admin"));
	System.out.println("Access granted");
}
}
