#include <iostream>
#include <string>
#include <regex>

using namespace std;

int main(int argc, char *argv[]) {
	
	// This code segment is to read the email address from the user and
	// then validate if this is a valid email address
	// … that is only alphabets and numbers; no special characters, except @ _ - .

	char email1[80], email2[80];
	string s1(email1);
	string s2(email2);
	regex r("^[a-zA-z0-9._-]*+[@]+[a-zA-Z0-9._-]*+[.]+[a-zA-Z0-9._-]*");
	
	cout << "Please enter email address: " ;
	cin >> email1;

	// 3.a) validate email address #1 to make sure that it contains legal characters
	// if not, print-out “Illegal email address, please re-enter”
	
	bool match = regex_match(s1, r);
		
	if (match == 0) {
		cout << "Legal characters!" << endl;
	} else {
		cout << "Please re-enter.";
		return 0;
	}

	// 3.a) validate email address #2 to make sure that it contains legal characters
	// if not, print-out “Illegal email address, please re-enter”
		
	bool confirm = regex_match(s2, r);
	
	cout << "Please re-confirm email address: ";
	cin >> email2;	
	
	if (confirm == 0) {
		
		cout << "Legal characters!" << endl;;
		
	} else {
		
		cout << "Illegal email address, please re-enter." << endl;
		return 0;

	}
	
	// 3.b) compare two emails, if they are the same then print-out “EMAIL CONFIRMED”
	// otherwise, print-out “EMAIL NOT CONFIRMED”
	
	string strEmail1(email1);
	string strEmail2(email2);
	
	if (strEmail1 == strEmail2) {
		
		cout << "EMAIL CONFIRMED";
		
	} else {
		
		cout << "EMAIL NOT CONFIRMED";
		
	}

	
}