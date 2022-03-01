package Q1;

import Q1.GeometricObject;

public class Rectangle extends GeometricObject {

		private double width;
		private double height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(String color, boolean filled, double width, double height) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea(){
		double area = this.height * this.width;
		return area;
	}

	public double getPerimeter(){
		double perimeter = (2 * this.width) + (2 * this.height);
		return perimeter;
	}
}
