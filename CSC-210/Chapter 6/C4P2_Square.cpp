/*

FVCproductions
1-29-15

In-Class 04 - Part 2

Write a function that displays at the left margin of the screen a solid square of asterisks whose side is specified in integer parameter side.

For example, if a user enters side is 4, the function displays the following: 

****
****
****
****

*/

#include <iostream>

using namespace std;

int main() {
	
	int N;
	
	cout << "Enter a positive integer: ";
	cin >> N;
	
	cout << "\n";
	
	for (int i = 1; i <= N; i++)
	{
		for (int j = 1; j <= N; j++)
		{
			cout << "*";
		}
		cout << "\n";
	}
	
}

/* -SAMPLE OUTPUT-

Enter a positive integer: 4

****
****
****
****

*/