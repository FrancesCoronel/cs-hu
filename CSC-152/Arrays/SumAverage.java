/***************************************************

fvcproductions

Purpose: this program reads *7* integers and 
         calculates sum and average

****************************************************/


import java.util.Scanner; // import scanner utility

public class SumAverage {

   public static void main (String []args) {
   
      // define variables

      int sum, num1, num2, num3, num4, num5, num6, num7;
      double average;
      
      Scanner keyboard = new Scanner(System.in);
      
      // read 7 integers from keyboard
      
      System.out.print ("Please enter 7 integers: ");
      
      num1 = keyboard.nextInt();	
      num2 = keyboard.nextInt();	
      num3 = keyboard.nextInt();	
      num4 = keyboard.nextInt();	
      num5 = keyboard.nextInt();	
	   num6 = keyboard.nextInt();
	   num7 = keyboard.nextInt();
      
      
      // calculation

      sum = num1 + num2 + num3 + num4 + num5 + num6 + num7;
      
      average = (double) sum / 7 ;
      
      // results
      
      System.out.println ("You enter " + num1 + " " + num2 + " " + 
                     num3 + " " + num4 + " " + num5 + " " + num6 + " " + num7);
      System.out.println ("The sum of the 7 integers is : " + sum + "\n" +
                          "The average of the 7 integers is : " + average );
                               
      
      
   }
}