/*
FVCproductions
Post Review Part 2
Exam 1
CSC 251
*/

import java.util.Scanner;


public class PostReview_2 {

	private int size;
	private int[] stack;
	private int top = -1;
	private Scanner keyboard = new Scanner(System.in);

	//creating constructor to reference in main method later
	
	public PostReview_2 (int num) {
		size = num;
		stack =new int[size];
		top = -1;
	}

	//java method adding element into stack
	//checking to see if stack is full
	
	public void add(int element) {
		if (isFull() == true)
			System.out.println("Stack full, cannot add element.");
		else
			stack[++top] = element;
	}
	
	//java method deleting element from stack
	//checking to see if stack is empty
	
	public int remove() {
		if (isEmpty() == true)
			System.out.println("Stack empty, cannot remove element.");
		return stack[top--];
	}
	
	//method to determine if stack is empty
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	//method to determine if stack is full
	
	public boolean isFull() {
		return (top == size -1);
	}
	
	//method printing array in order
	
	public void printOrder() {
		while(!isEmpty()) {
			int value = remove();
			System.out.print(value + " ");
		}
	}
	
	//method searching for element in array
	
	public boolean search(int element) {
		System.out.print("Please enter element to search for: ");
		element = keyboard.nextInt();
		for (int i = 0; i < size; i++) {
			if (stack[i] == element)
				return true;
		}
		return false;
	}
	
	//method to return LAST element inserted into STACK
	
	public int returnLast() {
		return stack[top];
	}
	
	//main method
	
	public static void main(String[] args) {
	
		PostReview_2 theStack = new PostReview_2(10); 				
		//java method adding element into stack
		
		theStack.add(3);
		theStack.add(5);
		theStack.add(7);
		
		//method to determine if stack is full
		
		System.out.println("Is the stack full? " + theStack.isFull());
		
		//method to determine if stack is empty
		
		System.out.println("Is the stack empty? " + theStack.isEmpty());
		
		//method to search through stack for particular element
		
		System.out.println("Is the element 3 in stack? " + theStack.search(3));
		
		//method to return LAST element inserted into STACK
		
		System.out.println("Last element inserted into stack: " + theStack.returnLast());
		
		//method removing top element from stack
		
		System.out.println("Removing top element from stack...");
		theStack.remove();
		
		//method printing stack in order
		
		System.out.print("Printing stack in order: ");
		theStack.printOrder();
	}

}	

