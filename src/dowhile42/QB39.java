package dowhile42;
//39. Convert a decimal number to octal using a loop.
public class QB39 {
public static void main(String[] args) {
	int decimal = 100;
	int a = decimal;
	String octal = "";
	do {
		int remainder = decimal %8;
		octal = remainder + octal;
		decimal = decimal/8;
	
	}while(decimal>0);
	System.out.println(octal);
}
}
