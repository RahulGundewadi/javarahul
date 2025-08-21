package whileloop41;
//5. Print the multiplication table of a number (e.g. 7) up to 10.
public class QB5 {
	public static void main(String[] args) {
		int a = 7;
		int b = 1;
		while(b<=10) {
			System.out.println(a+"*"+b+"="+(a*b));
			b++;
		}
	}

}
