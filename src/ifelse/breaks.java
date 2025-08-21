package ifelse;
import java.util.Scanner;

public class breaks {
         
public static void main(String[] args) {
		
		String input ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the day");
		
		input = sc.next();
		
		switch (input) {
		case "Monday":{
			System.out.println("1");
			break;
		}case "Tuesday":{
			System.out.println("2");
			break;
		}case "Wenesday":{
			System.out.println("3");
			break;
		}case "Thursday":{
			System.out.println("4");
			break;
		}case "Friday":{
			System.out.println("5");
			break;
		}case "Saturday":{
			System.out.println("6");
			break;
		}case "sunday":{
			System.out.println("7");
			break;
		}
}
}
}