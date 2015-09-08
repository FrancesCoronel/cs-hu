/***************************************************

fvcproductions

july 2012
 
Rectangle class

****************************************************/

public class Rectangle {
	
	//define attributes

	protected int length;
	protected int width;
	
	//constructors

	public Rectangle() {
	}
	
	public Rectangle(int l, int w) throws InvalidRectangleException {
		
		InvalidRectangleException problem1 = new InvalidRectangleException("width and length cannot be less than zero.")
		
		length = l;
		width = w;
		
		if (length < 0 || width < 0) {
			throw problem1;
		}
		
	}
	
	//methods - accessor and mutator

	public int getLength() {
		return length;
	}
	
	public void setLength(int newL) { 
		length = newL;
		
		InvalidRectangleException problem2 = new InvalidRectangleException("width/length cannto be less than zero")
		
		if (length < 0) 
			throw problem2;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int newW) { 
		width = newW;
		
		InvalidRectangleException problem3 = new InvalidRectangleException("width/length cannto be less than zero")
				
		if (width < 0) 
			throw problem3;
	
	}

	public int getArea() {
		return length*width;
	}
	
	
	BlockView
	try {
		
	} catch (Exception e) {
		
	}
	
}
