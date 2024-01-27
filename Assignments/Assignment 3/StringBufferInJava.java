package Day1;

/*Implement a program that uses StringBuffer to perform the following operations:
Append two strings.
Insert a string at a specific position.
Delete a substring from the buffer.*/
public class StringBufferInJava {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("MCKV Institute Of Engineering");
		StringBuffer str1=new StringBuffer("MCKV Institute Of Engineering");
		StringBuffer buffer=new StringBuffer("I am Amrita Mondal");
		//Append two strings
		str.append("is a college");
		System.out.println(str);
		
		//Insert a string at a specific position
		str1.insert(8, "abc");
		System.out.println(str1);
		
		//Delete a substring from the buffer
		buffer.delete(7, 10);
		System.out.println(buffer);
	}
}
