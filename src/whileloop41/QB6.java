package whileloop41;
//6. Print all numbers divisible by 5 between 1 and 100.
public class QB6 {
	public static void main(String[] args) {
		int a = 1;
	//	int b = 5;
		 
		while(a <= 100) {
			
			if(a%5 == 0) {
			System.out.println(a);
			}
			a++;
	}
	}
}
