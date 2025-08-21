package whileloop41;
//12. Find the sum of even numbers between 1 and n .
public class QB12 {
public static void main(String[] args) {
	
	int n = 10;
	int a = 2;
	int sum = 0;
	while(a<=n) {
		if(a%2==0) {
			 sum += a;
			a+=2;
			System.out.println(sum);
		}
	}
}
}
