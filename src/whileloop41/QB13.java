package whileloop41;
//13. Find the sum of odd numbers between 1 and n .
public class QB13 {
	public static void main(String[] args) {
		
		int n = 10;
		int a = 1;
		
		int sum = 0;
		
		while(a<=n) {
			if(a%2!=0) {
				sum += a;
				a+=2;
				System.out.println(sum);
			}
		}
	}

}
