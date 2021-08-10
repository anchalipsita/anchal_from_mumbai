package mypack;

public class CalculateArea {
	
	public static void main(String[] args) {
		RectangleArea r = new RectangleArea(5,8);
		r.area();
		
		SquareArea s = new SquareArea(10);
		s.area();
		
		TrapeziumArea t = new TrapeziumArea(4,8,6);
		t.area();

	}

}

abstract class AreaQuadilateral{
	protected double length;
	protected double breadth;
	protected double side;
	protected double a, b, height;
	protected double totarea;
	
	abstract public void area();
}

class RectangleArea extends AreaQuadilateral{
	public RectangleArea(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area() {
		totarea = length * breadth;
		System.out.println("Area of rectangle is: "+totarea);
	}
}

class SquareArea extends AreaQuadilateral{
	public SquareArea(double side) {
		this.side = side;
	}
	
	public void area() {
		totarea = side*side;
		System.out.println("Area of square is: "+totarea);
	}
}

class TrapeziumArea extends AreaQuadilateral{
	public TrapeziumArea(double a, double b, double height) {
		this.a = a;
		this.b = b;
		this.height = height;
	}
	
	public void area() {
		totarea = ((a+b)/2)*height;
		System.out.println("Area of trapezium is: "+totarea);
	}
}