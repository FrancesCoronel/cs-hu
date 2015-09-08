/***************************************************

fvcproductions

july 2012
 
Rectangle class testing Exceptions

****************************************************/

public class Rectangle {

	//defining attributes

	protected int length;
	protected int width;
	
	//1st constructor with no parameters

	public Rectangle() {
	
	}
	
	//2nd constructor with length and width parameters

	public Rectangle(int l, int w) throws InvalidRectangleException {
		
		InvalidRectangleException problem1 = new InvalidRectangleException("width and length cannot be less than zero.");
		
		//checking if length or width is less than zero
		//throwing problem1 message if so.
		
		if (l <= 0 || w <= 0)
			throw problem1;
		
		length = l;
		width = w;
		
	}
	
	//methods - accessor and mutator

	public int getLength() {
		return length;
	}
	
	public void setLength(int newL) throws InvalidRectangleException { 
		length = newL;
		
		InvalidRectangleException problem2 = new InvalidRectangleException("width/length cannot be less than zero");
		
		if (length <= 0) 
			throw problem2;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int newW) throws InvalidRectangleException { 
		
		width = newW;
		
		InvalidRectangleException problem3 = new InvalidRectangleException("width/length cannot be less than zero");
		
		if (width <= 0) 
			throw problem3;
	}

	public int getArea() {
		return length*width;
	}
	
	public String toString() {
		String str = "The rectangle has a length of " + getLength() + " and a width of " + getWidth() + " and finally an area of " + getArea() + ".";
		return str;
	}
	
}
