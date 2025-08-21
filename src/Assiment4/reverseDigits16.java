package Assiment4;

import java.util.Scanner;

//16. write a program to reverse the given Digits.
public class reverseDigits16 {
	
	 public static void main(String[] args) {
	
	int number = 2652;
	int reverse = 0;
	int original = number;
	
	for(;number!=0; number/=10) {
	int digit = number%10;
	
	reverse = reverse*10+digit;
	}
	 if(original<0) {
		 reverse = -reverse;
	 }
	 System.out.println(reverse);
}
}
