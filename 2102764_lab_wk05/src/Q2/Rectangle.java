package Q2;

public class Rectangle extends Shape{

	public Rectangle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	@Override
	public double area() {
		System.out.println("Inside Area for Rectangle.");
		double area =  super.getDim1() * super.getDim2();
		return area;
	}
}
