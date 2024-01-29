package Day1;

//1:Create a class Vehicle with attributes like make, model, and year. Then, create two subclasses, Car and Motorcycle. 
//Implement appropriate constructors and methods to showcase inheritance.

class Vehicle{
	String make;
	String model;
	int py=2014;
	public int Year(){
		return py;
	}
}
class Car extends Vehicle{
	Car(String make,String model,int py) {
		this.make=make;
		this.model=model;
		this.py=py;
		System.out.println(make+" "+model);
		
	}
	public int Year(){
		return py;
	}
}
class MotorCycle extends Vehicle{
	MotorCycle(String make,String model,int py) {
		this.make=make;
		this.model=model;
		this.py=py;
		System.out.println(make+" "+model);
	}
	public int Year(){
		return py;
	}
}
public class VehicleDemo {
	public static void main(String[] args) {
		Car car1=new Car("Suzuki","MARUTI SUZUKI",1985);
		System.out.println(car1.py);
		MotorCycle motor1=new MotorCycle("HMSI","HONDA SHINE",2000);
		System.out.println(motor1.py);
	}
}
