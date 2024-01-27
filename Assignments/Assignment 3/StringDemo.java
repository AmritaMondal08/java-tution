package Day1;

//3: Write a program that takes a sentence as input and prints the following:
//Number of words in the sentence.
//Number of vowels and consonants.
//The sentence in reverse order.
public class StringDemo {
	public static void main(String[] args) {
		String clg = "MCKV INSTITUTE OF ENGINEERING";
		
		//To print number of words in the sentence
		System.out.println(clg.length());
		
		//To print number of vowels and consonants
		int vowel=0;
		int consonant=0;
		for(int i=0; i<clg.length(); i++) {
			if(clg.charAt(i)=='A'||clg.charAt(i)=='E'||clg.charAt(i)=='I'||clg.charAt(i)=='O'||clg.charAt(i)=='U') {
				vowel++;
			}
			else if(clg.charAt(i)>'A' && clg.charAt(i)<'Z') {
				consonant++;
			}
		}
		System.out.println("The numbers of vowels in the sentence: "+vowel);
		System.out.println("The numbers of consonants in the sentence: "+consonant);
		
		//To print the sentence in reverse order
		StringBuilder reversestring=new StringBuilder(clg);
		reversestring.reverse();
		reversestring.toString();
		System.out.println(reversestring);
	}
}
