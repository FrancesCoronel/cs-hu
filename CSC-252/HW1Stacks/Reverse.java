/*
 * Read a .dat file and reverse it.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Reverse 
{
    public static void main(String[]args) 
    {
        if (args.length != 3) 
        {
            System.err.println(" Incorrect number of arguments");
            System.err.println(" Usage: ");
            System.err.
            println("\tjava Reverse <stack type> <input file> <output file>");

            System.exit(1);
        }

        boolean useList = true;
        if (args[0].compareTo("list")==0)
            useList = true;
        else if (args[0].compareTo("array")==0)
            useList = false;
        else 
        {
            System.err.println("\tSaw "+args[0]+" instead of list or array as first argument");
            System.exit(1);
        }

        try {
            //
            // Set up the input file to read, and the output file to write to
            //
            BufferedReader fileIn = new BufferedReader(new FileReader(args[1]));
            PrintWriter fileOut = new PrintWriter(new
				BufferedWriter(new FileWriter(args[2])));

            //
            // Read the first line of the .dat file to get sample rate.
	        // We want to store the sample rate value in a variable, 
	        // but we can ignore the "; Sample Rate" part of the line. 
	        // Step through the first line one token (word) at a time 
	        // using the StringTokenizer.  The fourth token is the one
	        // we want (the sample rate).
            //
            StringTokenizer str;
            String oneLine;
            int sampleRate;
            String strJunk;

            oneLine = fileIn.readLine();

            str = new StringTokenizer(oneLine);
            strJunk = str.nextToken();  // Read in semicolon
            strJunk = str.nextToken();  // Read in "Sample"
            strJunk = str.nextToken();  // Read in "Rate"

	         // Read in sample rate
            sampleRate = Integer.parseInt(str.nextToken());   

            //
            // Read in the remainder of the file on line at a time.
            // The values in the first column are thrown away. 
	        // Place values from the second column on the stack.
            // Stop reading if we reach the end of the file.
            //

            DStack s;
            if (useList)
                s = new ListStack();
            else
                s = new ArrayStack();
            String timestep;
            double data;

            int count = 0;
            while ((oneLine = fileIn.readLine()) != null) 
            {
                if (oneLine.charAt(0) == ';')
                    continue;
                
                str = new StringTokenizer(oneLine);

		          // Read in time step value from first column
                timestep = str.nextToken(); 
		          // Read in data value from second column
                data = Double.parseDouble(str.nextToken());     
                s.push(data);
                count++;
            }

            System.out.println(count+" samples in file");


            //
            // Print the data values to output .dat file.
            // First, output the header line:
            // "; Sample Rate <sample rate>"
            //
            fileOut.println("; Sample Rate " + sampleRate);

            // Since the first column consists of numbers which start
            // at 0 and increase by 1/sampleRate every time slice, we'll
            // just use numSteps to recalculate these numbers.
            int numSteps = 0;

            // Finally, we print the values in reverse order (by popping
            // them off the stack). The first column consists of numbers
            // which start at 0 and increase by 1/sampleRate per row, so
            // we'll use numSteps/sampleRate to recalculate the appropriate
            // values. Print a tab for uniform spacing.

            while (!s.isEmpty()) 
            {
                fileOut.println((double) numSteps / sampleRate + "\t" +
                        s.pop());
                numSteps++;
            }

            //
            // Close the files
            //
            fileIn.close();
            fileOut.close();

        } catch(IOException ioe) 
        {
            System.err.
            println
            ("Error opening/reading/writing input or output file.");
            System.exit(1);
        } catch(NumberFormatException nfe) 
        {
            System.err.println(nfe.toString());
            System.err.println("Error in file format");
            System.exit(1);
        }
    }
}
