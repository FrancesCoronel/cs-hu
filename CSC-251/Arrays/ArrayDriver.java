/*
FVCproductions
CSC 215
Data Structures
Array Methods
Due Date: September 16, 2014 before Midnight
*/

//importing necessary classes

import java.util.*;
import java.io.*;

public class ArrayDriver {
	
	//assigning pre-defined array size to variable "size"
	//testing with GitHUb

	final static int size = 12;

	public static void main(String[] args) throws IOException {

		//creating String array called array
		//fixed size of 12

		String[] array = new String[size];

		//storeArray
		//stores elements into single dimensional array structure of Strings

		System.out.println("Storing Array...\n");
		
		storeArray(array, "Names.txt");
		
		//printArray
		//prints out all elements of array structure
		//checks if structure is empty
		//if empty, prints out message

		System.out.print("Printing Array: ");
		printArray(array);
		System.out.print("\n");

		//searchArray
		//accepts a String
		//searches array structure for element
		//returns boolean (True or False)

		System.out.print("\nSearching Array for the element 'searching': ");
		
		System.out.print(searchArray(array, "searching"));
		
		System.out.println();

		//instancesFound
		//accepts String
		//returns # of instances found

		System.out.print("\nInstances found for the element 'instance': ");
		
		System.out.print(instancesFound(array, "instance"));
		
		System.out.println();

		//copyMyArray
		//copies array structure into another array structure

		System.out.println("\nCopying array into another array structure...");
		
		String[] copied = new String[size];

		copyMyArray(array, copied);

		//isArrayFull
		//returns boolean
		//to determine if array is full or not

		System.out.print("\nIs array full: ");
		
		System.out.print(isArrayFull(array));

		//isArrayEmpty
		//returns boolean
		//to determine if array is empty or not

		System.out.print("\n\nIs array empty: ");
		System.out.print(isArrayEmpty(array));

		//arraySize
		//returns array size (how many elements in array structure)

		System.out.print("\n\nArray size: ");
		arraySize(array);

		//createSentence
		//returns sentence from words currently stored in array structure
		
		System.out.print("\nSentence created: ");
		createSentence(array);
		System.out.print("\n");
		
		//addToArray
		//adds element to array structure
		//checks if structure is full
		//if full, causes an exception

		System.out.print("\nAdding to Array... ");
		
		addToArray(array, "Adda");
		
		System.out.print("\n");

		//deleteFromArray
		//deletes element from array structure
		//checks if structure is empty
		//if empty, causes an exception

		System.out.println("\nDeleting from Array... ");

		deleteFromArray(array);

	}
	
	//storeArray
	//stores elements into single dimensional array structure of Strings
	
	public static void storeArray(String[] array, String fileName) throws IOException {

		Scanner fileReader = new Scanner(new File(fileName));
		
		int count = 0;
		
		while (fileReader.hasNext()) {
			
			array[count] = fileReader.next();
		
			count++;
		
		}

	}

	//printArray
	//prints out all elements of array structure
	//checks if structure is empty
	//if empty, prints out message

	public static void printArray(String[] array) {

		int count = 0;
		
		for (int i = 0; i < 12; i++) {
		    
			if (array[i] != null)
		        count++;
		
		}
			
		if (count != 12)
			System.out.print("Array is empty, you cannot print elements out.");
				
		else {
			
			for (int i = 0; i < 12; i++)
				System.out.print(array[i] + " ");	
		
		}
		
		return;

	}

	//addToArray
	//adds element to array structure
	//checks if structure is full
	//if full, causes an exception

	public static void addToArray(String[] array, String element) {
		
		int count = 0;
		
		for (int i = 0; i < size; i++) {
		    
			if (array[i] != null)
		        count++;
		
		}

		if (isArrayFull(array) == true)
			System.out.print("Array is full, you cannot add an element.");
		else
			array[count] = element;
			count++;

	}

	//deleteFromArray
	//deletes element from array structure
	//checks if structure is empty
	//if empty, causes an exception

	public static void deleteFromArray(String[] array) {

		int i = 0;
		int j = 0;
		
		int count = 0;

		String[] array2 = new String[12-1]; 
		
		for (i = 0; i < size; i++) {
		    
			if (array[i] != null)
		        count++;
		
		}
			
		if (isArrayEmpty(array) == true)
			System.out.print("Array is empty, cannot delete from Array");
		else
			count--;

	}

	//searchArray
	//accepts a String
	//searches array structure for element
	//returns boolean (True or False)

	public static boolean searchArray(String[] array, String element) {

		for(int i = 0; i < size; i++) {

			if(array[i].equals(element))
				return true;
				
		}

		return false;

	}

	//instancesFound
	//accepts String
	//returns # of instances found

	public static int instancesFound(String[] array, String element) {

		int instance = 0;

		for (int i = 0; i < 12; i++) {

			if (array[i] == element)
				instance++;
			else
				instance = instance;
	        
		}
		
		return instance;

	}

	//copyMyArray
	//copies array structure into another array structure

	public static void copyMyArray(String[] array, String[] copy_array) {

		for(int i = 0; i < size; i ++)
			copy_array[i] = array[i];
			
	}

	//isArrayFull
	//returns boolean
	//to determine if array is full or not

	public static boolean isArrayFull(String[] array) {

		int count = 0;
		
		for (int i = 0; i < size; i++) {
			
			if (array[i] != null) {
				count++;
			}
		}
		
		if (count == size) {
			return true;
		}
			
		else {
			return false;			
		}

	}

	//isArrayEmpty
	//returns boolean
	//to determine if array is empty or not

	public static boolean isArrayEmpty(String[] array) {

		int count = 0;
		
		for (int i = 0; i < size; i++) {
			
			if (array[i] == null) {
				count++;
			}
		
		}
		
		if (count != size) {
			return false;
		}
		else {
			return true;
		}

	}

	//arraySize
	//returns array size (how many elements in array structure)

	public static void arraySize(String[] array) {

		System.out.println(12);
		return;

	}

	//createSentence
	//returns sentencefrom words currently stored in array structure

	public static void createSentence(String[] array) {

		System.out.print("Hello everyone. It seems we have in our presence today: ");
		
		for (int i = 0; i < 12; i++) {
			
			System.out.print(array[i] + " ");
			
		}
		
		return;
			
	}

}
