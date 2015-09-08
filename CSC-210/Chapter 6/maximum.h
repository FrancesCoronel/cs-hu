//----------------------------------------------------------------------
// maximum.h         by FVCproductions                 In-Class 04
//
// Supports C4P4_template.cpp
// Serves as template for maximum function
//----------------------------------------------------------------------

// Fig 6.26 maximum.h
// Definition of function template maximum.

template < class T > 

T maximum( T val1, T val2, T val3 )
{
	T maxValue = val1;
	
	if ( val2 > maxValue)
	{
		maxValue = val2;
	}
	
	if ( val3 > maxValue)
	{
		maxValue = val3;
	}
	
	return maxValue;
}