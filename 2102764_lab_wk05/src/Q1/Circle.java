package Q1;

public class Circle extends GeometricObject {

	private double radius = 0;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea(){
		double area = Math.PI * Math.pow(this.radius, 2) ;
		return area;
	}

	public double getPerimeter(){
		double perimeter = 2 * Math.PI * this.radius;
		return perimeter;
	}

	public double getDiameter(){
		double diameter = 2 * this.radius;
		return diameter;
	}

	public void printCircle(){

	}

}
