package dowhile42;
//42. Print the sum of the series: 1 + 1/2 + 1/3 + ... + 1/n
public class QB42 {
public static void main(String[] args) {
	int n = 5;
	double sum = 0.0;
	int i = 1;
	
	do {
		sum +=1.0/i;
		//System.out.println(sum);
		i++;
		//System.out.println(sum);
	}while(i<=n);
	System.out.println(sum);
}
}
