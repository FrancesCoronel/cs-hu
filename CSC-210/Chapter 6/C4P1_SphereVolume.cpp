/*
CSC 210
In-Class 04
Chapter 6
FVCproductions

Write a complete program that prompts the user for the radius of a sphere, and calculates and prints the volume of that sphere. 

Use an inline function sphereVolumn that returns the result of the following expression: (4.0 / 3.0 * 3.14159 * pow(radius, 3)). []

*/


#include <iostream>
#include <string>
#include <cmath>

using namespace std;

inline double sphereVolume(double r) {
	return (4.0/3.0 * 3.14159 * pow(r, 3));
}

int main() {
	
	double radius;
	
	cout << "Enter radius: ";
	cin >> radius;
	
	cout << "The volume of the sphere with a radius of " << radius << " is " << sphereVolume(radius);
	
}