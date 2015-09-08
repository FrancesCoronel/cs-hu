//FVCproductions
//Lab 8
//April 3, 2014
//ReadFile

import java.util.Scanner; //importing Scanner method
import java.io.*; //importing java io method
import static java.lang.System.out; //importing System.out method

public class ReadFile {
	
	public static void main (String[] args) throws IOException { //adding throw clause
	
		Scanner keyboard = new Scanner(System.in); //creating Scanner object
		
		//getting file name from user

		out.println("Enter the filename: ");
		String filename = keyboard.nextLine();
		
		//creating file object

		File file = new File(filename);
		
		//if clause for if file doesn't exist

		if (!file.exists()) {
			out.println("File " + filename + " does not exist");
			System.exit(0);
		}
		
		//opening file

		Scanner inputFile = new Scanner(file);
		
		out.println();
		
		//reading all data from file

		while (inputFile.hasNext()){
			String line = inputFile.nextLine();
			out.println(line);
		}
		
		//closing file
		
		inputFile.close();
	
	}
}
			