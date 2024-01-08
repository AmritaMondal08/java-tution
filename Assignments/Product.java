//2. Write a Java program that takes two numbers as input and displays the product of two numbers.
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Input the first number");
        float num1=sc.nextFloat();
        System.out.println("Input the second number");
        float num2=sc.nextFloat();
        float result = num1*num2;
        System.out.println(num1+"*"+num2+"="+result);
        sc.close();
    }
}
