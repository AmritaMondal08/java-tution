package Day1;

//1:Create a class Vehicle with attributes like make, model, and year. Then, create two subclasses, Car and Motorcycle. 
//Implement appropriate constructors and methods to showcase inheritance.

class Vehicle{
	String make;
	String model;
	int Year;
}
class Car extends Vehicle{
	public void Car() {
		System.out.println("The Car making company is: "+make);
		System.out.println("The Car model name is: "+model);
		System.out.println("The Car making year is: "+Year);
		
	}
}
class MotorCycle extends Vehicle{
	public void MotorCycle() {
		System.out.println("The MotorCycle making company is: "+make);
		System.out.println("The MotorCycle model name is: "+model);
		System.out.println("The MotorCycle making year is: "+Year);
	}
}
public class VehicleDemo {
	public static void main(String[] args) {
		Car car1=new Car();
		MotorCycle motor1=new MotorCycle();
		car1.make="Suzuki";
		car1.model="MARUTI SUZUKI";
		car1.Year=1985;
		car1.Car();
		motor1.make="HMSI";
		motor1.model="HONDA SHINE";
		motor1.Year=2000;
		motor1.MotorCycle();
	}
}
