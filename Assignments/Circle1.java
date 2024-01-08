// Write a Java program to print the area and perimeter of a circle using findCircle() method.
public class Circle1 {
    public static void findCircle(double r){
        double perimeter=2*Math.PI*r;
        double area=Math.PI*r*r;
        System.out.println("Perimeter="+perimeter);
        System.out.println("Area="+area);
    }
    public static void main(String[] args){
        double r=7.5;
        findCircle(r);
    }
}
