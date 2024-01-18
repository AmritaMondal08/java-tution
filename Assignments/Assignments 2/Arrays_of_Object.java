package Day1;
import java.util.Scanner;
public class Arrays_of_Object {
	int roll;
	int hist;
	int geo;
	int math;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int num = sc.nextInt();
		Arrays_of_Object ob[]=new Arrays_of_Object[num];
		for(int i=0;i<num;i++) {
			ob[i]=new Arrays_of_Object();
			System.out.println("Enter the Roll:");
			ob[i].roll=sc.nextInt();
			System.out.println("Enter History number:");
			ob[i].hist=sc.nextInt();
			System.out.println("Enter Geography number:");
			ob[i].geo=sc.nextInt();
			System.out.println("Enter Math number:");
			ob[i].math=sc.nextInt();
		}
		for(int i=0;i<num;i++) {
			System.out.println("Roll:"+ob[i].roll);
			System.out.println("Avg:"+(ob[i].hist+ob[i].geo+ob[i].math)/3);
			}
	}
}
