/*
FVCproductions
September 26, 2014
Program_StackPrint.java

Stacks implemented as an array in Java
- filling Stack with values
- printing Stack values in order
- printing Stack values in reverse
*/


public class Program_StackPrint {

	//declaring final size of stack as 8 
	final static int size = 8;
	
	//declaring array_Stack which is implemented as a Stack but is called as an array
	static int array_Stack[] = new int[size];  
	
	//method 1
	//filling stack with values using for loop
	//values will be the numbers 0 - 7
	
	public static void fill_stack(int [] theArray) {

		for (int i = 0; i < size; i++) {
			
			//index 0 - 7 in array will be filled with numbers 0 - 7
			theArray[i] = i; 

		}
	
	}
	
	public static void print_stackOrder(int [] theArray) {
		
		//declaring and initializing temporary stack to be same size as original array_Stack
		int[] temp = new int[size];
		
		//declaring and initializing temporary top value of 0
		int temp_top = 0;
		
		//for loop following LIFO characteristic of Stacks
		//from 7 till 0, decrements top value
		for (int top = 7; top >= 0; top--) {
			
			//top of temporary (0 at first) will equal value at array index of top (7 at first)
			temp[temp_top] = theArray[top]; 
			
			//incrementing top of temporary (going from 0 to 1, and so on)
			//this way it goes through all index values of array Stack
			temp_top++;
		
		}
		
		//re-initializing temporary top as 0
		temp_top = 0;
		
		//again same for loop following LIFO characteristics of Stacks
		//from 7 till 0, increments temporary top value
		//interdependent on first for loop for proper Stack implementation
		for(int top = 7; top >= 0; temp_top++) {
		
			//value of array index of temporary top (0 at first) will equal value of temporary array index of top (7 at first)
			theArray[temp_top] = temp[top];
			
			//printing out value of array index of temporary top (0 then 1 and so on) with space for formatting
			System.out.print(theArray[temp_top] + " ");
			
			//decrementing top (7 then 6 and so on)
			//this way it goes through all index values of temporary stack
			top--;
		
		}
			
	}
	
	public static void print_stackRev(int [] theArray) {
		
		//declaring and initializing temporary stack to be same size as original array_Stack
		int [] temp = new int[size];
		
		//for loop implementing LIFO characteristic of Stacks
		//starting at 0, till 4 in this case since size = 8, incrementing by 1
		//so 1 through 4
		for (int i = 0; i < size / 2; i++) {
		
			//value at temporary stack index (0 at first) equals to value at array index (0 at first as well)
			temp[i] = theArray[i];
			
			// value at array stack index (0 at first) = equals to value at array stack index which is first decremented by i from top-1 (which is at index 7)
			
			// 

			theArray[i] = theArray[7 - i];
			
			//this decremented index which we went over in the last statment is then equated to the value at temporary stack index
			theArray[7 - i] = temp[i];
		
		}
		
		//for loop printing out all values of now the reversed array indexes
		for (int i = 0; i < size; i++) {
		
			System.out.print(theArray[i] + " ");
		
		}
								
	}
	

	public static void main(String[] args) {
					
		//fill_stack method for array_Stack
		fill_stack(array_Stack);
		
		//printing out array using for loop
		System.out.print("Array: ");
		
		for (int i = 0; i < size; i++) {
			
			System.out.print(array_Stack[i] + " ");
		
		}
		
		
		//print Stack values in order
		System.out.print("\nIn order: ");
		
		//calling print_stackOrder method for array_Stack
		print_stackOrder(array_Stack);
		
		//print Stack values in reverse
		System.out.print("\nIn reverse: ");
		
		//calling print_stackRev method for array_Stack
		print_stackRev(array_Stack);

	}

}