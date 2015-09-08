//FVCproductions
//April 17, 2014
//FinalExamDemo
//Part II - Driver File

import java.io.*; //importing PrintWriter and IOException
import java.util.Scanner; //importing Scanner method

public class FinalExamDemo {

   public static void main (String[] args) throws IOException { //throws IOException method needed for file input and output
      
      //1
     
      System.out.println("Obj1");
      
      System.out.println();
      
      FinalExam Obj1 = new FinalExam("Violet", "Java", 90); //creating object 1 with hard code parameters
      
      System.out.println(Obj1); //printing object's values using toString() method
      
      System.out.println("Final Grade: " + Obj1.getFGrade());  //calling method getFGrade for object 1
      System.out.println("The letter grade for object Obj1 is: " + Obj1.getLetterGrade()); //calling method getLetterGrade for object 2
      
      //2
      
      System.out.println();
      System.out.println("Obj2"); 
      
      FinalExam Obj2 = new FinalExam(); //creating object 2 without parameters
      
      Obj2.setStname("RotRos"); //setting hard code values for object 2
      Obj2.setCrseName("Python");
      Obj2.setFGrade(50);
      
      //3
      
      System.out.println();
      System.out.println("Both Obj1 and Obj2");
      
      /*
      displaying state of object 1
      */
      System.out.println();
      System.out.println("Student 1 Name: " + Obj1.getStname());
      System.out.println("Course Name: " + Obj1.getCrseName());
      System.out.println("Final Grade: " + Obj1.getFGrade());
      System.out.println("Letter Grade: " + Obj1.getLetterGrade());
      
      
      /*
      displaying state of object 2
      */
      System.out.println();
      System.out.println("Student 2 Name: " + Obj2.getStname());
      System.out.println("Course Name: " + Obj2.getCrseName());
      System.out.println("Final Grade: " + Obj2.getFGrade());
      System.out.println("Letter Grade: " + Obj2.getLetterGrade());
      
      /*
      conditional operator/statement that compares both objects for larger grade
      */
      
      System.out.println();
      
      System.out.println((Obj1.getFGrade() < Obj2.getFGrade() ? "Obj2 has larger grade" : "Obj1 has larger grade"));
      
      /*
      conditional operator/statement that compares both objects for equality
      */
      
      System.out.println();
      
      System.out.println((Obj1.getFGrade() == Obj2.getFGrade() ? "The two object grades are equal" : "The two object grades are NOT equal"));
           
      //4
      
      System.out.println();
      
      System.out.println("Switch Statement");
      
      System.out.println();
      
      int choice = 1; //hard code the choice
      
      switch(choice) { //switch statement for university level
      
         case 1:
         case 2:
            System.out.println("You must be a Freshman or a Sophomore");
            break;
         case 3:
         case 4:
            System.out.println("You must be a Junior or Senior");
            break;
         case 5:
         case 6:
            System.out.println("You must be either in Grad School or you have a job");
            break;
      
      }
      
      
      //5
      
      System.out.println();
      
      for (int i = 0 ; i <= 100; i += 7) {
      
         System.out.println(i);
         
      }
      
      //6
      
      System.out.println();
      
      int number = 0;
      
      do
      {
         if (number%2 != 0)
            System.out.println(number);
         
         number++;
      
      } while(number <= 50);
      
      //Using files
      
      System.out.println();
      
      System.out.println("Using files");
                  
      File file = new File("Random.txt");
      Scanner inputFile = new Scanner(file);
      
      String data;
      
      while(inputFile.hasNext()) {
         
         data = inputFile.nextLine();
         
      }
      
      inputFile.close();
      
      PrintWriter outputFile = new PrintWriter("OutFile.txt");
    
      outputFile.println(inputFile);
      outputFile.println("Average: " + (92+40)/(2));
      outputFile.println("Highest grade: 92");
      
      outputFile.close();
      
   }
}