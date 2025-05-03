package com.nt.pack;

import java.util.*;

public class PrintSecondLargest {

	// function to find second largest element using Descending approach.

	public static void printSecondLargest(int arr[], int n) {

		// Sort the array in descending order

		// Sort the array in descending order
		// Arrays.sort(arr , arr.length-1, 0);
		Arrays.parallelSort(arr, n - 1, 0);

		// Reverse the array to sort it in descending order

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + "   ");

		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

		System.out.println();

		for (int i = 1; i < n; i++) {

			if (arr[i] != arr[0]) {
				System.out.println("The second largest element is " + arr[i]);
				return;
			}
		}

		System.out.println("There is no second largest element .");
	}

	// Function for Find Second Largest element by traversing the array twice .

	static void print2largest(int arr[], int arr_size) {
		int i, second;

		// There should be atleast two elements
		if (arr_size < 2) {
			System.out.printf(" Invalid Input ");
			return;
		}

		int largest = second = Integer.MIN_VALUE;

		// Find the largest element
		for (i = 0; i < arr_size; i++) {
			largest = Math.max(largest, arr[i]);
		}

		// Find the second largest element
		for (i = 0; i < arr_size; i++) {
			if (arr[i] != largest)
				second = Math.max(second, arr[i]);
		}
		if (second == Integer.MIN_VALUE)
			System.out.printf("There is no second " + "largest element\n");
		else
			System.out.printf("The second largest " + "element is  \n", second);
	}

	// Function for Find Second Largest element by traversing the array twice .

	public static void print2ndlargest(int arr[], int arr_size) {
		int i, first, second;

		/* There should be atleast two elements */
		if (arr_size < 2) {
			System.out.print(" Invalid Input ");
			return;
		}

		first = second = Integer.MIN_VALUE;
		for (i = 0; i < arr_size; i++) {
			/*
			 * If current element is greater than first then update both first and second
			 */
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}

			/*
			 * If arr[i] is in between first and second then update second
			 */
			else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}

		if (second == Integer.MIN_VALUE)
			System.out.print("There is no second largest" + " element\n");
		else
			System.out.print("The second largest element" + " is " + second);
	}

	public static void main(String[] args) {

		int arr[] = { 11, 22, 33, 54, 44, 75, 24 };
		int n = arr.length;
		// printSecondLargest(arr, n);
		// print2largest(arr, n);
		print2ndlargest(arr, n);

	}
}
