package dowhile42;
//17. Reverse the digits of a number (e.g., 456 → 654).
public class QB17 {
public static void main(String[] args) {
	int a = 1234;
	int rev = 0;
	int b = a;
	
	do{
		int i = a%10;
		rev = rev * 10+i;
	    a/=10;
		System.out.println(rev);
	  }	while(a!=0);
}
}
