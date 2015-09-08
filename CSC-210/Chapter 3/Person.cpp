/** 
 * Person.cpp
 * Person class
 * FVCproductions
 * CSC210
 * In-Class Assignment 2
 * 1-20-15
 */

#include <iostream>

using namespace std;

class Person {

	/* Using this class UML, write a C++ class and driver.
		Person
		- firstName: string
		- lastName: string
		- dayBD: int
		- monthBD: int
		- yearBD: int
		+ Person (fName: string, lName: string, d:int,
		m:int, y:int)
		+ getAge ( ): int
		+ toString ( ) : string 
	*/

	private:
		String firstName, lastName;
		int dayBD, monthBD, yearBD;
	public:
		Person (String fName, String lName, int d, int m, int y) {
			firstName = fName;
			lastName = lName;
			dayBD = d;
			monthBD = m;
			yearBD = y;
		}
		// will calculate age based on the yearBD
		int getAge() {
			int age = 2015 - yearBD;
			if (1 < month || (1 == month && 20 < day)) {
				return (age - 1);
			}
			return (2015 - yearBD);
		}
		// will return a concatenation string of all attributes
		// including age, which is calculated in getAge method
		String toString() {
			return (firstName + " " + lastName + " is " + getAge());
		}

}