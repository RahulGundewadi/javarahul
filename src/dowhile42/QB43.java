package dowhile42;
//43. Generate and print the first n terms of the Tribonacci series.
public class QB43 {
public static void main(String[] args) {
	
	int n = 10;
	int t0 = 0, t1=1,t2=1;
	int count = 0;
	
	do {
		if(count==0) {
			System.out.println(t0);
		}else if(count==1) {
			System.out.println(t1);
		}else if(count==2) {
			System.out.println(t2);
		}else {
		int t3 = t0+t1+t2;
		System.out.println(t3);
		t0=t1;
		t1=t2;
		t2=t3;
	}
		count++;
	}while(count<n);
	
}
}
