package dowhile42;
//12. Find the sum of even numbers between 1 and n .

public class QB12 {
public static void main(String[] args) {
	
	int n = 10;
	int a = 2;
	int sum = 0;
	
	do {
		if(a%2==0) {
			sum +=a;
			System.out.println(sum);
			a+=2;
		}
	}while(a<=n);
}
}
