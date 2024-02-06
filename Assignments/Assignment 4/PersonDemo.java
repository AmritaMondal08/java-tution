package Day2;

//Create a class Person with final method introduce() that prints "I am a person". Create subclasses Student and Teacher that inherit 
//from Person. Attempt to override the introduce() method in both subclasses and observe the result.

class person{
	final void introduce() {
		System.out.println("I am a person");
	}
}
class Student extends person{
/*	void introduce(){   (Cannot override the final method introduce())
		System.out.println("I am a student");
	}
*/
}
class Teacher extends person{
/*	void introduce(){   (Cannot override the final method introduce())
		System.out.println("I am a teacher");
	}
*/
}
public class PersonDemo {
	public static void main(String[] args) {
		person ob1=new person();
		ob1.introduce();
		Student ob2=new Student();
		ob2.introduce();
		Teacher ob3=new Teacher();
		ob3.introduce();
	}
}
