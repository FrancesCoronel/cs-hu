/***************************************************

fvcproductions

july 2012
 
driver for Cube, Square, and Rectangle class

****************************************************/

public class Driver {

	public static void main(String[] args) {
		
		//creating a Rectangle object R1

		Rectangle R1 = new Rectangle(5,6);
		System.out.println("Rectangle 1 Length: " + R1.getLength());
		System.out.println("Rectangle 1 Width: " + R1.getWidth()); 
		System.out.println("Rectangle 1 Area: " + R1.getArea());
		
		System.out.println();
		
		//creating a Square object S1

		Square S1 = new Square(5);
		System.out.println("Square 1 Length: " + S1.getLength());
		System.out.println("Square 1 Width: " + S1.getWidth()); 
		System.out.println("Square 1 Area: " + S1.getArea());
		
		System.out.println();
		
		//creating a Cube object C1
		
		Cube C1 = new Cube(5);
		System.out.println("Cube 1 Length: " + C1.getLength());
		System.out.println("Cube 1 Area: " + C1.getArea());
		System.out.println("Cube 1 Volume: " + C1.getVolume());
		
	}
}