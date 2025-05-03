package com.nt.pack;

public class BubbleSorting {

	public static void sortByBubble(int arr[], int n) {

		int i, j, temp;
		boolean swapped;

		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;

				}

			}

			// if no element were swapped by inner loop then break

			if (swapped == false) {
				break;
			}
		}

	}
	
	
	public  static void printArray(int arr[]) {
		
		for (int i=0; i<arr.length-1; i++)
		{
			System.out.print(arr[i]+"  ");	
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
	        int n = arr.length;
	        sortByBubble(arr, n);
	        System.out.println("Sorted array: ");
	        printArray(arr);

	}

}
