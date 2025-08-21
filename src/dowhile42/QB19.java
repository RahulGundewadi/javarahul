package dowhile42;
//19. Find the maximum digit in a number.
public class QB19 {
public static void main(String[] args) {

	int a = 61239;
	int b  = a;
	int gre = 0;
	
	do{
		int i = a%10;
		if(i>gre) {
			gre = i;
		}
		a/=10;
		System.out.println(gre);
	}while(a!=0);
}
}
