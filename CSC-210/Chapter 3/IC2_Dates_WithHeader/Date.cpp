/*
CSC 210
In-Class 04
Chapter 6

You are to implement function template for maximum and minimum.

-- for maximum.h -- you can use Fig. 6.26
-- for minimum.h -- it will be similar to Fig. 6.26, but different algorithm. make sure that the variables are meaning full
-- driver (Save file as LASTNAME_C4P4_template.cpp) -- main method -- you can use Fig. 6.27 and after each input set (int, double, and char), you will print both maximum and minimum.
-- submit all 3 files -- maximum.h, minimum.h, and LASTNAME_C4P4_template.cpp

*/

#include <iostream>

#include "maximum.h"
#include "minimum.h"

using namespace std;

Date::Date(int newMonth, int newDay, int newYear) 
{
	month = newMonth;
	day = newDay;
	year = newYear;
}

int Date::getYear() 
{
	return year;
}

int Date::getDay() 
{
	return day;
}

string Date::toString() 
{
  stringstream theString;
  theString << month << "/" << day << "/" << year;
  return(theString.str());
}

int Date::lilian() 
{
	
	// Returns the Lilian Day Number of this date.
    // Precondition: This Date is a valid date after 10/14/1582.
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
