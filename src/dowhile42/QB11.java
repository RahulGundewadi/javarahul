package dowhile42;
//11. Find the sum of numbers from 1 to n .

public class QB11 {
public static void main(String[] args) {
	int a = 1;
	int n = 10;
	int sum = 0;
	do {
		sum +=a;
		System.out.println(sum);
		a++;
	}while(a<=n);
}
}
