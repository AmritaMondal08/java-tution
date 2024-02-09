package Day2;

//Define a superclass Animal with a protected attribute name. Create a subclass Dog in the same package that overrides a method 
//getName() to return the name of the dog.

class Animal{
	protected String name;
	protected String getName() {
		return name;
	}
}
class Dog extends Animal{
	protected String getName() {
		return name;
	}
}
public class Animalinfo {
	public static void main(String[] args) {
		Dog ob=new Dog();
		ob.name="Labrador";
		System.out.println(ob.getName());
	}
}
