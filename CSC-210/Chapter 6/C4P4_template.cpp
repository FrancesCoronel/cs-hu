//----------------------------------------------------------------------
// DaysBetween.cpp         by FVCproductions            Chapter 1
//
// Asks the user to enter two "modern" dates and then reports 
// the number of days between the two dates.
//----------------------------------------------------------------------

#include <iostream>
#include "maximum.h"
#include "minimum.h"

using namespace std;

int main() 
{
	
	int int1, int2, int3;
	double double1, double2, double3;
	char char1, char2, char3;
	
	cout << "Enter 3 integer values: " << endl;
	cin >> int1 >> int2 >> int3;
	
	cout << "\nMax integer value is " << maximum(int1, int2, int3) << endl;
	cout << "Min integer value is " << minimum(int1, int2, int3) << endl;
	
	cout << "\nEnter 3 double values: " << endl;
	cin >> double1 >> double2 >> double3;
	
	cout << "\nMax double value is " << maximum(double1, double2, double3) << endl;
	cout << "Min double value is " << minimum(double1, double2, double3) << endl;
	
	cout << "\nEnter 3 char values: " << endl;
	cin >> char1 >> char2 >> char3;
	
	cout << "\nMax char value is " << maximum(char1, char2, char3) << endl;
	cout << "Min char value is " << minimum(char1, char2, char3) << endl;

}

/* -- SAMPLE OUTPUT --

Enter 3 integer values: 
1
2
3

Max integer value is 3
Min integer value is 1

Enter 3 double values: 
1
2
3

Max double value is 3
Min double value is 1

Enter 3 char values: 
q
w
e

Max char value is w
Min char value is e

*/