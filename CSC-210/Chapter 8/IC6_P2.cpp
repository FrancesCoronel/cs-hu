// Ex. 8.14: ex08_14.cpp
// What does this program do?
#include <iostream>
using namespace std;

int concat( const char * ); // prototype
int checkString( const char *);

int main()
{
   char string1[ 80 ];

   cout << "Enter a string: ";
   cin >> string1;
   cout << "First space located at " << concat( string1 ) << endl;
   cout << "Size of string 1: " << checkString( string1 ) << endl;
   
} // end main

// What does this function do?
/*
String concatentation of sorts - it tells you where the first space in the string is located based off index, ergo typing in "hey there" would result in 3 printing out because at index 3 in the string, the first space is located, assuming we're starting from 0
*/
int concat( const char *s ) 
{
   int x;

   for ( x = 0; *s != '\0'; s++ )
      x++;

   return x;
} // end function mystery2

int checkString (const char *s) {
   return sizeof(s);
}

/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 **************************************************************************/
