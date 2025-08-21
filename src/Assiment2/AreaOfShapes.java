
package Assiment2;

/*WAP with parameterized method to calculate Area of following shapes
a. Square Area=side*side
b. Rectangle Area=length×width
c. Circle Area π×radius *radius
d. Rhombus    *Demo2 */

public class AreaOfShapes {
	
	public void printSquare(double side) {
		
		double s = side*side;
		System.out.println("Square Area is :" +  s );
		
	}
	public void printRectangle(double length , double width) {
		
		double R = length*width;
		System.out.println("Rectangle Area is :" +  R);
	}
    public void printCircle(double radius) {
		
		double C = 3.14*radius;
		System.out.println("Circle Area is :" +  C);
	}
    public void printRhombus(double d1 , double d2) {
		
		double g = (d1*d2)/2;
		System.out.println("Rhombus Area is :" +  g);
	}


}
