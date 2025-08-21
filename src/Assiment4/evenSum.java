package Assiment4;
//12. Write a program to find sum of all even numbers between 1 to n
public class evenSum {
public static void main(String[] args) {
	int sum = 0;
	
	
	for(int a=1; a<=10;a++) {
		if(a%2==0) {
		sum =sum+a;
		
	}
		}
	System.out.println(sum);
}
}
