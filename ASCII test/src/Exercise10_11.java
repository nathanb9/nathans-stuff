/*
 * Class: CMSC201 
 * Instructor: Dr. Greg Grinberg
 * Description: (Give a brief description for each Program)
 * Due: 07/12/2020
 * I pledge that I have completed the programming assignment independently.
	   I have not copied the code from a student or any source.
	   I have not given my code to any student.
	   Print your Name here:NATHAN BEZUALEM
 */

public class Exercise10_11 {
	public static void main(String[] args) {

		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("area: " + c1.getArea());
		System.out.println("perimeter: " + c1.getPerimeter());
		System.out.println("contains(3, 3): " + c1.contains(3, 3));
		System.out.println("contains(new Circle2D(4, 5, 10.5)): " +
				c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("overlaps(new Circle2D(3, 5, 2.3)): " +
				c1.overlaps(new Circle2D(3, 5, 2.3)));
	}



	public static class Circle2D {
		private double x, y, radius;

		public Circle2D(){
			x = 0;
			y = 0;
			radius = 1;
		}
		public Circle2D(double x1, double y1, double rad1){
			x = x1;
			y = y1;
			radius = rad1;
		}

		public double getArea(){
			return Math.PI * radius * radius;
		}

		public double getPerimeter(){
			return 2 * Math.PI * radius;
		}

		public boolean contains(double x1, double y1){
			double dx = x - x1;
			double dy = y - y1;
			double distance = Math.sqrt(dx * dx + dy * dy); //distance between center and point
			if(distance < radius)
				return true;
			else
				return false;
		}

		public boolean contains(Circle2D other){
			double dx = x - other.x;
			double dy = y - other.y;
			double distance = Math.sqrt(dx * dx + dy * dy); //distance between the 2 centers

			//if this circle's radius is more than sum of (distance between centers and other's radius)
			if(radius >= other.radius + distance)
				return true;
			else
				return false;

		}

		public boolean overlaps(Circle2D other){
			double dx = x - other.x;
			double dy = y - other.y;
			double distance = Math.sqrt(dx * dx + dy * dy); //distance between the 2 centers

			//if the distance between the centers is less than sum of the radii
			if(distance < radius + other.radius )
				return true;
			else
				return false;

		}


		public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

	}

}




