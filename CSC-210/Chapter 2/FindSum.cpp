/**
 * CSC210
 * In-Class Assignment 1
 * 1-20-15
 * FindSum.cpp
 * FVCproductions
 * \brief Write a C++ program that calculates a sum of and product of five integers reading from a keyboard.
 */

// a. allow program to perform input and output
#include <iostream>

// b. all program to use names from the std namespace
using namespace std;

// c. main method
int main() {
	
	// d. declare 5 integer input variables and 2 output/result variables
	int number1, number2, number3, number4, number5, output, result;
	
	// e. prompt user for data
	// f. read five integers from user
	// g. calculate the sum of and product of five integers
	// h. print result, including end line
	cout << "Please enter #1: ";
	cin >> number1;

	cout << "Please enter #2: ";
	cin >> number2;

	cout << "Please enter #3: ";
	cin >> number3;
	
	cout << "Please enter #4: ";
	cin >> number4;
	
	cout << "Please enter #5: ";
	cin >> number5;

	cout << "\nSum is " << (number1 + number2 + number3 + number4 + number5) << "\nAverage is " << (number1 + number2 + number3 + number4 + number5) / 5 << "\nProduct is " << (number1 * number2 * number3 * number4 * number5) << endl;

}