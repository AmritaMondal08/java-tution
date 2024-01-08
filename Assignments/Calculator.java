//3. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Input the first number");
        float num1=sc.nextFloat();
        System.out.println("Input the second number");
        float num2=sc.nextFloat();
        float result=num1+num2;
        System.out.println(num1+"+"+num2+"="+result);
        float result1=num1-num2;
        System.out.println(num1+"-"+num2+"="+result1);
        float result2=num1*num2;
        System.out.println(num1+"*"+num2+"="+result2);
        float result3=num1/num2;
        System.out.println(num1+"/"+num2+"="+result3);
        float result4=num1%num2;
        System.out.println(num1+"mod"+num2+"="+result4);
        sc.close();
    }
}
