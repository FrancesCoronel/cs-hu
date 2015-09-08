/*

FVCproductions

-purpose of this program is to test my concepts on inheritance 
as well as manipulation objects in an array
-in program there's an application that manages a list of the 
Person class using an array classes using the subclasses Student 
and Faculty to assign values to each student's info.

*/

public class Faculty extends Person {

	//define attributes that are protected
	//aka additional attributes
	
   protected String department;
   protected String position;
   String str1;
	
	//1st constructor

   public Faculty(String aFirstName, String aLastName, int aAge) {
   
      super(aFirstName, aLastName, aAge);
   
   }
	
	//2nd constructor

   public Faculty (String aFirstName, String aLastName, int aAge, String pos, String dept) {
   	
      super(aFirstName, aLastName, aAge); // call constructor of parent 
   	
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
   
      str1 = super.toString() + department + "\t\t" + position;
      return str1;
   
   }

}
