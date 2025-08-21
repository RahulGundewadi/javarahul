package dowhile42;
//44. Create a star pattern of fixed rows using a do-while loop.
public class QB44 {
	public static void main(String[] args) {
		
		int rows = 5;
		int b = 1;
	
		do {
			int a = 1;
			do {
			System.out.println("*"+a);
			a++;
			}while(a<=b);
			System.out.println();
			b++;
		}while(b<=rows);
	}

}
