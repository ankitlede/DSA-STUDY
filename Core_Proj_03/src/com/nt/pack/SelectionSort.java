package com.nt.pack;

public class SelectionSort {

	// one by one move the boundary of unsorted array

	public static void sort(int arr[]) {

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			// Find the minimum element from unsorted array

			int mid_idx = i;

			for (int j = i + 1; j < n; j++) {

				if (arr[j] < arr[mid_idx])
					mid_idx = j;

				// Swapped the found minimum element with first element

				int temp = arr[mid_idx];
				arr[mid_idx] = arr[i];
				arr[i] = temp;

			}
		}

	}
	
	 public static void println(int arr[]) {
		 
		 for(int i=0; i<arr.length;  i++ ) {
			 
			 System.out.print(arr[i]+"  ");
			 }
		 
		 System.out.println();
	 }


	public static void main(String[] args) {

		
		int arr[] = {55,66,88,44,22,77,11};
		
		System.out.println("Befor Sort ::  ");
		println(arr);
		sort(arr);
		System.out.println("After Sort");
		println(arr);
		
		
	}

}
