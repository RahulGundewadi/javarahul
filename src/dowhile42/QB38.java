package dowhile42;
//38. Convert a binary number (as int) to decimal using a loop.
public class QB38 {
public static void main(String[] args) {
	
	int binary = 111;
	int a = 1;
	int ans = 0;
	do {
		int lastdigit = binary%10;
		binary = binary/10;
		ans = ans+a*lastdigit;
		a = 2*a;
	//	System.out.println(ans);
	}while(binary!=0);
	System.out.println(ans);
}
}
