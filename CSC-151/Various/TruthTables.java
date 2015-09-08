//FVCproductions
//March 20, 2014
//Truth Tables

//importing System.out mtethod
import static java.lang.System.out;

public class TruthTables {

	public static void main (String [] args) {
	
		//declaring boolean variables to correct boolean values
	
		Boolean True = true;
		Boolean False = false;
		
		//printing out statements that represent the truth tables appropriately
		
		//AND truth table
		
		out.println("Truth Tables for &&");
		out.println("-------------------");
		
		out.println(True + " && " + False + " = " + (True && False));
		out.println(False + " && " + True + " = " + (True && True));
		out.println(False + " && " + False + " = " + (False && False));
		out.println(True + " && " + True + " = " + (True && True));
				
		out.println();
		
		//OR truth table
		
		out.println("Truth Tables for ||");
		out.println("-------------------");
		
		out.println(True + " || " + False + " = " + (True || False));
		out.println(False + " || " + True + " = " + (False || True));
		out.println(False + " || " + False + " = " + (False || False));
		out.println(True + " || " + True + " = " + (True || True));
		
		out.println();
		
		//NOT truth table
		
		out.println("Truth Tables for !");
		out.println("------------------");
		out.println("!true = " + (!True));
		out.println("!false = " + (!False));
		
		}
}
