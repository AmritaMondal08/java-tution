package Day1;

/*Create a program that uses StringBuilder to perform the following operations:

Concatenate two strings.
Reverse a string.
Replace a substring with another substring.*/
public class StringBuilderInJava {
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("MCKV Institute Of Engineering");
		StringBuilder str1=new StringBuilder("is for CSEDS");
		StringBuilder str2=new StringBuilder("MCKV Institute Of Engineering");
		//Concatenate two strings
		str.append(str1);
		System.out.println(str);
		
		//Concatenate two strings
		str.reverse();
		System.out.println(str);
		
		//Replace a substring with another substring
		str2.replace(7, 10, "CSE");
		System.out.println(str2);
	}
}
