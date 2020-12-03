
public class Square extends Rectangle {
	
	
	public Square(double s,String c) {
		super(s, s, c);
		
		
		setArea();
		setPerimeter();
	}

	public void setArea() {
		
		area = 0; 
	}
	public void setPerimeter() {
		
		perimeter = area * 4; 
	}
}
