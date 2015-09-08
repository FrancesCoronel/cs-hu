/*
FVCproductions
Queue Array Implementation
*/

// importing necessary classes

import java.util.*;
import java.io.*;

public class Queue {
	
	// declaring and initializing necessary variables
	
	static int front;
	static int rear;
	static int size = 8;
	static int[] queue;
	static int count;
	static Scanner keyboard = new Scanner(System.in);
	
	// declaring program class called Queue_FLN
	
	// constructor should create an empty queue structure - size 8
	
	public Queue() {
		
		queue = new int[size];
		front = 0;
		count = 0;
		rear = 0;
		
	}
	
	// void method that stores 5 elements from a text file into the queue
	
	public static void storeQFC(String fileName) throws IOException {
		
		Scanner fileReader = new Scanner(new File(fileName));
		
		while (fileReader.hasNext()) {
			queue[rear] = fileReader.nextInt();
			rear++;
			count++;
		}
	
	}
	
	// void method that passes in an element to be added to the queue

	public static void addToQ(int element) {
		
		if (isFullQ()) {
			System.out.println("Overflow.");
		}
		else {
			queue[rear++] = element;
			if (rear == count) {
				rear = 0;
			}
			count++;
		}
		
	}
	
	// returns last added item - could also be void
	// removes element from queue

	
	public static int removeFromQ() {
		
		if (isEmptyQ()) {
			System.out.println("Underflow.");
		}
		int item = queue[front];
		queue[front] = 0;
		count--;
		front++;
		if (front == count)
			front = 0;
		return item;

	}
	
	// tests for emptiness in queue
	// if empty, returns true
	// else, returns false
	
	public static boolean isEmptyQ() {
		
		return (count == 0);
	
	}
	
	// tests for fullness in queue
	// if full, returns true
	// else, returns false
	
	public static boolean isFullQ() {
		
		return (count == size);
	
	}
	
	public static void printQ() {
		
		int temp = 0;
		String result = "";
		while(temp < count) {
			if(queue[temp]!=0) {
				result += queue[temp] + " ";
			}
		    temp++;
		}
		System.out.println(result);
	}
	
	// boolean search method looks for an element in queue
	// returns true if found
	// returns false if not found
	
	public static boolean searchQ(int element) {
		
		int temp = 0;
		String result = "";
		while(temp < count) {
			if(queue[temp] != element) {
				return true;
			}
		    temp++;
		}	
		
		return false;
	}
	
	// num of occurences for element in queue
	
	public static int numOccurQ(int element) {
		
		int temp = 0;
		int numCount = 0;
		String result = "";
		while(temp < count) {
			if(queue[temp] == element) {
				numCount++;
			}
		    temp++;
		}	
		
		return numCount++;
		
	}
	
	public static void main(String[] args) throws IOException {

		// creating object in driver called 'theQueue'
		
		Queue theQueue = new Queue();  // queue holds 5 items
		
		System.out.println("---Queue Array Implementation---\n");
		
		// create a file that will add five elements
		// file called 'data.txt'
		
		storeQFC("data.txt");
		
		System.out.print("Adding from file:\t");
		theQueue.printQ();
		
		// add enough elements to cause overflow and wrap around
		
		System.out.print("What element do you want to add?\t");
		int response = keyboard.nextInt();
		theQueue.addToQ(response);
		
		System.out.print("Printing Queue:\t");
		theQueue.printQ();
		
		// searching for an element and returning true if found
		
		System.out.print("Searching for # 5:\t" + theQueue.searchQ(5) + "\n");
		
		System.out.print("Number Of Occurences # 5:\t" + theQueue.numOccurQ(5) + "\n");
		
		// remove enough elements to cuase underflow and wrap around
		
		System.out.print("Removing from Queue:\t");
		theQueue.removeFromQ();
		theQueue.printQ();
		
		// tests fullness of queue
				
		System.out.println("Is the Queue Full:\t" + theQueue.isFullQ());
				
		
		// tests emptiness of queue
		
		System.out.println("Is the Queue Empty:\t" + theQueue.isEmptyQ());
		

	}
	
} 