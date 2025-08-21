package Assiment3;
/*Input username and password.
If both match predefined values (hardcoded), print "Access Granted", else "Denied"*/
public class LoginAuthentication {
			public static void main(String[] args) {
				
				String username = "Rahul";
				int password = 621;
				
				if(username == "Rahul" && password>0 && password<9999 ) {
					System.out.println("Access Granted");
				}else {
					System.out.println("Denied");
				}
			}
}
