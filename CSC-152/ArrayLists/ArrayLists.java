//fvcproductions
//driver

//importing necessary classes

import java.text.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public class ArrayLists {
	
	//main method with IOException for file writing

   public static void main(String[] args) throws IOException { 
   
   	//creating fileScanner for text file with names

		Scanner fileScan = new Scanner(new File("CompScienceNames.txt")); 

      System.out.println("** pledge statement **\n");
   	
   	//creating 3 different array list types

      ArrayList<Faculty> FacultyList = new ArrayList<Faculty>();
      ArrayList<Student> cscStudentList = new ArrayList<Student>();
      ArrayList<Student> cisStudentList = new ArrayList<Student>();
   	
   	//creating invalid array lists

      ArrayList<Person> InvalidFacultyList = new ArrayList<Person>();
      ArrayList<Person> InvalidStudentList = new ArrayList<Person>();
   	
   	//while loop checking if text file has a next line

      while (fileScan.hasNext()) {
      	
      	//getting lines from file into Strin personInfo

         String personInfo = fileScan.nextLine(); 
      		
      	//creating personInfoScanner for the personInfo string

         Scanner personInfoScan = new Scanner(personInfo); 
      	
      	//space delimiter

         personInfoScan.useDelimiter(" "); 
      	      	
      	//grabbing data from personInfoScan for each person
      	//type FirstName LastName age Department/Major Position/Classification GPA
      	
         String type = personInfoScan.next(); //type
      	      	
         String fName = personInfoScan.next(); //first name
         String lName = personInfoScan.next(); //last name
      	      	
         int age = personInfoScan.nextInt(); //age
      	      	
         String departORmaj = personInfoScan.next();
      	      	
         String posORclass = personInfoScan.next();
      	      	
         double stuGPA = 0;
      	
         if (personInfoScan.hasNextDouble())
            stuGPA = personInfoScan.nextDouble();
      	
         //faculty array lists - appropriate names being added

      	if (type.equals("F")) {
            
            //if position is right one

            if (posORclass.equals("Lecturer") || posORclass.equals("AssistProf") || posORclass.equals("AssoProf") || posORclass.equals("Prof")) {
               
               //and if dept is right one

               if (departORmaj.equals("CSC") || departORmaj.equals("CIS")) {
                  
                  Faculty aFaculty = new Faculty(fName, lName, age, posORclass, departORmaj);
                  FacultyList.add(aFaculty);
                  
               }

               else {
                  
                  //if department is NOT right one

                  Person invalidPerson = new Person(fName, lName, age);
                  System.out.println("Cannot create Faculty object for '" + invalidPerson.getLastName() + "' because of invalid department.");
                  InvalidFacultyList.add(invalidPerson);
               
               }
            }
            
            else { 
               
                  //if position is NOT right one

                  Person invalidPerson = new Person(fName, lName, age);
                  System.out.println("Cannot create Faculty object for '" + invalidPerson.getLastName() + "' because of invalid position.");
                  InvalidFacultyList.add(invalidPerson);
            }
         
         }
         
         //student array lists - appropriate names being added

         if (type.equals("S")) {
            
            //if class is right 

            if (posORclass.equals("Freshman") || posORclass.equals("Sophomore") || posORclass.equals("Junior") || posORclass.equals("Senior")) {
            
               //and if major is right

               if (departORmaj.equals("CSC") || departORmaj.equals("CIS")) {
                  
                  //if major is CS

                  if (departORmaj.equals("CIS")) {
                  
                     Student aStudent = new Student(fName, lName, age, departORmaj, posORclass, stuGPA);
                     cisStudentList.add(aStudent);
                  
                  }
                  
                  //if major is CSC

                  else if (departORmaj.equals("CSC"))  {
                     
                     Student aStudent = new Student(fName, lName, age, departORmaj, posORclass, stuGPA);
                     cscStudentList.add(aStudent);
                     
                  }
               
               }
               
               //if major is NOT right

               else {
               
                  Person invalidPerson = new Person(fName, lName, age);
                  System.out.println("Cannot create Student object for '" + invalidPerson.getLastName() + "' because of invalid major.");            
                  InvalidStudentList.add(invalidPerson);
                  
               }
            }
            
            //if class is NOT right 

            else {
               
               Person invalidPerson = new Person(fName, lName, age);
               System.out.println("Cannot create Student object for '" + invalidPerson.getLastName() + "' because of invalid classification.");
               InvalidFacultyList.add(invalidPerson);
               
            }
         }  	
      }
   	
      //printing out Faculty List header

      System.out.println();
      System.out.println("**** Faculty List ***");
      System.out.println("---------------------------------------------------------------------------");
      System.out.println("Name\t\tAge\t\tDept.\t\tPosition");
      System.out.println("---------------------------------------------------------------------------");
      
      //sorting array list for faculty by last name

      Collections.sort(FacultyList, 
            new Comparator<Faculty>() {
               public int compare(Faculty member, Faculty another) {
                  return member.getLastName().compareToIgnoreCase(another.getLastName());
               }
            });
      
      //printing out all elements of FacultyList

      for (int i = 0; i < FacultyList.size(); i++)
         System.out.println(FacultyList.get(i));
   	
      //printing out CSC Student List header

      System.out.println();
      System.out.println("**** CSC Student List ***");
      System.out.println("---------------------------------------------------------------------------");
      System.out.println("Name\t\tAge\t\tMajor\t\tClassification\t\tGPA");
      System.out.println("---------------------------------------------------------------------------");
      
      //sorting array list for faculty by last name

      Collections.sort(cscStudentList, 
            new Comparator<Student>() {
               public int compare(Student member, Student another) {
                  return member.getLastName().compareToIgnoreCase(another.getLastName());
               }
            });
      
      //printing out all elements of cscStudentList

      for (int i = 0; i < cscStudentList.size(); i++)
         System.out.println(cscStudentList.get(i));
   	
      //printing out CIS Student List header

      System.out.println();
      System.out.println("**** CIS Student List ***");
      System.out.println("---------------------------------------------------------------------------");
      System.out.println("Name\t\tAge\t\tMajor\t\tClassification\t\tGPA");
      System.out.println("---------------------------------------------------------------------------");
      
      //sorting array list for CIS student list

      Collections.sort(cisStudentList, 
            new Comparator<Student>() {
               public int compare(Student member, Student another) {
                  return member.getLastName().compareToIgnoreCase(another.getLastName());
               }
            });

      //printing out all elements of cisStudentList

      for (int i = 0; i < cisStudentList.size(); i++)
         System.out.println(cisStudentList.get(i));
   	
      System.out.println();
   
   }
}

/*

** pledge statement **

Cannot create Faculty object for 'Johnson' because of invalid position.
Cannot create Faculty object for 'Simith' because of invalid position.
Cannot create Student object for 'Kenneth' because of invalid classification.
Cannot create Faculty object for 'Pearson' because of invalid position.

**** Faculty List ***
---------------------------------------------------------------------------
Name     age      Dept.    Position
---------------------------------------------------------------------------
Astro    47    CSC      Prof
Whitehurst     35    CSC      AssistProf

**** CSC Student List ***
---------------------------------------------------------------------------
Name     age      Major    Classification    GPA
---------------------------------------------------------------------------
Johnson     18    CSC      Freshman       2.6
Jackson     22    CSC      Senior      2.9
Tone     21    CSC      Junior      3.3

**** CIS Student List ***
---------------------------------------------------------------------------
Name     age      Major    Classification    GPA
---------------------------------------------------------------------------
Russ     19    CIS      Sophomore      3.4
Guess    22    CIS      Senior      3.2

*/