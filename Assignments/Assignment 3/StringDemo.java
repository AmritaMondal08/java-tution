package Day1;

//3: Write a program that takes a sentence as input and prints the following:
//Number of words in the sentence.
//Number of vowels and consonants.
//The sentence in reverse order.
import java.util.Scanner;
public class StringDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		//To print number of words in the sentence
		int l=str.length();
		System.out.println(l);
		
		//To print number of vowels and consonants
		int vowel=0;
		int consonant=0;
		for(int i=0; i<clg.length(); i++) {
			if(clg.charAt(i)=='A'||clg.charAt(i)=='E'||clg.charAt(i)=='I'||clg.charAt(i)=='O'||clg.charAt(i)=='U'||
			  str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')) {
				vowel++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				consonant++;
			}
		}
		System.out.println("The numbers of vowels in the sentence: "+vowel);
		System.out.println("The numbers of consonants in the sentence: "+consonant);
		
		//To print the sentence in reverse order
		String s=" ";
		for(int i=l-1;i>=0;i--) {
			s=s+str.charAt(i);
		}
		System.out.println("Reverse of the string is: "+s);
		sc.close();
	}
}
