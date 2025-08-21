package dowhile42;
//8. Print numbers from 1 to n but skip multiples of 5.
public class QB8 {
public static void main(String[] args) {
	
	int a = 1;
	
	do {
		if(a%5!= 0) {
		System.out.println(a);
	}
		a++;
	}while(a<=30);
}
}
