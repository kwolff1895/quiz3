package base;

public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;

	// Creates default triangle
	public Triangle(){
		side1 = 1;
		side2 = 1;
		side3 = 1;
		}
	
	//Creates triangle with given sides
	Triangle triangle = new Triangle(side1, side2, side3);
	
	public Triangle(double side1, double side2, double side3){
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	//Returns area of triangle
	public double getArea(){
		double semiPerimeter = (side1+side2+side3)/2 ;
		double a = (semiPerimeter*(semiPerimeter-side1)*(semiPerimeter - side2)*(semiPerimeter - side3));
		double Area = Math.sqrt(a);
		return Area;
		
	}
	//Returns Perimeter of the triangle
	public double getPerimeter(){
		double Perimeter = side1 + side2 + side3;
		return Perimeter;
		
	}
	//Returns description of triangle
	public String getString(){
		 return "Triangle: Side 1 = " + side1 + "Side 2 = " + side2 + "Side 3 = "+ side3;
	}

}
