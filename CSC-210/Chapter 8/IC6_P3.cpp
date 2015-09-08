/*

- Read a set of integers that the user enters until they type -1 (keep max at 50)

- Create a function called statisticsValue which pass in 6 parameters: an array, a size, and then 4 variables for sum, average, min, and max which will pass them by reference.

- The values will be calculated in the function and the variables passed by reference will be returned to the main method

- Finally, print all #s in array and all stat values

*/


#include <iostream>

using namespace std;

void statisticsValue(int anArray[], int aSize, int &aSum, int &aAverage, int &amin, int &amax)
{
	
	amax = anArray[0];
	amin = anArray[0];
	aSum = 0;
	
	cout << "Values In Array: ";
	
	for (int i = 0; i < aSize; i++)
	{
		if (amax < anArray[i])
		{
			amax = anArray[i];
		}
		
		else if (amin > anArray[i]) 
		{
			amin = anArray[i];
		}
		
		aSum += anArray[i];
		
		cout << anArray[i] << ", ";
	}
	
	cout << "\nMin = " << amin << endl;
	cout << "Max = " << amax << endl;
	cout << "Sum = " <<  aSum << endl;
	cout << "Average = " << (double)aSum/aSize << endl;
	
}

int main()
{
	
	int theArray [50] = {};
	int count = 0;
	int num = 0;
	int aSum = 0;
	int aAverage = 0;
	int amin = 0;
	int amax = 0;
	
	while (num != -1) {
		cout << "Enter a number: ";
		cin >> num;
		if (num != -1) {
			theArray[count] = num;
			count++;
		}
	}
	
	int SIZE = sizeof(theArray[0]);
	
	cout << endl;
	
	statisticsValue(theArray, SIZE, aSum, aAverage, amin, amax);
	return 0;
}
