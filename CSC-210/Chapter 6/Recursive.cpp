/*

FVCproductions
1-29-15

In-Class 04 - Recursion - Part 1

Menu will be presented as follow and this will run repeatedly until option ‘G’ or ‘g’ is chosen.
	
	A. Sum of all integers from 1 to N (1 + 2 + 3 + ... + N)
	B. Sum square of all integers from 1 to N (12 + 22 + 32 + 42 + ... + N2)
	C. Sum square-root of all integers from 1 to N (11/2 + 21/2 + 31/2 + 41/2 + ... + N1/2)
	D. Exponential (base N)
	E. Factorial (N!)
	F. Sum power – some of all integers from 1 to N using power K (1K + 2K + 3K + ... + NK)
	G. Exit

If option A, B, C, or E is selected, then you will ask user to enter value of N

If option D is selected, then you will ask user to enter value of base and power N If option F is selected, then you will ask user to enter value of N and power K

*/

#include <iostream>
#include <string>
#include <cmath>


using namespace std;

int sumN9 (int n);
int sumSquareN1 (int n);
double sumSquareRootN2 (double n);
double expoBaseN4 (double n, double base);
int factorialN9 (int n);
double sumPowerN1 (double n, double k);

int main ()
{
	
	char choice;
	int n;
	double power;
	double base;
	
	while(choice != 'G' || choice != 'g')
	{
		cout << "\nChoose one of the following options: " << endl;
		cout << "\tA for sum, \n\tB for sum square, \n\tC for sum square-root, \n\tD for exponential,\n\tE for factorial,\n\tF for sum power,\n\tor G to exit the program." << endl;
		cin >> choice;
		
		if (choice == 'A')
		{
			cout << "Enter the value of n: ";
			cin >> n;
			cout << "The sum of " << n << " is " << sumN9(n) << endl;
		}
		else if (choice == 'B')
		{
			cout << "Enter the value of n: ";
			cin >> n;
			cout << "The sum square of " << n << " is " << sumSquareN1(n) << endl;
		}
		else if (choice == 'C')
		{
			cout << "Enter the value of n: ";
			cin >> n;
			cout << "The sum square-root of " << n << " is " << sumSquareRootN2(n) << endl;
		}
		else if (choice == 'D')
		{
			cout << "Enter the value of n: ";
			cin >> n;
			cout << "Enter the value of the base: ";
			cin >> base;
			cout << base << " raised to " << n << " is " << expoBaseN4(n, base) << endl;
		}
		else if (choice == 'E')
		{
			cout << "Enter the value of n: ";
			cin >> n;
			cout << "The factorial of " << n << " is " << factorialN9(n) << endl;
		}
		else if (choice == 'F')
		{
			cout << "Enter the value of n: ";
			cin >> n;
			cout << "Enter the value of the power: ";
			cin >> power;
			cout << "The sum of 1 to " << n << " using power " << power << " is " << sumPowerN1(n, power) << endl;
		}
		else {
			return 0; //case 'G'
		}
		
	}
	return 0;
} 
	

int sumN9 (int n) 
{
	if (n == 1)
	{
		return 1;
	}
	else 
	{
		return n + sumN9(n-1);
	}
}

int sumSquareN1 (int n)
{
	if (n == 1)
	{
		return 1;
	}
	else 
	{
		return pow(n,2) + sumSquareN1(pow((n-1),2));
	}
}

double sumSquareRootN2 (double n)
{
	if (n == 1)
	{
		return 1;
	}
	else 
	{
		return pow(n,.5) + sumSquareRootN2(pow((n-1),.5));
	}
}

double expoBaseN4 (double n, double base)
{
	if (n == 0)
	{
		return 1;
	}
	else 
	{
		return base * expoBaseN4(n-1, base);
	}
}

int factorialN9 (int n)
{

	if (n == 0)
	{
		return 1;
	}
	else
	{
		return n * factorialN9(n-1);
	}
	
}

double sumPowerN1 (double n, double power)
{
	if (n == 0)
	{
		return 0;
	}
	else
	{
		return (n * pow(n, power-1)) + sumPowerN1(n-1, power);
	}
}