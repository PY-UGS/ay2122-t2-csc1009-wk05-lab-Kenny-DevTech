package Q2;

public class Triangle extends Shape{

	public Triangle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	@Override
	public double area() {
		System.out.println("Inside Area for Triangle.");
		double area =  0.5 *super.getDim1() * super.getDim2();
		return area;
	}
}
