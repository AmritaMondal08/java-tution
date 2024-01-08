//Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        float width = sc.nextFloat();
        System.out.println("Enter the height:");
        float height = sc.nextFloat();
        float perimeter = 2*(width + height);
        float area = width*height;
        System.out.println("Perimeter = "+perimeter);
        System.out.println("Area"+area);
        sc.close();
    }
}
