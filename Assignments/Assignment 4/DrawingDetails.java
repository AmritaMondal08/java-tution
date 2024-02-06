package Day3;

//Create a class Shape with a method draw() that prints "Drawing Shape". Extend this class with subclasses Circle and Rectangle. 
//Override the draw() method in both subclasses to print "Drawing Circle" and "Drawing Rectangle" respectively.

class Shape{
	public void draw() {
		System.out.println("Drawing Shape");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}
public class DrawingDetails {
	public static void main(String[] args) {
		Circle ob1=new Circle();
		Rectangle ob2=new Rectangle();
		ob1.draw();
		ob2.draw();
	}
}
