// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Input the first number");
        float num1=sc.nextFloat();
        System.out.println("Input the second number");
        float num2=sc.nextFloat();
        System.out.println("Input the third number");
        float num3=sc.nextFloat();
        float avg = (num1+num2+num3)/3;
        System.out.println("Average of the number is: "+avg);
        sc.close();
    }
}
