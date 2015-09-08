//FVCproductions
//April 10, 2014

/*
Part 1 - File Input
Part 2 - File Output
Part 3 - Loops
*/

import java.util.Scanner; //importing Scanner method
import java.io.*; //importing Java API method
import static java.lang.System.out; //importing System.out method

public class Input_Output {

	public static void main (String[] args) throws IOException { //adding throw clause
		
      /*
      PART I: File Input
      */
      
      out.println();
      out.println("Part 1");
      out.println();
      
      //creating data file with Notepad called "data.txt"

		PrintWriter outputFile = new PrintWriter("data.txt");
      
      //printing names of favorite athletes to file

      outputFile.println("America Ferrera    Football    Jets");
      outputFile.println("Ronaldino Merias   Soccer      Madrid");
      outputFile.println("Steven Hawks       Rugby       Liverpool");
      outputFile.println("Michael Wilson     Swimming    U.S.");
      outputFile.println("Larry Page         Tennis      Russia");
      outputFile.close();
      
      Scanner keyboard = new Scanner(System.in); //creating Scanner object
		
		//getting file name from user

		out.println("Enter the filename: ");
		String filename = keyboard.nextLine();
		
      //checking if file exists

      File file1 = new File(filename);
      
		if (!file1.exists()) {
		
			out.println("The file " + filename + " does not exist.");
         System.exit(0);
         
		}
		
      //opening file for reading

      Scanner inputFile = new Scanner(file1);
      
      out.println();
      
      //getting all text from file

      while (inputFile.hasNext()) {
         String str = inputFile.nextLine();
         out.println(str);
      }
      
      //closing input file

      inputFile.close();
      
      /*
      PART II: File Output
		*/
      
      out.println();
      out.println("Part 2");
      out.println();
      
      //prompting user for how many favorite athletes they have

		out.println("How many favorite athletes do you have?");
      int limit = keyboard.nextInt();
      out.println();
     
      //clearing buffer
      
      keyboard.nextLine();
      
      //getting file name

      out.println("Enter the filename: ");
		String filename2 = keyboard.nextLine();
      
      //making sure file does not exist

      File file2 = new File(filename2);
      PrintWriter outputFile2 = new PrintWriter(file2);
      
		if (!file2.exists()) {
      
         out.println();
			out.println("The file " + filename2 + " does not exist.");
         System.exit(0);
         
		}
         
      //writing information to output file

      for (int i = 1; i <= limit; i++)
		{
			out.println();
         out.println("Enter athlete " + i + " name: ");
         String ath = keyboard.nextLine();
         out.println("Enter athelete " + i + " sport: ");
         String spo = keyboard.nextLine();
         
         outputFile2.println("Athlete Name: " + ath + "  Sport: " + spo);
		}
      
      //closing the file

		outputFile2.close();
		
      /*
      PART III: Loops
      */
      
      out.println();
      out.println("Part 3");
      out.println();
      
      //loop printing out increments of 15 from 15 to 150

      double sum = 0;
      
      for (int i = 0; i <= 150; i+=15) {
         out.println(i);
         sum += i;
      }
      
      //calculating average

      double average = (sum)/(150/15);
      
      out.println();
      
      //printing out average

      out.println("Average: " + average);
      
      //while loop that will print out "a while loop" until you enter in -111
      
      out.println();
      
      int num = 1;

      while (num != -111) {
         
         out.println("a while loop");
         out.println("Enter -111 to terminate the loop or don't and continue the loop");
         num = keyboard.nextInt();
         
      }
      
      //do while loop that does same thing as above while loop
      
      out.println();
      
      num = 1;
      
      do 
      {
         out.println("a while loop");
         out.println("Enter -111 to terminate the loop or don't and continue the loop");
         num = keyboard.nextInt();
      } while(num != -111);
      
	}
}