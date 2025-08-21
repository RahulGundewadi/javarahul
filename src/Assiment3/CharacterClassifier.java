package Assiment3;

/*Character Classifier
Input a single character.
Check if it is uppercase, lowercase, digit, or special character
*/
import java.util.Scanner;

public class CharacterClassifier {

	  public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  char ch ;
		  
		  System.out.println("Enter a  character");
		  
		  ch = sc.next().charAt(0);
		  
		  if(ch>='A' && ch<='Z') {
		  System.out.println("it is uppercase");
		  }
		  else if(ch>='a' && ch<='z'){
		  System.out.println("it is lowercase");
		  }
		  else if(ch>= '0' && ch<='9') {
			  System.out.println("it is digit");
		  }
		  else {
			  System.out.println("it is special character"); 
		  }
	  }
	
}
