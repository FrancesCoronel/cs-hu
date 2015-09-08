//FVCproductions
//April 3, 2014
//Writing Files

import java.util.Scanner; //importing Scanner method
import java.io.*; //importing Java API method
import static java.lang.System.out; //importing System.out method

public class WriteFile {

	public static void main (String[] args) throws IOException { //adding throw clause
		
		Scanner keyboard = new Scanner(System.in); //creating Scanner object
		
		//getting file name from user
		out.println("Enter the filename: ");
		String filename = keyboard.nextLine();
		
		//creating file object
		File file = new File(filename);
		
		//checking if file exists
		if (file.exists()) {
		
			out.println("File " + filename + " already exists. Do you want to overwrite (Y or N)?");
			String YorN = keyboard.nextLine();
			
			while (YorN.equals("N") || YorN.equals("n")){
				System.exit(0);
			}
		}
		
		//opening the file using PrintWriter class
		PrintWriter outputFile = new PrintWriter(filename);
		
		//getting data and writing it to the file

		for (int i = 1; i <= 20; i++)
		{
			outputFile.println("This is line " + i + " in the file.");
		}
		
		//closing the file
		outputFile.close();
		
		out.println();
		
		//declaring the file as being created
		out.println(filename + " has been created.");
	
	}
}