package Day1;

import java.util.Scanner;
public class Temperature {
	static double fahrenheit(double f) {
		return(f*9/5)+32;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the celsious temperature:");
		double c=sc.nextDouble();
		System.out.println("Fahrenheit temperature is: "+fahrenheit(c));
		}
}
