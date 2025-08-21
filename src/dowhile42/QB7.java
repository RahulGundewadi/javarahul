package dowhile42;
//7. Print all numbers divisible by 3 between 1 and 30.
public class QB7 {
public static void main(String[] args) {
	
	int a = 1;
	do {
		if(a%3==0) {
		System.out.println(a);
		}
		a++;
	}while( a<=30 );
}
}
