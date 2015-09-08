//----------------------------------------------------------------------
// DaysBetween.java          by Dale/Joyce/Weems               Chapter 1
//
// Asks the user to enter two "modern" dates and then reports 
// the number of days between the two dates.
//----------------------------------------------------------------------

import java.util.Scanner;

public class DaysBetween
{
  public static void main(String[] args)
  {
    Scanner conIn = new Scanner(System.in);
    int day, month, year;
		
    System.out.println("Enter two 'modern' dates: month day year");
    System.out.println("For example, January 12, 1954, would be: 1 12 1954");
    System.out.println();
    System.out.println("Modern dates occur after " + Date.MINYEAR + ".");
    System.out.println();
		
    System.out.println("Enter the first date:");
    month = conIn.nextInt();
	  day = conIn.nextInt();
    year = conIn.nextInt();
    Date date1 = new Date(month, day, year);
		
    System.out.println("Enter the second date:");
    month = conIn.nextInt();
    day = conIn.nextInt();
    year = conIn.nextInt();
    Date date2 = new Date(month, day, year);
		
    if ((date1.getYear() <= Date.MINYEAR) 
	    || 
		 (date2.getYear() <= Date.MINYEAR))
      System.out.println("You entered a 'pre-modern' date.");
    else
    {
      System.out.println("The number of days between");
      System.out.print(date1);
      System.out.print(" and ");
      System.out.print(date2);
      System.out.print(" is ");
      System.out.println(Math.abs(date1.lilian() - date2.lilian()));
    }
  }
}