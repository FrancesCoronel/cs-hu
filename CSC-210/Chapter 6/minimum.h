//----------------------------------------------------------------------
// minimum.h         by FVCproductions                 In-Class 04
//
// Supports C4P4_template.cpp
// Serves as template for minimum function
//----------------------------------------------------------------------

// minimum.h
// Definition of function template minimum.

template < class T > 

T minimum( T val1, T val2, T val3 )
{
	T minValue = val1;
	
	if ( val2 < minValue)
	{
		minValue = val2;
	}
	
	if ( val3 < minValue)
	{
		minValue = val3;
	}
	
	return minValue;
}