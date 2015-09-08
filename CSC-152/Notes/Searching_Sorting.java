/***************************************************

fvcproductions

july 2012
 
in class notes on 
searching and sorting algorithms and pseudocode

****************************************************/

/* --- UN-SORTED LISTS --- */

1. Linear Search
//a - c (unsorted lists)

//--- PSEUDOCODE --

count = 10;

start from index 0;

compare targetNumber and number at index

	if same
		found

	else
		index++		

*/

// --- JAVA CODE ---

int count = 0, index = 0;

//myNumber -> array name
//targetNumber -> number you are "searching" for


for (; index < count; index ++ ) {
	if ( targetNumber == myNumber[index] ) 
		break;
}

if (index == count)
	System.out.println("NOT FOUND");
else
	System.out.println("FOUND");

	
/*-------------------------------------
-------------------------------------*/


/* --- SORTED LISTS --- */

2. Linear Search
//a - c (sorted lists)

//--- PSEUDOCODE --

difference here is:
	
	when to stop:
	
		1. either found
		2. end of list
		3. # at index greater than target <<<<<


// --- JAVA CODE ---

int count = 0, index = 0;

//myNumber -> array name
//targetNumber -> number you are "searching" for

for ( ; index < count; index ++ ) {
	if (targetNumber <= myNumber[index]) 
		break;
}

if ( index == count || targetNumber != myNumber[index] )
	System.out.println("NOT FOUND");
else
	System.out.println("FOUND");
	
		
/*-------------------------------------
-------------------------------------*/


/* --- FOR SORTED LISTS ONLY --- */

//2. Binary Search 📝


//--- PSEUDOCODE -- PROBLEM 1 ---> O (log₂N) 😞

compare targetNumber and number at index
if same, FOUND
	if not, check if targetNumber is greatr then continue to RIGHT
else
	continue to LEFT


// --- JAVA CODE --- PROBLEM 1  😃

int startIndex = 0, endIndex = myNumbers.length -1;

//loop needed after this line ❗️

do { 
	
	int midIndex = (startIndex + endIndex) / 2; //1st midIndex is 4, 2nd midIndex is 7, 3rd midIndex is 5

	if (targetNumber == myNumbers[midIndex]) //compare targetNumber and number at index
		break; //if found, break
		
	else if (targetNumber > myNumbers[midIndex]) { //else if check if targetNumber greater, 
		startIndex = midIndex + 1; //continue to RIGHT
			       
	else //else
		endIndex = midIndex - 1; //continue to LEFT
	
} while (startIndex <= endIndex); //need to exit loop when startIndex crosses over endIndex

if (myNumbers[midIndex] == targetNumber) //or you can use : if (startIndex <= endIndex)
	System.out.println("FOUND");
else 
	System.out.println("NOT FOUND");