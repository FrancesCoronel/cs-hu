// Create a variation of this program (LASTNAME_IC6_P1.cpp)
// so that it will accept 3 parameters: char *, const char *, and const char *
// FVCproductions
// February 13, 2015


#include <iostream>

using std::cout;
using std::cin;
using std::endl;

void mystery1( char *, const char *, const char *);  // prototype

int main()
{
	char string1[ 80 ];
	char string2[ 80 ];
	char string3[ 80 ];

	cout << "Enter three strings: ";
	cin >> string1 >> string2 >> string3;
	mystery1( string1, string2, string3);
	cout << string1 << endl;

	return 0;  // indicates successful termination

} // end main

// What does this function do?
void mystery1( char *s1, const char *s2, const char *s3)
{
	while ( *s1 != '\0' )
		++s1;

	for ( ; (*s1 = *s2); s1++, s2++ )
		;   // empty statement
	for ( ; (*s1 = *s3); s1++, s3++)
		;
}

