//FVCproductions
//April 17, 2014
//FinalExam class

public class FinalExam {
   
      private String student;
      private String course;
      private int fgrade;
      
      public FinalExam(String stName, String crseName, int finalGrade) {
      
         student = stName;
         course = crseName;
         fgrade = finalGrade;
         
      }
     
      public FinalExam() {
      
      }
      
      public String getStname() {
         
         return student;
      }
      
      public String getCrseName() {
      
         return course;
      }
   
      public int getFGrade() {
         
         return fgrade;
      }
      
      public char getLetterGrade() {
      
         char grade;
         
         if (fgrade <= 59)
            grade = 'F';
         else if (fgrade <= 69)
            grade = 'D';
         else if (fgrade <= 79)
            grade = 'C';
         else if (fgrade <= 89)
            grade = 'B';
         else
            grade = 'A';
            
         return grade;
      
      }
            
      public void setStname(String stName) {
         
         student = stName;
         
      }
      
      public void setCrseName(String crseName) {
      
         course = crseName;
      
      }
      
      public void setFGrade(int finalGrade) {
      
         fgrade = finalGrade;
         
      }
      
      public String toString() {
         
         String str = "Student Name: " + student 
                      + "\nCourse Name: " + course;
         
         return str;
         
      }  
      
}