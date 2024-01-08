//4. Write a Java program that takes a number as input and prints its multiplication table up to 10.
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println("8 X "+i+" = "+(num*i));
        }
        sc.close();
    }
}
