/***************************************************

fvcproductions

july 2012
 
To prevent someone from reading a secret message, 
an encryption and decryption algorithm is created.

This is a decryption program that reverses 
lines in a file, and reverse numbers in each line. 

Each of the numbers represents an ascii character 
code, e.g. 66 is ‘A’, 97 is ‘a’, which you will print 
them at the end of the program.

****************************************************/

//importing necessary classes for all methods used
import java.io.*;
import java.util.*;
import java.lang.*;

public class Decryption {
	
	//throwing IOException in main method for file reading
	public static void main(String[] args) throws IOException {
		
		//declaring scanner object called keyboard
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter filename: ");
		String fileName = keyboard.nextLine();
		
		//creating BufferedReader object to read encypted text file
		BufferedReader input = new BufferedReader(new FileReader(fileName));

		//declaring an int variable that contains the number of lines the text file holds
		//number found on first line of text
		int numLines = Integer.parseInt(input.readLine());
		
		//declaring String stacks for odd/even lines
		Stack<String> ODD_LineStack = new Stack<String>();
		Stack<String> EVEN_LineStack = new Stack<String>();
		
		//declaring integer type Stack for NumberStack
		Stack<Integer> NumberStack = new Stack<Integer>();	
		//declaring String variable line		
		String line = "";
				
		//delcaring boolean holder for odd/even lines implementation using numLin3w
		boolean ifOdd = true;
		
		//while loop for reading all lines from text file
		while ((line = input.readLine()) != null) {
	
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
				
				//changes each token into an integer
				int token = Integer.parseInt(tokenizer.nextToken());

				//pushing each token into NumberStack
				NumberStack.push(token);
				
			}
			
			System.out.println();
			
			while (!NumberStack.isEmpty()) {
				
				//pops number out from NumberStack
				int myNum = NumberStack.pop();
				
				//prints out ascii character value of each value in stack
				System.out.print((char)myNum);

			}
		
		}
		
		
	}
}


/* ---OUTPUT---MESSAGE_1---

Enter filename: encrypted_message1.txt

The Stack class represents a last-in-first-out (LIFO) stack of objects. 
It extends class Vector with five operations that allow a vector to be treated as a stack. 
The usual push and pop operations are provided, 
as well as a method to peek at the top item on the stack, 
a method to test for whether the stack is empty, 
and a method to search the stack for an item and discover how far it is from the top.
When a stack is first created, it contains no items.


*/


/* ---OUTPUT---MESSAGE_2---

Enter filename: encrypted_message2.txt

Companies Built on Sharing Balk When It Comes to Regulators
By DAVID STREITFELD

Brian Chesky, chief executive of Airbnb, says that existing laws don’t pertain to his company, which facilitates short-term rentals.
Chris Weeks/Getty Images for Airbnb

Brian Chesky, chief executive of Airbnb, says that existing laws don’t pertain to his company, which facilitates short-term rentals.
Regulators and elected officials are increasingly questioning the presumptions and tactics of rental and ride-sharing start-ups like Airbnb, Uber and Lyft.

 Reed Hastings of Netflix, which posted unexpectedly high profits.
Netflix Says It Opposes Comcast’s Merger Bid
By MICHAEL J. de la MERCED	
It was the clearest statement on the merger from Netflix, nearly two months after it agreed to pay Comcast for a more direct connection to the cable operator’s Internet backbone.

BITS BLOG

 Tom Preston-Werner, one of GitHub's co-founders, resigned after he found himself at the center of a controversy over discrimination at the organization.
GitHub Founder Resigns After Investigation
By CLAIRE CAIN MILLER	
The company said the investigation, into gender-based harassment, found no evidence of illegal practices.

DEALBOOK

 Starbucks struck a partnership with the payments start-up Square in 2012.
For Square, Making Money Remains a Challenge
By WILLIAM ALDEN	
Companies already collect payments when a customer swipes a credit card. The question, analysts say, is how a start-up like Square can make itself into more than just another middleman.

BITS BLOG

 At the SXSWedu conference last year, Iwan Streichenberger, left, the chief executive of inBloom, appeared with Bill Gates, whose foundation provided seed money for the company.
InBloom Student Data Repository to Close
By NATASHA SINGER	
The student data warehousing venture that became a lightning rod for some parents’ data privacy and security concerns, announced it would close.

BITS BLOG

 The display of Apple's iPhone 5S measures 4 inches diagonally, while competitors, including Samsung, have been producing smartphones with displays at least 20 percent larger.
Analysts Share High Expectations for Bigger iPhones
By BRIAN X. CHEN	
Many consumers have developed an appetite for smartphones with larger screens, and some analysts expect Apple this year to supersize the iPhone, too.

 Michael Devine, a plaintiff in a bitter class-action suit.
In Silicon Valley Thriller, a Settlement May Preclude the Finale
By DAVID STREITFELD
Four leading tech companies are pushing to settle a class-action suit with several noteworthy angles, including questions over employee rights and the death of a programmer who helped set the case in motion.

66 Comments
 Wireless routers attached to rooftops in Sayada form a local network that the developers say is more secure than the Internet.
U.S. Promotes Network to Foil Digital Spying
By CARLOTTA GALL and JAMES GLANZ
The State Department and other agencies are spending millions around the world to finance local systems, called mesh networks, as more secure alternatives to the Internet.

51 Comments

*/
