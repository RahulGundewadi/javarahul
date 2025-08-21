package Assiment4;
////13.Write a program to find sum of all odd numbers between 1 to n


public class oddSum13 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int a=1;a<=10;a++) {
			if(a%2!=0) {
				sum = sum+1;
			}
			
		}
		
	
		System.out.println(sum);
	
		
	}

}
