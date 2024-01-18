package Day1;

public class CalculateArea {
	public double AreaOfCircle(double a) {
		double AreaOfCircle = Math.PI*a*a;
		return AreaOfCircle;
	}
	public double AreaOfSquare(double a) {
		double AreaOfSquare = a*a;
		return AreaOfSquare;
	}
	public double AreaOfRectangle(double a,double b) {
		double AreaOfRectangle = a*b;
		return AreaOfRectangle;
	}
	public double AreaOfCylinder(double c,double d) {
		double AreaOfCylinder = (2*Math.PI*c)+(2*Math.PI*d);
		return AreaOfCylinder;
	}
	public static void main(String[] args) {
		CalculateArea ob = new CalculateArea();
		System.out.println("Area of the Circle:"+ob.AreaOfCircle(3.2));
		System.out.println("Area of the Square:"+ob.AreaOfSquare(5.4));
		System.out.println("Area of the Rectangle:"+ob.AreaOfRectangle(2.4,8.6));
		System.out.println("Area of the Cylinder:"+ob.AreaOfCylinder(4.2,6.4));
	}
}
