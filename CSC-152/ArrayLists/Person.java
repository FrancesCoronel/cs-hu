/*

fvcproductions
   
   -purpose of this program is to test concepts on inheritance 
   as well as manipulation objects in an array
   
   -with program, there's an application that manages a list of 
   the Person class using an array classes using subclasses 
   Student and Faculty to assign values to each student's info

*/

public class Person {
	
	//defining private variables 
	
   private String firstName;
   private String lastName;
   private int age;
   private double money;
	
	//creating Person cosntructor with only 3 variables: full name and age

   public Person(String fName, String lName, int aAge) {
   	
      firstName = fName;
      lastName = lName;
      age = aAge;
   
   }
	
	//accessor methods for name
	
   public String getFirstName() {
      return firstName;
   }
	
   public String getLastName() {
      return lastName; 
   }
	
	//accessor methods for age and money

   public int getAge() {
      return age;
   }
	
	//mutator methods for names
	
   public void setFirstName(String newName) {
      firstName = newName;
   }
			
   public void setLastName(String newName) {
      lastName = newName;
   }
	
	//mutator methods for age and money

   public void setAge(int newAge) {
      age = newAge;
   }
	
	//accessor method for toString which returns all attributes (full name, age)
	
   public String toString() {
   	
      String str = lastName + "\t\t" + age + "\t\t";
      return str;
   
   }
	 
}
