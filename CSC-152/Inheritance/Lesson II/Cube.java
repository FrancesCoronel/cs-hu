/***************************************************

fvcproductions

july 2012
 
Cube class extending from Square class

****************************************************/

public class Cube extends Square {

	private int height;
	
	//constructors
	public Cube() {
	
	}
	
	public Cube(int l) {
	
		super(l);
		height = l;
	
	}
	
	public void setLength(int newL) { 
	
		length = newL;
	
	}
	
	public void setWidth(int newW) {
	
		width = newW;
	
	}
	
	public int getLength() {
	
		return length;
	
	}

	public int getWidth() {
	
		return width;
	
	}
	
	public void set(int newL) {
	
		length = newL;
	
	}

	public int getArea() { //get surface area
	
		return 6*length*length; //area of a cube is 6*side^2
	
	}
	
	public int getVolume() {
		
		//return length*length*length; //volume of a cube is length of 1 side cubed or length^3
		
		return super.getArea() * height;
	
	}
	
}