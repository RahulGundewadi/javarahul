package dowhile42;
//45. Create a triangle number pattern using do-while .
public class QB45 {
public static void main(String[] args) {
	
	int  triangle = 5;
	
	int a = 1;
	do {
		int b = 1;
		do{
			System.out.print(b);
			b++;
		}while(b<=a);
		System.out.println();
		a++;
	}while(a<=triangle);
}
}