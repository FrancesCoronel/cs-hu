//----------------------------------------------------------------------
// Date.h         by FVCproductions                 Chapter 1
//
// Supports date objects having year, month, and day attributes.
//----------------------------------------------------------------------

// class for Date
#include <string>
using namespace std;

// Date class definition
class Date
{
	protected:
		int year;
		int month;
		int day;
	public: 
		static const int MINYEAR = 1583;
		// constructor
		Date(int, int, int);
		int getYear();
		int getDay();
		//returns date as string
		string toString();
		int lilian();
};