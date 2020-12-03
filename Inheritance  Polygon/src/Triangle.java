import java.lang.Math;
public class Triangle extends Shape {
	protected double base; 
	protected double height;
	
	
	public Triangle(double b, double h, String c) {
		super(c);
		base = b; 
		height = h;
		setArea();
		setPerimeter();
	}
	
	void setArea(){
	area = base * height;	
	}
	
	void setPerimeter(){
		
	double a = base; 
	double b = height; 
	double c = Math.sqrt(a*a + b*b);
	perimeter =  a + b + c; 	
	}
	
}
