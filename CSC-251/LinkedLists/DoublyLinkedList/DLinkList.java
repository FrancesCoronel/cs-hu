/*

FVCproductions
CSC 251
Data Structures
November 20, 2014

Detailed Description:

	- DLinkList is the driver of this program and has the main method which reads from a text file called list.txt and executes each text commmand. 
 	- Comments are strewn throughout.
	- This particular driver utilizes the following possible commands for the double linked list:
		- clear()
		- isEmpty()
		- size()
		- add(String aString)
		- get(String aString)
		- remove(String aString)
		- printForward()
		- printReverse()
	- Has 2 Exceptions within the try catch clauses that are called for the remove() and get() methods
		- ItemNotPresentException - throws error if item is not in list
		- EmptyListException - throws error if list is empty

*/

// importing necessary classes

import java.util.Scanner; //Scanner class
import java.io.*; //input output
import java.util.StringTokenizer; //String Tokenizer class

public class DLinkList {
	
	public static void main(String[] args) throws IOException {
		
		MyLinkedList myList = new MyLinkedList(); //creating new object using class file
		
		String command; //commands are read from each line from the text file
		String stringWord = "";					
		
		//reading file with scanner called 'list.txt'
		
		File inputFile = new File("list.txt"); //file being defined as input file
		Scanner readFile = new Scanner(inputFile); //scanner to read file
	
	
		//reading line by line in file with while loop
		
		while(readFile.hasNext()) {
		
			String newLine = readFile.nextLine();
			
			//using string tokenizer to get text command from each line
			
			StringTokenizer st = new StringTokenizer(newLine);
			command = st.nextToken();
			System.out.print("Command: " + command);
			
			if (st.hasMoreTokens()) { //if there are more words after command
				
				stringWord = st.nextToken();
				System.out.print(" " + stringWord);
			
			}
			
			System.out.println();
			
			// command = add
			
			if(command.equals("add")) { //had to complete
			
				myList.add(stringWord);
				System.out.println();
			
			}
			
			// command = size
			
			else if(command.equals("size")) { //had to complete
				
				System.out.println(myList.size());
				System.out.println();
				
			}
			
			// command = printForward
			
			else if(command.equals("printForward")) { //had to complete
				
				myList.printForward();
			
			}

			// command = printReverse
			
			else if(command.equals("printReverse")) { //had to complete
			
				myList.printReverse();
				
			}

			// command = isEmpty
			
			else if(command.equals("isEmpty")) { //had to complete
				
				if(myList.isEmpty()) {
					
					System.out.println("List is empty."); //prints out statement that list is empty
					System.out.println();
				
				}
				
				else {
				
					System.out.println("List is not empty."); //prints out statement that list is not empty
					System.out.println();
				
				}
			}
			
			//if command is get, checking for certain things
			
			else if(command.equals("get")) { //if the text command in list is 'get', then...
				
				try
				{
					myList.EmptyListException(); //checking if list is empty									
               try
					{
						myList.ItemNotPresentException(stringWord); //checking if item is not present in list
						System.out.print("\t" + myList.get(stringWord)); // if not empty or item is present, then successful message appears
						System.out.println("  ***Successful!***");
						System.out.println();
					}
					catch(MyLinkedListException notPresent) //if item not present, prints unsuccessful message
					{
						System.out.println("\t***Unsuccessful*** \n" + notPresent.getMessage());		
						System.out.print("List: ");
						myList.printForward();
						
					}
				}
				catch(MyLinkedListException underflow) //if list is empty, prints unsuccessful message
				{
					System.out.println("\t***Unsuccessful*** \n" + underflow.getMessage());
					System.out.println();
				}
			
			}
			
			// if command is remove, check for certain things

			else if(command.equals("remove")) { //had to complete
				
				try {
								
					myList.EmptyListException(); //checking if list is empty
					
					try {
						
						myList.ItemNotPresentException(stringWord); //checking if item is not present in list
						System.out.print("\t" + myList.remove(stringWord)); // if not empty or item is present, then successful message appears
						System.out.println("  ***Successful!***");
						System.out.println();
					}
					
					catch(MyLinkedListException notPresent) { //if item not present, prints unsuccessful message
						
						System.out.println("\t***Unsuccessful*** \n" + notPresent.getMessage());
						System.out.print("List: ");
						myList.printForward();
						System.out.println();
					
					}

				}
				
				catch(MyLinkedListException underflow) { //if list is empty, prints unsuccessful message
					
					System.out.println("\t***Unsuccessful*** \n" + underflow.getMessage());
					System.out.println();
				
				}
	
			}
			
			// command is clear
			
			else if(command.equals("clear")) { //had to complete
      			
				myList.clear(); //calling myList clear method
				System.out.println("List has been cleared.");
				System.out.println();
				
			}
			
			// if command is none of the above, then error message!

			else {
				
				System.out.println("!!!Command not clear!!!");
				System.out.println();
			
			}
	
		}
		
		//closing file
		
		readFile.close();			
	
	}
}