/*

FVCproductions
CSC 251
Data Structures
November 20, 2014

Detailed Description:

	- MyLinkedListException.java forms the exception class for the error messages we must call when we throw the two exceptions included in the class, MyLinkedList.java
 	- Comments are strewn throughout.
	- Class has 2 Exceptions: 
		- ItemNotPresentException - throws error if item is not in list
		- EmptyListException - throws error if list is empty
	- Here we are just creating the necessary exception constructor (empty and with message as parameter) and class so as to sucessfully relay the messages for the specific error prone situations later.

*/

public class MyLinkedListException extends Exception { //acts as an Exception for the driver file in all the try catch exceptions
	
	//constructor that copies the constructor in the Exception class
	
	public MyLinkedListException() {
		
		super(); //constructor - empty
	
	}
	
	public MyLinkedListException(String message) { //relays error message when exception is caught
		
		super(message); //printing error message
	
	}

}