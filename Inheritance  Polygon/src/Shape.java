
public class Shape {
	protected double perimeter; 
	protected double area;
	private String color; 

	public Shape(String c) {
		color =  c;

	}
	public String toString() {
		return "The Color is " + color + " the area is ("+ getArea()+") and the perimeter is (" +getPerimeter() +") \n";
	}
	private double getArea() {
		
		return area;
	}
	private double getPerimeter() {
		
		return perimeter;
	}


}
