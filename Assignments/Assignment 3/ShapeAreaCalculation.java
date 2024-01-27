package Day1;
import java.util.Scanner;
//Define a class Shape with a method area(). Create subclasses like Circle, Rectangle, and Triangle.
//Implement the area() method in each subclass and demonstrate polymorphism by calculating and displaying the area of different shapes.

class Shape{
	public double Area() {
		return 0.0;
	}
}
class Circle extends Shape{
	double radius;
	public double Area() {
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shape{
	double length;
	double width;
	public double Area() {
		return length*width;
	}
}
class Triangle extends Shape{
	double base;
	double height;
	public double Area() {
		return 0.5*base*height;
	}
}
public class ShapeAreaCalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circle circle = new Circle();
		System.out.println("Enter the radius of the circle: ");
		circle.radius=sc.nextDouble();
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter the length of the rectangle: ");
		rectangle.length=sc.nextDouble();
		System.out.println("Enter the width of the rectangle: ");
		rectangle.width=sc.nextDouble();
		Triangle triangle = new Triangle();
		System.out.println("Enter the base of the triangle: ");
		triangle.base=sc.nextDouble();
		System.out.println("Enter the height of the triangle: ");
		triangle.height=sc.nextDouble();
		System.out.println("Area of the Circle is: "+circle.Area());
		System.out.println("Area of the Rectangle is: "+rectangle.Area());
		System.out.println("Area of the Triangle is: "+triangle.Area());
		sc.close();
	}
}
