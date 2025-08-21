package lecture;

import java.util.Scanner;

public class Authenticator {
	//1. input from Scanner ->username and password in tring
	//2. validate if password and username are correct
	//3. if yes > login successful
	//4. if no >invalid username //invalid password
	
	public static void main(String[] args) {
		       
		String username;
		String password;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the username");
		System.out.println("Enter the password");
		username = sc.next();
		password = sc.next();
		
		if(username>=a && username<=z && username>=A && username<=z ) {
			if(password >=0 && password=<9999) {
				System.out.println("login successful");
			}else {
				System.out.println("invalid password");
			}
		}else {
			System.out.println("invalid username");
		}
	
	
	}
	
}
		
		   
	
	



