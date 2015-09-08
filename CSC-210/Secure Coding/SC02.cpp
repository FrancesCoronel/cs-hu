#include <iostream>

using namespace std;
int main(int argc, char *argv[]) {
	
	// Rule 04 - Integers -> no initialization
	// Rule 02 - Declarations and Initialization -> variable message that holds Strings never deleted 
	
	int score;
	
	// WAS NOT DEFINED
	string message;
	
	// Rule 04 - Integers -> does not validate input
	cout <<  "Please enter score between 0 and 100: ";
	cin >> score;
	
	printf("Result: ");
	
	if  (score >= 80)
		message = "Excellent";
	else if (score >= 65)
		message = "Good";
	else
		message = "Needs Improvement";
		
	cout << message << "\t\t";
	
	if (score == 0)
	{
		cout << "Score = 0";
	}
	
	// Rule 04 - Integers -> no initialization
	
	else {
		
		int  i  = score % 10;
			
		// INT33-C. Ensure that division and remainder operations do not result in divide-by-zero errors
		
		for ( ;  i > 0; i --)
			cout << "*";

		 cout << endl;
		
	}

	
}