//----------------------------------------------------------------------
// Date.h         by FVCproductions                 Chapter 1
//
// Supports date objects having year, month, and day attributes.
//----------------------------------------------------------------------

// class for Date
#include <iostream>
#include <string>
#include <cmath>
#include <sstream>
using namespace std;

class Date
{
	private:
		int year;
		int month;
		int day;
	public: 
		static const int MINYEAR = 1583;

	// constructor
	Date(int newMonth, int newDay, int newYear) 
	{
		month = newMonth;
		day = newDay;
		year = newYear;
	}
	// observers
	int getYear() 
	{ 
		return year; 
	}
	int getMonth() 
	{ 
		return month; 
	}
	int getDay() 
	{ 
		return day; 
	}
	// Returns this date as a String.
	string toString() 
	{
		stringstream theString;
		theString << month << "/" << day << "/" << year;
		return(theString.str());
	}

	int lilian() 
	{
		// Returns the Lilian Day Number of this date.
	    // Precondition: This Date is a valid date after 10/14/1582.
	    //
	    // Computes the number of days between 1/1/0 and this date as if no calendar
	    // reforms took place, then subtracts 578,100 so that October 15, 1582 is day 1. 
	    
	    const int subDays = 578100;  // number of calculated days from 1/1/0 to 10/14/1582

	    int numDays = 0;

	    // Add days in years.
	    numDays = year * 365;

	    // Add days in the months.
	    if (month <= 2) 
	      numDays = numDays + (month - 1) * 31;
	    else 
	      numDays = numDays + ((month - 1) * 31) - ((4 * (month-1) + 27) / 10);

	    // Add days in the days.
	    numDays = numDays + day;

	    // Take care of leap years.
	    numDays = numDays + (year / 4) - (year / 100) + (year / 400);

	    // Handle special case of leap year but not yet leap day.
	    if (month < 3) 
	    {
	        if ((year % 4) == 0) numDays = numDays - 1;
	        if ((year % 100) == 0) numDays = numDays + 1;
	        if ((year % 400) == 0) numDays = numDays - 1;
	    }

	    // Subtract extra days up to 10/14/1582.
	    numDays = numDays - subDays;
	    return numDays;
	}
		
};