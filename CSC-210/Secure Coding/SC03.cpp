#include <iostream>
#include <cmath>
#include <string>
#include <stdexcept>

using namespace std;

int main(int argc, char *argv[]) {
	
	int scores[4] = {85, 90, 94, 75};
	int total = 0;
	
	for (int j = 0; j <= 3; j++) { // Rule 06. Do not form or use out-of-bounds pointers or array subscripts
	
		total += scores[j];
		
	}
		
	int score = total / 4; // get average // Rule 05: possible loss of precision
	
	string message = "";
	
	if (score >= 80)
		message = "Excellent";
	else if (score >= 65)
		message = "Good";
	else
		message = "Need Improvement";
		
	cout << message << "\t\t";
	
	float  i  = (float) score / 100; // Rule 05. Preserve precision when converting integral values to floating-point type

	cout << score;
	
	for (i = (float) score / 100;  i > 0.0f; i -= 0.1f) {// Rule 05. Do not use floating-point variables as loop counters and Rule 05. Prevent or detect domain and range errors in math functions
	
		cout << "*";
	
	}
	
	cout << endl;

}