package com.pack;

public class RotateArry {

	// Function to rotate array
	public static void rotateArray(int arr[], int d, int n) {
		d = d % n;

		int length = arr.length;

		System.err.println("length of Array ::  " + length + "   d%n  :  " + d % n);

		// Storing rotate version of array
		int[] temp = new int[n];

		int k = 0; // Pointer to store element in temp array.

		// Storing n - d Element of array arr[] to Front of temp arr[];

		for (int i = d; i < n; i++) { // 2 to 7th position
			temp[k] = arr[i]; //
			k++;
		}

		// Storing the first d element of array in arr[] into remaining index of temp.

		for (int i = 0; i < d; i++) { // o to 2 position
			temp[k] = arr[i];
			k++;
		}

		// Coping the element of temp[] to arr[] to get final rotated array.

		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
	}

	public static void printArry(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
	}

	public static void printArry(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
	}

	public static void rotateArrayByLoop(int arr[], int d, int n) {

		int p = 1; // this is pointer

		while (p <= d) {
			int last = arr[0];
			for (int i = 0; i < n - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[n - 1] = last;
			p++;
		}

	}

	// Function to rotate array in Recursive manner
	public static void rotateArrayRecursive(int arr[], int n, int k) {

		if (k == 0) {
			return;
		}

		// Rotate the Array Right by one position

		int temp = arr[n - 1];
		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;

		// Recursively rotate the remaining element k-1 t

		rotateArrayRecursive(arr, n, k - 1);

	}

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length, d = 4;

		System.out.println(" Before Rotate :: ");
		printArry(arr, n);
		System.out.println("After Rotate :: ");
		// rotateArray(arr, d, n);
		rotateArrayByLoop(arr, d, n);
		printArry(arr, n);

		int rec[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int rlength = rec.length;
		int k = 2;

		System.out.println(" Before Rotate recursive manner :: ");
		printArry(rec);
		rotateArrayRecursive(rec, rlength, k);
		System.out.println(" Before Rotate recursive manner :: ");
		printArry(rec);

	}

}
