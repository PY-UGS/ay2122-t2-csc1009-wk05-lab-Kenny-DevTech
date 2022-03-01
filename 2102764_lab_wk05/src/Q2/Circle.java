package Q2;

public class Circle extends Shape{

	public Circle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	@Override
	public double area() {
		System.out.println("Inside Area for Circle.");
		double area =  super.getPI() * Math.pow(super.getDim1(),2);
		return area;
	}
}
