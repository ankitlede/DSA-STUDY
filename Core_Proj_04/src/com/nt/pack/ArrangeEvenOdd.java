package com.nt.pack;

import java.util.Arrays;

public class ArrangeEvenOdd {

	// function to rearrange the elements in array such that even positioned
	// are greater than odd positioned elements
	static void assign(int arr[], int N) {
		// Sort the array
		Arrays.sort(arr);

		int ans[] = new int[N];
		int ptr1 = 0, ptr2 = N - 1;
		for (int i = 0; i < N; i++) {

			// Assign even indexes with maximum elements
			if (i % 2 == 0)
				ans[i] = arr[ptr2--];

			// Assign odd indexes with remaining elements
			else
				ans[i] = arr[ptr1++];
		}

		// Print result
		for (int i = 0; i < N; i++)
			System.out.print(ans[i] + " ");
	}

	public static void rearrenge(int arr[], int n) {

		for (int i = 0; i < n; i += 2) {
			// compare it with previous element
			if (i > 0 && arr[i - 1] > arr[i]) {
				int temp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = temp;
			}

			// compare it with next element

			if (i < n - 1 && arr[i + 1] > arr[i]) {
				int temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void print(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "    ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 2,1,1,2 };
		int n = arr.length;
		rearrenge(arr, n);
		print(arr);
		
	}

}
