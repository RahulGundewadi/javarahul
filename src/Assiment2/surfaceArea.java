package Assiment2;

/*WAP to find curved surface area of following, using void method
a. Sphere
b. Cylinder
c. Cube
d. cuboid    *Demo3*/

public class surfaceArea {
	
	public void getSphere(double radius) {
		double Sphere = 2*3.14*radius*radius;
		System.out.println("Sphere is :"+ Sphere);
	}
	public void getCylinder(double radius , double hight) {
		double Cylinder = 2*3.14*radius*hight;
		System.out.println("Cylinder is :"+ Cylinder);
	}
	public void getCube(double side) {
		double Cube =4*side*side;
		System.out.println("Cube is :"+ Cube);
	}
	public void getcuboid(double length , double hight , double breadth) {
		double cuboid = 2*length*hight*breadth;
		System.out.println("cuboid is :"+ cuboid);
	}

}
