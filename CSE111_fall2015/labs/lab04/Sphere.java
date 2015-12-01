public class Sphere extends Point {

	public Sphere(double radius) {

		super(radius);
		System.out.println("Creating a sphere... done!");
	}

	public double space() {

		return getRadius()*getRadius()*getRadius()*Math.PI*3.0/4.0;
	}
}