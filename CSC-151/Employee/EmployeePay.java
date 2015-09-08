//FVCproductions
//March 27, 2014
//Employee Pay

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program calculates a salesperson's gross
 * pay at Hal's Computer Emporium.
 */

public class EmployeePay {

   public static void main(String[] args) {
      
      double sales,      // To hold amount of sales
             base;  		// To hold advance base
		
		  String name;
      
      // Create DecimalFormat objects for dollar amounts and percentages.

      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      DecimalFormat percent = new DecimalFormat("#0%");

      // Create a Scanner object to read input.

      Scanner keyboard = new Scanner(System.in);

      System.out.println("This program will display a pay report for a salesperson.");
      System.out.println("Enter the following information:");

      // Ask the user for name & sales & base pay

		  System.out.print("Employee's Name: ");
		  name = keyboard.nextLine();
		
		  System.out.print("Employee's Base Pay: $");
      base = keyboard.nextDouble();
		
      System.out.print("Employee's Sales: $");
      sales = keyboard.nextDouble();
		
      // Create an instance of the SalesCommission
      // class and pass the data to the constructor.

      SalesCommission payInfo = new SalesCommission(name, base, sales);	  

      // Display the pay report for the salesperson.

      System.out.println("\nPay Report");
      System.out.println("-------------------------");
		  System.out.println("Name: " + payInfo.getName());
		  System.out.println("Base Pay: $" + dollar.format(payInfo.getBase()));
      System.out.println("Sales: $" + dollar.format(payInfo.getSales()));
     
   }
}