// FVCproductions
// Linked Lists Implementation - Java


// importing necessary classes

import java.util.*;
import java.io.*;

// declaring Node class

class Node {

	// declaring Node next
	// declaring int data

	Node next;
    int data;

	// creating constructor for Node that has 1 input argument of value/dataEntry

	public Node(int value) {

		data = value;
		next = null;

	}

}

// actual class with linked list methods

public class LinkedList {

	// head starts out as null

	private static Node head = null;
	private static Scanner keyboard = new Scanner(System.in);

    // addToEmpty method
    // adds node (assuming an empty list)

    public static void addToEmpty(int item) {

		head = new Node(item);

	}

    // addToHead method
    // adds node to front/head of the list

    public void addToFront(int item) {

    	// checks if list is empty

		if (isEmpty()) {

			// if list is empty, uses addToEmpty method instead

			addToEmpty(item);

		}

		Node temp = new Node(item);
		temp.next = head;
		head = temp;

	}

	// addToMid method
	// adds node to middle of the list

    public void addToMid(int item) {

    	// checks if list is empty

		if (isEmpty()) {

			// if list is empty, uses addToEmpty method instead

			addToEmpty(item);

		}

		// declaring count

		int count = 0;

		//
		Node temp = head;

		while(temp.next != null) {

			count++;
			temp = temp.next;

		}

		Node newNode = new Node(item);

		Node current = head;

		for (int i = 0; i < count/2 -1; i++) {

			current = current.next;

		}

		newNode.next = current.next;
		current.next = newNode;

	}

	// addToEnd method
	// adds node to end of the list

    public void addToEnd(int item) {

    	// same as removeFromEnd method but adds Node instead of removes it

    	// declaring and assigning temporary node to head

		Node temp = head;

    	// checks if list is empty

		if (isEmpty()) {

			// if list is empty, uses addToEmpty method instead

			addToEmpty(item);

		}

		// traverses through entire list

		while(temp.next != null) {

			// goes to next node in list

			temp = temp.next;

		}

		// adds node to last node from while loop
		// assings item value to data entry of new Node

		temp.next = new Node(item);


	}

	// removeAfter method
	// removes the node that is lcoated after the argument node passed in

    public static void removeAfter(int item) {

		//checks if list is empty

		if (isEmpty()) {

			// if empty, prints out message

			System.out.println("Cannot remove from empty linked list.");

		}

		// defining temp as head node

		Node temp = head;

		// traverses through list while the head.data does not equal the argument node passed in

		while (temp.data != item) {

			// goes to next node

			temp = temp.next;
		}

		// the node after the argument item is now assigned to be null and is effectively removed

		temp.next = null;


    }

    // removeFromEnd method
	// removes last node

	public static void removeFromEnd() {

		// same as addToEnd method but removes Node instead of adds it

		// checks if list is empty

		if(isEmpty()) {

			// if empty, prints out message

			System.out.println("Cannot remove from empty linked list.");

		}

		// declares and initializes temp node to head

		Node temp = head;

		// traverses list until the next node after the next is not null

		while (temp.next.next != null) {

			// goes to next node in list

			temp = temp.next;

		}

		// last node is assigned as null and therefore the last node is effectively removed

		temp.next = null;

	}

	// isEmpty method
    // checks if list is empty
   	// if empty, return true
   	// else, returns false

	public static boolean isEmpty() {

		// if head is null, list is empty

		return (head == null);

	}

	// print method

	public static void print() {

		// checks if list is empty

		if(isEmpty()) {

			// if list is empty, prints message

			System.out.print("The linked list is empty.");

		}

		// declares and initializes temp node to head

		Node temp = head;

		// traverses through list

		while (temp != null) {

			// prints arrow to indicate linkage and then the data value

			System.out.print(" --> " + temp.data);

			// goes to next node
			temp = temp.next;

		}

		// prints extra line for formatting purposes

		System.out.println();

	}

	// returnLast method
	// used for addToFront method

	private Node returnLast() {

		// if list is empty

		if(isEmpty()) {

			return null;

		}

		Node temp = head;

		while (temp.next != null) {

			temp = temp.next;

		}

		return temp;

	}

	// main method
	// testing all methods

	public static void main(String[] args) throws IOException {

		// creating new object for LinkedList

		LinkedList myList = new LinkedList();

		// printing empty list

		System.out.print("Printing Empty List: ");
		myList.print();

		// using addToEmpty method
		// adds node to empty list
		// asking user to submit node

		System.out.print("\nChoose an element to add to the empty list: ");
		int value = keyboard.nextInt();
		myList.addToEmpty(value);

		System.out.print("Printing List: ");
		myList.print();

		// using addToFront method
		// adds node to front of the list
		// asking user to submit node

		System.out.print("\nChoose an element to add to the front: ");
		value = keyboard.nextInt();
		myList.addToFront(value);

		System.out.print("Printing List: ");
		myList.print();

		// using addToFront method
		// adds node to front of the list
		// asking user to submit node

		System.out.print("\nChoose an element to add to the front again: ");
		value = keyboard.nextInt();
		myList.addToFront(value);

		System.out.print("Printing List: ");
		myList.print();

		// using addToMid method
		// adds node to middle of the list
		// asking user to submit node

		System.out.print("\nChoose an element to add to the middle: ");
		value = keyboard.nextInt();
		myList.addToMid(value);

		System.out.print("Printing List: ");
		myList.print();

		// using addToEnd method
		// adds node to end of the list
		// asking user to submit node

		System.out.print("\nChoose an element to add to the end: ");
		value = keyboard.nextInt();
		myList.addToEnd(value);

		System.out.print("Printing List: ");
		myList.print();

		// using removeFromEnd method
		// removes node from end of the list

		System.out.print("\nRemoving End Node.");
		myList.removeFromEnd();

		System.out.print("\nPrinting List: ");
		myList.print();

		// using removeAfter method
		// deletes node and all potential nodes that come after the argument value
		// asking user to submit value

		System.out.print("\nChoose an element where you want to remove after: ");
		value = keyboard.nextInt();
		myList.removeAfter(value);

		System.out.print("Printing List: ");
		myList.print();

	}

}