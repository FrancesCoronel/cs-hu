/*
fvcproductions
   
   -purpose of program is to test concepts 
   on inheritance as well as manipulation objects in an array
   
   -with program, there's an application that 
   manages a list of the Person class using an 
   array classes using the subclasses Student 
   and Faculty to assign values to each student's info

*/

public class Student extends Person {

	//define attributes that are protected
	//aka additional attributes for specific Student class
	
   protected String major;
   protected String classification;
   protected double gpa;
	
   String str2;
	
	//1st constructor
	
   public Student(String aFirstName, String aLastName, int aAge) {
   	
      super(aFirstName, aLastName, aAge);
   
   }
	
	//2nd constructor
	
   public Student(String aFirstName, String aLastName, int aAge, String aMajor, String aClass, double aGPA) {
   	
      super(aFirstName, aLastName, aAge);
   	
      major = aMajor;
   	
      classification = aClass;
   	
      gpa = aGPA;
   
   }
	
   public String getMajor() {
      return major;
   }

   public String getClassification() {
      return classification;
   }

   public double getGpa() {
      return gpa;
   }

   public void setMajor(String aMajor) {
      major = aMajor;
   }
	
   public void setClassification(String aClass) {
      classification = aClass;
   }
	
   public void setGpa(double aGPA) {
      gpa = aGPA;
   }

   public String toString() {
   	
      if (major.equals("CIS") || major.equals("CSC")) {
      
         if (classification.equals("Freshman") || classification.equals("Sophomore") || 
         	classification.equals("Junior") || classification.equals("Senior")) {
         	
            str2 = super.toString() + major + "\t\t" + classification + " \t\t" + gpa;
            return str2;
         
         }
         
         else {
         
            str2 = "Cannot create Student object for '" + super.getLastName() + "' because of invalid classification.";
            return str2;
         
         }
      }
      
      else {
      
         str2 = "Cannot create Student object for '" + super.getLastName() + "' because of invalid major.";
         return str2;
      
      }
   }

}
