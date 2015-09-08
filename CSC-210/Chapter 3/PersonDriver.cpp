/** 
 * PersonDriver.cpp
 * Person Driver
 * FVCproductions
 * CSC210
 * In-Class Assignment 2
 * 1-20-15
 * 
 */

#include <iostream>

using namespace std;

/**
 * Driver: 
 * 		(1) Read each attribute value from the user;
 * 		(2) instantiate object using input values, and
 * 		(3) print on the screen all values including age of this person using toString method
 */

int main() {

	String firstName, lastName;
	int dayBD, monthBD, yearBD;

	cout << "Enter your first name: ";
	cin >> firstName;

	cout << "Enter your last name: ";
	cin >> lastName;

	cout << "Enter your day of birth: ";
	cin >> dayBD;

	cout << "Enter your month of birth: ";
	cin >> monthBD;

	cout << "Enter your year of birth: ";
	cin >> yearBD;

	Person newbie = new Person(firstName, lastName, dayBD, monthBD, yearBD);

	printf(newbie.toString());
}


