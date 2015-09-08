/*

FVCproductions
1-29-15

In-Class 03 - Part 1

Ask user to enter positive integer, n and then print output of square value of each value from 1 up to n. One per row.

*/ 

#include <iostream>

using namespace std;

int main() {
	
	int n;
	
	cout << "Enter a positive integer, n: ";
	cin >> n;
	
	cout << "\nNumber \t\t Square \n";
	
	for (int i = 1; i <= n; i++) 
	{
		
		cout << i << "\t\t\t\t" << i*i << "\n";
	}

}