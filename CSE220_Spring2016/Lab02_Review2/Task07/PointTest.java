import java.util.Scanner;

public class PointTest{
	public static void main(String[] args) {

              Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point: ");
       System.out.print("X co-oridinate: ");
       int fristCo = input.nextInt();
       System.out.println();
       System.out.print("Y co-ordinate: ");
       Point p = new Point(fristCo, input.nextInt());
       System.out.println();
       
       System.out.println("Entered point: "+p);
       System.out.println("Distance form origin is: "+p.distanceFromOrigin());
	}
}