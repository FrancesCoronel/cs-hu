/*

FVCproductions
1-29-15

In-Class 04 - Part 2

Write a function that takes an integer value and returns the number with its digits reversed.

For example, given the number 7631, the function should return 1367.

*/

#include <iostream>

using namespace std;

void convert(int N);

int main() {
	
	int N;
	
	cout << "Enter a number: ";
	cin >> N;
	
	cout << "\n";

	cout << N << " reversed is ";
	convert(N);
	
}

void convert(int N)
{
	//int convertedN = 0;
	if (N < 10)
	{
		cout << N;
	}
	else
	{
		cout << N % 10;
		convert(N/10);
	}
}
//	while (N > 0)
//	{
//		convertedN = convertedN * 10 + (N % 10);
//		N = N/10;
//	}
//	return convertedN;


/* -SAMPLE OUTPUT-

Enter a positive integer: 4

****
****
****
****

*/