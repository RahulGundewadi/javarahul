package dowhile42;
//41. Print the series: 2 4 8 16 32 ... up to n terms.
public class QB41 {
public static void main(String[] args) {
	int b = 10;
	int term = 2;
	int count = 1;
	do {
		System.out.println(term);
		term *=2;
		count++;
	}while(count<=10);
}
}
