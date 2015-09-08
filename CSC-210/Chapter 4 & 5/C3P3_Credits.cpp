/* 

FVCproductions
1-29-15

In-Class 03 - Part 3

Develop a C++ program that will determine whether a department-store customer has exceeded the credit limit ona charge account. 

For each customer, the following facts are available:
	
	(a) Account number (an integer)
	(b) Balance at the beginning of the month
	(c) Total of all items charged by this
	customer this month
	(d) Total of all credits applied to this
	customer's account this month
	(e) Allowed credit limit
	
The program should use a while statement to input each of these facts,
	- calculate the new balance(= beginning balance + charges – credits) and
	- determine whether the new balance exceeds the customer’s credit limit.

For those customers whose credit limit is exceeded, the program should display the customer's account number, credit limit, new balance and the message “Credit Limit Exceeded.”
	
*/

#include <iostream>
#include <string>
#include <cmath>

using namespace std;

double calcBalance(double startBalance, double charges, double credits);

int main ()
{
	int accountNumber = 0;
	double startBalance;
	double charges;
	double credits;
	double creditLimit;
	
	do
	{
		cout << "Enter Account Number (or -1 to quit): ";
		cin >> accountNumber;
		
		if (accountNumber == -1)
		{
			break;
		}
		
		cout << "Enter beginning balance: ";
		cin >> startBalance;
		
		cout << "Enter total charges: ";
		cin >> charges;
		
		cout << "Enter total credits: ";
		cin >> credits;
		
		cout << "Enter credit limit: ";
		cin >> creditLimit;
		
		double newBalance = calcBalance(startBalance, charges, credits);
		
		cout << "New balance is $" << newBalance << endl;
		
		if (newBalance >= creditLimit)
		{
			cout << "Account: \t" << accountNumber << endl;
			cout << "Credit limit: \t" << creditLimit << endl;
			cout << "Balance: \t" << newBalance	<< endl;
			cout << "Credit Limit Exceeded." << endl;
		}
		
		cout << "\n";

	} while (accountNumber != -1);
	
	return 0;	
} 
		
double calcBalance(double startBalance, double charges, double credits)
{
	return (startBalance + charges) - credits;
}
		