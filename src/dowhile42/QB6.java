package dowhile42;
//6. Print cubes of numbers from 1 to n .
public class QB6 {
public static void main(String[] args) {
	
	int a = 1;
	do {
		int b = a*a*a;
		System.out.println(b);
		a++;
	}while(a<=10);
}
}
