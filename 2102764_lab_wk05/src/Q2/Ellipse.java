package Q2;

public class Ellipse extends Shape{

	public Ellipse(double dim1, double dim2) {
		super(dim1, dim2);
	}

	@Override
	public double area() {
		System.out.println("Inside Area for Ellipse.");
		double area =  super.getPI() * super.getDim1() * super.getDim2();
		return area;
	}
}
