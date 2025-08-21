package dowhile42;
//5. Print squares of numbers from 1 to n (user input).
public class QB5 {
public static void main(String[] args) {
	
	int a = 1;
	do {
		int b = a*a;
		System.out.println(b);
		//System.out.println(b);
		a++;
	}while(a<=10);
}
}
