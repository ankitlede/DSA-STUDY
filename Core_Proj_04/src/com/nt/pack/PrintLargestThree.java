package com.nt.pack;

public class PrintLargestThree {

	// Function to print three largest element of array
	public static void printLargest(int arr[], int n) {

		int i, first, second, third;

		// There should be atleast three element

		if (n < 3) {
			System.out.println("Invalid Input");
			return;
		}

		third = first = second = Integer.MIN_VALUE;

		for (i = 0; i < n; i++) {

			// If Current element is greater than first

			if (arr[i] > first) {
				second = third;
				third = first;
				first = arr[i];
			} else if (arr[i] > second) {
				// If arr[i] is in between first and second then update second
				third = second;
				second = arr[i];
			} else if (arr[i] > third) {
				third = arr[i];
			}

		} // for ends

		System.out
				.println("Three largest element are : :         " + first + "          " + second + "        " + third);

	}

	public static void main(String[] args) {

		int arr[] = { 11, 55, 88, 66, 44, 22, 33, 55 };
		int n = arr.length;
		printLargest(arr, n);
	
	}

}
