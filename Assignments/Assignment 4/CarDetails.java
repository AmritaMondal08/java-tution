package Day2;

//Define a superclass Vehicle with attributes speed and capacity. Create a subclass Car that inherits from Vehicle and adds a new 
//attribute model. Implement a method displayDetails() in Car that displays all attributes including those from the superclass.

class Vehicle{
	int speed;
	int capacity;
}
class Car extends Vehicle{
	String model;
	public Car(int speed,int capacity,String model) {
		this.speed=speed;
		this.capacity=capacity;
		this.model=model;
	}
	public void displayDetails(){
		System.out.println("Speed: "+speed+"Km/h");
		System.out.println("Capacity: "+capacity+"liter");
		System.out.println("Model: "+model);
	}
}
public class CarDetails {
	public static void main(String[] args) {
		Car ob1=new Car(120,1,"Maruti");
		ob1.displayDetails();
	}
}
