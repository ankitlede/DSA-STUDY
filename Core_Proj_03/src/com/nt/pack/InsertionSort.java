package com.nt.pack;

public class InsertionSort {

	public static void sort(int arr[]) {

		int n = arr.length;

		for (int i = 1; i < n; ++i) {

			int key = arr[i];
			int j = i - 1;

			//int k = i ;
			
		//	System.out.print( k + "   " );
			
			// move element of array , that are greater than key to one position ahead of
			// their current position

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}

			arr[j + 1] = key;

		}
	}

	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + "  ");

		}

		System.out.println();

	}

	public static void main(String[] args) {

		int arr[] = { 33, 44, 11, 55, 66, 99 };
		System.out.println("Before sorting :: ");
		print(arr);
		sort(arr);
		System.out.println("After Sorting :: ");
		print(arr);

	}

}
