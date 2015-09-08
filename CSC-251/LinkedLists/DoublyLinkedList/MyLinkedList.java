/*

FVCproductions
CSC 251
Data Structures
November 20, 2014

Detailed Description:

	- MyLinkedList is the class of this program and is where all the methods are located that run the overall driver commands in the driver DLinkList.
 	- Comments are strewn throughout describing each specific method. 
	- The constructor for the Node uses only one parameter (info).
	- This particular class has the following methods for the double linked list:
		- clear()
		- isEmpty()
		- size()
		- add(String aString)
		- get(String aString)
		- remove(String aString)
		- printForward()
		- printReverse()
	- Has 2 Exceptions: 
		- ItemNotPresentException - throws error if item is not in list
		- EmptyListException - throws error if list is empty

*/

public class MyLinkedList { //replaced with my initials so 
	
	private static class Node<String> {
		
		public Node(String i) { //constructor of Node with 1 parameter of information
			
			info = i; //information parameter					
		
		}
		
		public String info; //String holding data or info of node			
		public Node<String> previous; //previous node created to access previous position of given node	
		public Node<String> next; //next node created to access next position of given node
	
	}
	
	public int numItems = 0; //acts as our counter		
	public Node<String> last; //acts as tail			
	public Node<String> position; //acts as current position
	public Node<String> list; //acts as head				
	
	public MyLinkedList() { //replaced with my initials so 
		
		clear(); //clearing list for initial settings
	
	}

	public void clear() { //had to complete <--
		
		//assigning both head and tail to null
		
		list = null;
		last = null;
		
		
	}

	public boolean isEmpty() { //had to complete <--
		
		if (list == null && last == null) { //if both are null, then list is empty
			return true;
		}
		else {
			return false; //list isn't empty
		}
	}
	
	public String size() { //had to complete <--
	
		return String.valueOf(numItems); //returning string value of number of items
								
	}
	
	public void add(String aString) { //had to complete

		position = list; // current position equal to head
		
		MyLinkedList.Node newNode = new MyLinkedList.Node(aString);
								
		//while(!position.info.equalsIgnoreCase(aString) && position.next != null) {
			
			// this will be only element in list
			
			if(list == null) { // head with size = 1
	      
	      		list = newNode; // new element at beginning of list
				newNode.previous = list;
				newNode.next = null;
				position = newNode;
				last = newNode;

			}
			
			// inserting at front of non-empty list
			
			else if(position == list) { // head with size greater than 1

				list = newNode; // new element at beginning of list
				newNode.previous = list;
				newNode.next = position;
				position.previous = newNode;

			}
			
			// inserting at end of non-empty list
			
			else if(position == null && list != null) {  // position at tail
			
				last.next = newNode;
				newNode.previous = last;
				last = newNode;
				position = newNode;

			}

			// inserting somewhere between first and last elements
			
			else {

				position.previous.next = newNode;
				newNode.previous = position.previous;
				newNode.next = position;
				position.previous = newNode;
	         
			}
			
			numItems++; //incrementing number of items in list

			System.out.println(aString + " added"); //added message
		
		//}

	}
	
	public String get(String aString) { //had to complete
		
		position = list; //initializing position as head
		
		while(!position.info.equalsIgnoreCase(aString) && position.next != null) { //traversing through until aString is reached in list
			
			position = position.next; //going to next node
			
		}
		
		return position.info; //returning value aString - or data of current node - to print out in driver
	}
	
	
	public String remove(String aString) { //had to complete
		
		position = list; // current position equal to head
		
		//at least one value removed
		//any duplicates stay
		//previous value not null because list can be empty
		//first element matching value in parameter is removed from list
		//return value - aString - is value removed

		
		while(!position.info.equalsIgnoreCase(aString) && position != null) { //traversing entire list until remove
			
			position = position.next; //going to next node
		}
			
		if (position != null) {
			
			// fixed next field of position above
			if (position.previous != null) {
				position.previous.next = position.next;
			}
			
			else {
				position = position.next;
			}
			
			// fixed previous field of position above
			if (position.next != null) {
				position.next.previous = position.previous;
			}
			else {
				last = position.previous;
			}
			
		}
		
		numItems--; //decrementing number of items 
		
		return aString; //returning value of aString to print out in driver
		
    }
	
	public void printForward() { //had to complete
		
		position = list; //initialize position as head
		
		while (position != null) { //traversing entire list until last node which is null 
			
			System.out.println(position.info + " "); //printing out data at each node
			position = position.next; //going to next node
		
		}
		
		System.out.println(); //for formatting
	}
	
	public void printReverse() { //had to complete
		
		position = last; //initialize position as tail since we're printing in reverse
		
		System.out.println(position.info + " ");
		
		while (position != list) { //traversing entire list until head
			
			System.out.println(position.previous.info + " ");
			position = position.previous; //going to previous node
		
		}
		
		System.out.println(); //for formatting
		
	}
	
	public void EmptyListException() throws MyLinkedListException { //had to complete
		
		MyLinkedListException underflow = new MyLinkedListException("Error. The list is empty.");
		
		if (isEmpty() == true) { //if list is empty
			
			throw underflow; //throwing error message is the list is empty
		
		}
		
		
	}
	
	
	public void ItemNotPresentException(String aString) throws MyLinkedListException { //had to complete
   
		MyLinkedListException notPresent = new MyLinkedListException("Error. That item is not present in the linked list.");

		boolean found = false; //creating boolean called found that is initialized to false
				
		// declares and initializes temp node to head

		Node temp = list;
		
		// traverses through list

		while (temp != null) {
	
			// prints arrow to indicate linkage and then the data value

			if (temp.info.equals(aString)) {
				found = true;
			}
			
			// goes to next node
			temp = temp.next;
			
		}
		
				
		if(found == false) { //if element not found
			
			throw notPresent; //throwing not present message error if the element was not found in list
			
		}
	}
	
}