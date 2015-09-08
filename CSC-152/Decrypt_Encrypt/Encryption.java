/***************************************************

fvcproductions

july 2012
 
this encryption program does the following:

- reads each line and push in alternate stacks (odd and even)
- for each line, reverses characters in each line
- prints ASCII value of each character with a space

(number of lines in file input and output must be same)

****************************************************/

//importing necessary classes for all methods used

import java.io.*;
import java.util.*;
import java.lang.*;
import java.lang.String;

public class Encryption {
	
	//throwing IOException in main method for file reading

	public static void main(String[] args) throws IOException {
		
		//declaring scanner object called keyboard

		Scanner keyboard = new Scanner(System.in);
		
		//asking for filename
		
		System.out.print("Enter filename: ");
		String fileName = keyboard.nextLine();
		
		//creating BufferedReader object to read encypted text file

		BufferedReader input = new BufferedReader(new FileReader(fileName));
		System.out.println(); 
		
		//declaring String variable line

		String line = "";
		
		//declaring String stacks for odd/even lines

		Stack<String> ODD_LineStack = new Stack<String>();
		Stack<String> EVEN_LineStack = new Stack<String>();
		
		//declaring integer type Stack for NumberStack

		Stack<Character> NumberStack = new Stack<Character>();
		
		//delcaring boolean holder for odd/even lines implementation using numLines

		boolean ifOdd = true;
		
		int count = 0;
		
		//while loop for reading all lines from text file

		while ((line = input.readLine()) != null) {
			
			count++;
	
			if (ifOdd) {
				
				//pushes line to <oddStack>

				ODD_LineStack.push(line);
				ifOdd = false;

			}

			else {
				
				//pushes line to <evenStack>

				EVEN_LineStack.push(line); 
				ifOdd = true;

			}
		
		}
		
		//declaring an int variable that contains 
		//the number of lines the text file holds
		
		//number found on first line of text

		int numLines = count;
		
		if (numLines % 2 == 0)
			ifOdd = false;
		else
			ifOdd = true;
		
		//while loop for going through <odd> stack

		while (!ODD_LineStack.isEmpty()) {
			
			//checking whether odd or even

			if (ifOdd) {
				
				line = ODD_LineStack.pop();
				ifOdd = false;	
			
			}
			
			else {
				
				line = EVEN_LineStack.pop();
				ifOdd = true;
			
			}
			
			//declaring StringTokenizer for line

			StringTokenizer tokenizer = new StringTokenizer(line);
			
			//counts number of tokens to execute for loop

			int numberOfTokens = tokenizer.countTokens();
			
			//for loop used to print each token

			for (int i = 0; i < numberOfTokens; i++) {
				
				//using char array to get each individual character

				char[] myChar = tokenizer.nextToken().toCharArray();
				
				for (char c : myChar) {
					NumberStack.push(c);
				}
				
			}
			
			System.out.println();
			
			while (!NumberStack.isEmpty()) {
				
				//pops number out from NumberStack

				int myNum = (int)NumberStack.pop();
				
				//prints out ascii character value of each value in stack

				System.out.print(myNum + " ");

			}
		
		}
		
		
	}
}


/* ---OUTPUT---

Enter filename: decrypt.txt

46 115 109 101 116 105 111 110 115 110 105 97 116 110 111 99 116 105 44 100 101 116 97 101 114 99 116 115 114 105 102 115 105 107 99 97 116 115 97 110 101 104 87 
46 112 111 116 101 104 116 109 111 114 102 115 105 116 105 114 97 102 119 111 104 114 101 118 111 99 115 105 100 100 110 97 109 101 116 105 110 97 114 111 102 107 99 97 116 115 101 104 116 104 99 114 97 101 115 111 116 100 111 104 116 101 109 97 100 110 97 
44 121 116 112 109 101 115 105 107 99 97 116 115 101 104 116 114 101 104 116 101 104 119 114 111 102 116 115 101 116 111 116 100 111 104 116 101 109 97 
44 107 99 97 116 115 101 104 116 110 111 109 101 116 105 112 111 116 101 104 116 116 97 107 101 101 112 111 116 100 111 104 116 101 109 97 115 97 108 108 101 119 115 97 
44 100 101 100 105 118 111 114 112 101 114 97 115 110 111 105 116 97 114 101 112 111 112 111 112 100 110 97 104 115 117 112 108 97 117 115 117 101 104 84 
46 107 99 97 116 115 97 115 97 100 101 116 97 101 114 116 101 98 111 116 114 111 116 99 101 118 97 119 111 108 108 97 116 97 104 116 115 110 111 105 116 97 114 101 112 111 101 118 105 102 104 116 105 119 114 111 116 99 101 86 115 115 97 108 99 115 100 110 101 116 120 101 116 73 
46 115 116 99 101 106 98 111 102 111 107 99 97 116 115 41 79 70 73 76 40 116 117 111 45 116 115 114 105 102 45 110 105 45 116 115 97 108 97 115 116 110 101 115 101 114 112 101 114 115 115 97 108 99 107 99 97 116 83 101 104 84 

*/
