/***************************************************

fvcproductions

july 2012
 
Square class extends from Rectangle class

****************************************************/

public class Square extends Rectangle {
	
	//constructors

	public Square() {
	}
	
	public Square(int l) {
		super(l,l);
	}
	
	//methods - accessor and mutator

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
		width = newL;
	}

	public int getArea() {
		return length*width;
	}
	
	/*
	public String toString() {
		String str = "Square with " + length + " for length has an area of " + getArea();
		return str;
	}
	*/
	
}