public class Circle extends Point {

	public Circle(double radius) {

		super(radius);
		System.out.println("Creating a circle... done!");
	}

	public double space() {

		return getRadius()*getRadius()*Math.PI;
	}
}