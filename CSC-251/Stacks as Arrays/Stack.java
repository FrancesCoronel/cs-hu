// CORRECTED FOR ERRORS!

//importing necessary classes

import java.util.*;
import java.io.*;

public class Stack {

	static int top = -1;

	//declaring final size of stack as 20

	final static int size= 20;

	//declaring stack with size of 20
	//treated as a stack but implemented as an stack

	final static String[] stack = new String[size];

	public static void main(String[] args) throws IOException {

		//stack10_Store method
		//storing strings into stack from text file

		System.out.println("Storing elements into Stack...\n");
		stack10_Store(stack, "Strings.txt");

		//stack_add method
		//adding element into stack
		System.out.println("Adding 'Medici' to Stack...\n");
		stack_add(stack, "Medici");

		//stack_Remove method
		//removing element from stack
		System.out.println("Removing top element from Stack...\n");
		stack_Remove(stack);

		//stack_isFull method
		//checking if stack is full
		//returns true if full, else false

		System.out.print("The stack is full: ");
		System.out.print(stack_isFull(stack));
		System.out.println("\n");

		//stack_isEmpty method
		//checking if stack is empty
		//returns true if empty, else false

		System.out.print("The stack is empty: ");
		System.out.print(stack_isEmpty(stack));
		System.out.println("\n");

		//stack_Print0 method
		//printing stack in order

		System.out.print("Printing Stack in Order: ");
		stack_PrintO(stack);
		System.out.println("\n");

		//stack_PrintR method
		//printing stack in reverse order

		System.out.print("Printing Stack in Reverse: ");
		stack_PrintR(stack);
		System.out.println("\n");

		//stack_CreateSentence method
		//creating sentence in order using Strings from stack

		System.out.print("Creating Sentence in Order: ");
		stack_CreateSentence(stack);
		System.out.println("\n");

		//stack_CreateRSentece method
		//creating sentence in reverse order using Strings from stack

		System.out.print("Creating Sentence in Reverse Order: ");
		stack_CreateRSentence(stack);
		System.out.println("\n");

		//stack_Find method
		//finding given String in Stack and returning true if found, else false

		System.out.print("Is the String 'Damien' in Stack: ");
		System.out.print(stack_Find(stack, "Damien"));
		System.out.println("\n");

		//stack_NumOccur method
		//finding number of times given String in Stack appears
		//returns number of times found

		System.out.print("# of occurences String 'Violet' appears in Stack: ");
		System.out.print(stack_NumOccur(stack, "Violet"));
		System.out.println("\n");

		//stack_Clr method
		//clears Stack completely
		//makes all values null

		System.out.println("Clearing Stack...");
		stack_Clr(stack);

	}

	//read file - storing 10 strings 
	//method called stack10_Store

	public static void stack10_Store(String fileName) throws IOException {

		Scanner fileReader = new Scanner(new File(fileName));
		
		int count = 0;
		
		while(fileReader.hasNext()) {
			
			stack[count] = fileReader.next();
		
			count++;
		
		}

	}

	//add one string into stack
	//method called stack_add

	public static void stack_add(String element) {

		if (stack_isFull(aStack))
			System.out.println("Stack is full, you cannot add an element.");
		else
			stack[++top] = element;

	}

	//remove a string from stack
	//method called stack_Remove

	public static int stack_Remove() {
			
		if (stack_isEmpty(aStack))
			System.out.println("Stack is empty, you cannot remove an element.");
		return stack[top--];
	}
	

	//checking if stack is full
	//method called stack_isFull()

	public static boolean stack_isFull() {

		return (top == size-1);
		
	}

	//checking if stack is empty
	//method called stack_isEmpty()

	public static boolean stack_isEmpty(String[] aStack) {

		return (top == -1);

	}

	//printing out stack in order
	//method called stack_PrintO

	public static void stack_PrintO(String[] aStack) {
	
		//declaring and initializing temporary stack to be same size as original array_Stack
		String[] temp = new String[size];
		
		//declaring and initializing temporary top value of 0
		int temp_top = 0;
		
		//for loop following LIFO characteristic of Stacks
		//from 7 till 0, decrements top value
		for (int theTop = top; theTop >= 0; theTop--) {
			
			//top of temporary (0 at first) will equal value at stack index of top (7 at first)
			temp[temp_top] = stack[theTop]; 
			
			//incrementing top of temporary (going from 0 to 1, and so on)
			//this way it goes through all index values of stack
			temp_top++;
		
		}
		
		//re-initializing temporary top as 0
		temp_top = 0;
		
		//again same for loop following LIFO characteristics of Stacks
		//from 7 till 0, increments temporary top value
		//interdependent on first for loop for proper Stack implementation
		for(int theTop = top; theTop >= 0; temp_top++) {
		
			//value of stack index of temporary top (0 at first) will equal value of temporary stack index of top (7 at first)
			stack[temp_top] = temp[theTop];
			
			//printing out value of stack index of temporary top (0 then 1 and so on) with space for formatting
			System.out.print(stack[temp_top] + " ");
			
			//decrementing top (7 then 6 and so on)
			//this way it goes through all index values of temporary stack
			theTop--;
		
		}
		
	}

	//printing out stack in reverse
	//method called stack_PrintR

	public static void stack_PrintR(String[] aStack) {
	
		//declaring and initializing temporary stack to be same size as original array_Stack
		String[] temp = new String[count];
		
		//for loop implementing LIFO characteristic of Stacks
		//starting at 0, till 4 in this case since size = 8, incrementing by 1
		//so 1 through 4
		for (int i = 0; i < top / 2; i++) {
		
			//value at temporary stack index (0 at first) equals to value at stack index (0 at first as well)
			temp[i] = aStack[i];
			
			//value at stack index (0 at first) = equals to value at stack index which is first decremented by i from top-1 (which is at index 7)
			aStack[i] = aStack[top - 1 - i];
			
			//this decremented index which we went over in the last statment is then equated to the value at temporary stack index
			aStack[top - 1 - i] = temp[i];
		
		}
		
		//for loop printing out all values of now the reversed stack indexes
		for (int i = 0; i < top; i++) {
		
			System.out.print(aStack[i] + " ");
		
		}

	}

	//finding string in stack
	//method called stack_Find(String str)

	public static boolean stack_Find(String[] aStack, String target) {
		
		for(int i = 0; i < top; i++) {

			if(aStack[i].equals(target))
				return true;

		}

		return false;

	}

	//finding number of occurences in stack
	//method called stack_NumOccur(String str)

	public static int stack_NumOccur(String[] aStack, String element) {

		int instance = 0;

		for(int i = 0; i < top; i++) {

			if(aStack[i].equals(element))
				instance++;
				
		}

		return instance;

	}
	

	//clear stack
	//method called stack_Clr()

	public static void stack_Clr(String[] aStack) {

		for(int i = 0; i < size; i++) {

			aStack[i] = null;

		}

	}

	//create sentence in order
	//method called stack_CreateSentence

	public static void stack_CreateSentence(String[] aStack) {

		System.out.print("Hello everyone. It seems we have in our presence today: ");
		
		for (int i = 0; i < top; i++) {
			
			System.out.print(aStack[i] + " ");
			
		}
		
		return;

	}

	//create sentence in reverse
	//method called stack_CreateRSentence

	public static void stack_CreateRSentence(String[] aStack) {

		System.out.print("Hello everyone. It seems we have in our presence today: ");
		
		
		for (int i = top-1; i >= 0; i--) {
		
			System.out.print(aStack[i] + " ");
			
		}
		
		return;

	}

}