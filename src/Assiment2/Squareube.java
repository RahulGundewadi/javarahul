package Assiment2;
//WAP to find the square, cube of a single number. Input should be given through constructor.

public class Squareube {

	int a;
	
	public  Squareube(int num ) {
		
		
		a = num;
	}
	public void findSquare() {
		int Square = a*a;
		System.out.println("Square is  "+  a+"is"+  Square);
	}
	public void findcube() {
		int cube = a*a*a;
		System.out.println("cube is  "+  a+"is"+  cube);
	}
	
}
