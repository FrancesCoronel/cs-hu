/***************************************************

	fvcproductions

	july 2012
	 
	class notes on lists

****************************************************/

//--- Pseudocode --- ADDING PERSON---

ArrayList<String> myList = new ArrayList<String>();

Have a count that tells size of limit

start at index 0

if targetName is before current index’s anme
	move rest of names one index to right
	and then add targetName at current Index =-> myList.add(index,targetName);

else	
	index++

repeat if-else statement until spot found or end of list

//

myList [] String = new String[7]; //myList[0] = “XXXX” —> cnt = 3
int cnt = 0;

String targetName = “John”;

//

start at index 0

if target name is before current index’s name,
	move rest of names one index to right
	& then add targetName at currentIndex
else
	index++

repeat if-else statement until spot found/end of list

starting from back (i.e. last element) -> cnt-1
loop from int i = cnt down to index
	myList[i] = myList[i-1];


start at index 0
compare john and anna
	john not before anna, index++
compare john and ben
	john not before ben, index++
compare john and paul
	john before paul
	move paul to index 3
	add john at index 2

//

if targetName.compareTo(myList[index]) <= 0
	…
else

if myList[index].compareTo(targetName) > 0
	…
else

//--- Pseudocode --- ADDING PERSON---


/* --- REMOVING PERSON FROM ARRAY BASED LIST ---  JAVA CODE */

int index = 0;

//loop??

do {

	if (targetName.equals(myList[index])) //if same
	
		//found
	
	else
	
		index++;
		
} while (!targetName.equals(myList[index]) && index < count);
	
//for loop

for ( ; index < count; index ++ ) {
	
	if (targetName.equals(myList[index])) //if same
	
		break;
	
	else
	
		index++;
}

//another if-else statement

if (index == count) //end of list
	System.out.println("target not found in list");

else {
	
	//remove
	
	for (  ; index < count; index ++)
		myList[index] = myList[index + 1];
		
	myList[index] = null; //clear last element
	count--;
	
}
		
/* ARRAY BASED LISTS --- REMOVING --- PSEUDOCODE

search for location (index) where your target name is to be removed
if found, remove

*/

/*ARRAY BASED LISTS --- REMOVING --- JAVA CODE*/

ArrayList <String> myList = new ArrayList <String>();
myList.add("Anna"); 
myList.add("Ben");
myList.add("Paul");

//I want to remove Ben

for ( ; index < count; index ++ ) {
	
	if (targetName.equals(myList.get(index))) //if same
	
		break;
	
	else
	
		index++;
}

if (index == myList.size()) //end of list
	System.out.println("target not found in list");
else
	myList.remove(index); //removing
