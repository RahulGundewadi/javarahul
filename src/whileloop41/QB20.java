package whileloop41;
//20. Find the greatest digit in a number.
public class QB20 {
	public static void main(String[] args) {
	
	int a = 6125;
	int b  = a;
	int gre = 0;
	
	while(a!=0) {
		int i = a%10;
		if(i>gre) {
			gre = i;
		}
		a/=10;
		System.out.println(gre);
	}
	//a/=10;
	//System.out.println();
	}
}


