package Assiment3;
/*Input 3 sides of triangle.
Check and classify: equilateral, isosceles, or scalene*/
public class ThreeSidedShapeType {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		int c = 8;
		
		if(a == b && b == c && c == b ) {
			System.out.println("equilateral");
		}else if(a == b || b == c || c == b ) {
			System.out.println("isosceles");
		}else {
			System.out.println("scalene");	
		}
				
	}

}
