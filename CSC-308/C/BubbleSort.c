/**
 * FVCproductions
 * January 22nd, 2016
 * BubbleSort Program in C
 */

#include <stdio.h>

int main(void) {
	// array of integers
	int array[] = { 34, 56, 4, 10, 77, 51, 93, 30, 5, 52 };
	// print unsorted array
	printf("Unsorted Array\n");
	for (int i = 0; i < sizeof(array)/sizeof(array[0]); i++) {
		printf("%d ", array[i]);
	}
	// bubble sort
	for (int i = 0; i < sizeof(array)/sizeof(array[0])-1; i++) {
		for (int j = i+1; j < sizeof(array)/sizeof(array[0]); j++) {
			if (array[i] > array[j]) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
	}
	// print sorted array
	printf("\n\nSorted Array\n");
	for (int i = 0; i < sizeof(array)/sizeof(array[0]); i++) {
		printf("%d ", array[i]);
	}
	// return 0 necessary for C programs
	return 0;
}