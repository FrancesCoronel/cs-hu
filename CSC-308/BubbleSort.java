/**
	FVCproductions
	January 13th, 2016
	BubbleSort Program in Java
**/

class BubbleSort {
	public static void main(String[] args) {
		// array of integers
		int[] array = { 34, 56, 4, 10, 77, 51, 93, 30, 5, 52 };
		// print unsorted array
		System.out.println("Unsorted Array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		//bubble sort
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		// print sorted array
		System.out.println("\n\nSorted Array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}