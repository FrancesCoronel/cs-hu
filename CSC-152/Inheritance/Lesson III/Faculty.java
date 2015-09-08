/***************************************************

fvcproductions

july 2012
 
manages a list of the Person class using array 
classes with the subclasses Student and Faculty 
to assign values to each student's info

****************************************************/

public class Faculty extends Person {

	//define attributes that are protected
	//aka additional attributes
	
	protected String department;
	protected String position;
	String str1;
	
	//1st constructor
	public Faculty(String aFirstName, String aLastName, int aAge, double aMoney) {
	
		super(aFirstName, aLastName, aAge, aMoney);
		position = "unknown";
		department = "unknown";
	
	}
	
	//2nd constructor
	public Faculty (String aFirstName, String aLastName, int aAge, double aMoney, String pos, String dept) {

		super(aFirstName, aLastName, aAge, aMoney); // call constructor of parent 
		position = pos; // local instance
		department = dept; // local instance
	
	}
	
	//methods
	public String getDepartment() {

		return department;
	
	}

	public String getPosition() {

		return position;
	
	}
	
	public void setDepartment(String aDept) {

		department = aDept;
	
	}
	
	public void setPosition(String aPos) {

		position = aPos;
	
	}
	
	//specific toString method for Faculty class
	
	public String toString() {

		if (department.equals("unknown")) {
			str1 = "F: " + super.toString() + "n/a\t";
			return str1;

		}
		else {
			str1 = "F: " + super.toString() + department + ", " + position + "\t";
			return str1;
		}
		
	}

}
	