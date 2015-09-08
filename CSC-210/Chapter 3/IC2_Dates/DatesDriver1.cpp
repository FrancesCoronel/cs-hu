//----------------------------------------------------------------------
// DaysBetween.cpp         by FVCproductions             Chapter 1
//
// Asks the user to enter two "modern" dates and then reports 
// the number of days between the two dates.
//----------------------------------------------------------------------

#include <iostream>
#include "Date.h"
#include <cmath>

using namespace std;

int main() 
{
	
	int day, month, year;

	cout << "Enter two 'modern' dates: month day year: \n";
	cout << "For example, January 12, 1954, would be: 1 12 1954\n";
	cout << "Modern dates occur after " << Date::MINYEAR << ".\n";

	cout << "\nEnter the first date: \n";
	cin >> month >> day >> year;
	
	Date date1(month, day, year);

	cout << "\nEnter the second date: \n";
	cin >> month >> day >> year;

	Date date2(month, day, year);

	if ((date1.getYear() <= Date::MINYEAR) || (date2.getYear() <= Date::MINYEAR)) 
	{
		cout << "You entered a 'pre-modern date'.";
	}
	else 
	{
		cout << "\nThe number of days between ";
		cout << date1.toString();
		cout << " and ";
		cout << date2.toString();
		cout <<" is ";
		cout << abs(date1.lilian() - date2.lilian());
		cout << ".";
	}
}