package Day2;
class Circle{
	final double PI=3.14;
	public double CalculateArea(double a) {
		double Area=PI*a*a;
		return Area;
	}
}
public class CircleArea {
	public static void main(String[] args) {
		Circle ob = new Circle();
		System.out.println("Area of the circle is: "+ob.CalculateArea(3.2));
	}
}
