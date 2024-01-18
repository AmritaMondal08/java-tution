package Day1;

//3. Write a program to return a count of the total number of students in a class using the concept of static variable and static method.

public class StudentCount {
	static int count=0;
	static void count() {
		count++;
	}
	public static void main(String[] args) {
	StudentCount std1=new StudentCount();
	std1.count();
	StudentCount std2=new StudentCount();
	std2.count();
	StudentCount std3=new StudentCount();
	std3.count();
	StudentCount std4=new StudentCount();
	std4.count();
	StudentCount std5=new StudentCount();
	std5.count();
	System.out.println("Total Number of Student in the Class: "+count);
	}
}
