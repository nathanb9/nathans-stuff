
public class Rectangle extends Shape {

	protected double length; 
	protected double width; 
	
	public Rectangle(double l,double w,String c) {
		super(c);
		this.length = l; 
		this.width = w; 
		setArea();
		setPerimeter();
	}

	public void setArea() {
		area = width * length; 
	}
	public void setPerimeter() {
		
	perimeter = 2*(width + length);
	}
}
