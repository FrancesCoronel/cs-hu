 /**
 * ListStack.java implements a stack by using linked lists.
 * Inner Node class is included.
 * Utilizes  DStack interface.
 * 
 * @author FVCproductions
 * @version 1.0
 * @since 1-16-2015
 * @see DStack.java
 */

/**
 * only class we are allowed to import for this project
 * will throw an error if  stack is empty
 * @see EmptyStackException
 */

import java.util.EmptyStackException;

public class ListStack implements DStack {

	/**
	 * This is where the inner Node class will go
	 * Contains the necessary 2 variables needed
	 * Which are the .data for object and .next for Node
	 */
	class Node {

		double data;
		Node next;
		
		/**
		 * Node constructor with 2 parameters
		 * @param d - double type
		 * @param n - Node type
		 */
		Node(double d, Node n) {
			data = d;
			next = n;
		}
	}
	
	// declaring necessary Node stack variable 
	private Node stack;
	
	/**
	 * ListStack constructor creates an empty stack 
	 * stack variable set to null as default
	*/
	public ListStack() {
		stack = null;
	}

	/**
	 * isEmpty method checks if stack is empty
	 * @return true if stack is empty, 
	 * @return false orwise
	 */
	public boolean isEmpty() {
		if (stack == null)
		{
			return true;
		}
		return false;
	}

	/**
	 * push method stores a  data value into a stack 
	 * @param d a double data
	 * @see DStack.java
	 */
	public void push(double d) {
		// if stack is empty
		if (isEmpty()) {
			// stack is set to a new node with param (double data) 
			// and is pointed to null 
			// since re is no node present yet
			// in  empty stack
			stack = new Node(d, null);
		} else 
		{
			// if stack is not empty
			// temporary node is created and is set to a new node
			// with data of param (double data)
			Node temp = new Node(d, stack);
			// stack is set to Node temp data
			stack = temp;
		}
	}

	/**
	 * pop method returns last data pushed into stack and removes it
	 * @return last data pushed into stack
	 * @throws EmptyStackException if stack is empty
	 */
	public double pop() {
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		double data = stack.data;
		stack = stack.next;
		return data;
	}

	/**
	 * peek method returns last data stored into stack without changing stack.
	 * @return last data stored into stack
	 * @throws EmptyStackException if stack is empty
	 */
	public double peek() {
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		return stack.data;
	}
	
}
