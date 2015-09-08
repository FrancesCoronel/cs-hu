/***************************************************

fvcproductions

july 2012
 
Faculty class extended from Person class

****************************************************/

public class Faculty extends Person {

	//define attributes that are protected
	//aka additional attributes
	
	protected String department;
	protected String position;
	
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
	
	//methods - accessor and mutator

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
		
		String str = super.toString() + " \t" + position + " \t" + department;
		return str;
	
	}

}
	