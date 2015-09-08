/*

FVCproductions
1-29-15

In-Class 03 - Part 2

Ask the user to enter a positive number (N) between 1 and 10, if not, then ask them again.

If the value is in range, then print the N rows of stars, starting from 1 star in the first row, and then up to N stars in row Nth, then back down to 1.

If a user enter 3, then your output should look like this

* 
** 
*** 
** 
*

*/

#include <iostream>

using namespace std;

int main() {
	
	int N;
	
	cout << "Enter a positive integer (N) that is between 1 and 10: ";
	cin >> N;
	
	cout << "\n";
	
	for (int i = 1; i <= N; i++)
	{
		for (int j = 1; j <= i; j++)
		{
			cout << "*";
		}
		cout << "\n";
	}
	
	for (int i = N; i >= 1; i--)
	{
		for (int j = i; j > 1; j--)
		{
			cout << "*";
		}
		cout << "\n";
	}
	
}