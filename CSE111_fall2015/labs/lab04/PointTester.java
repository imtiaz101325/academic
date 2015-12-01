import java.util.Scanner;

public class PointTester {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter radius of Circle: ");
		double rad = input.nextDouble();

		Circle c = new Circle(rad);
		System.out.printf("The area of a circle is %f\n", c.space());

		System.out.println("Enter radius of Sphere: ");
		double r = input.nextDouble();

		Sphere s = new Sphere(r);
		System.out.printf("The volume of a sphere is %f\n", s.space());
		
	}
}