package com.pack.Intermediate;

import java.util.Arrays;
import java.util.Comparator;

public class OrderedArryByIndeces {

	// comparator function to sort pair base element

	public static class PairComparator implements Comparator<int[]> {

		@Override
		public int compare(int[] pair1, int[] pair2) {
			return Integer.compare(pair1[1], pair2[1]);
		}
	}

	// Function to reorder element for array

	public static void reorder(int arr[], int index[]) {

		int n = arr.length;

		// Create a 2D array to store pairs (original
		// element, index)

		int pairs[][] = new int[n][2];

		for (int i = 0; i < n; i++) {
			pairs[i][0] = arr[i];
			pairs[i][1] = index[i];

		}

		// Sort the pair array based on the index

		Arrays.sort(pairs, new PairComparator());

		// copy the reorder array into original array

		for (int i = 0; i < n; i++) {

			arr[i] = pairs[i][0];
		}

	}
	
	public static void printArray(int arr[]) {
		
	   for(int i =0 ; i<  arr.length ; i++) {
		   System.out.print(arr[i]  +  "  ");
	   }
		System.out.println();
		
	}
	
	// Function for Reorder array using auxiliary array 
	public static void reorderedarry(int arr[] , int index[]) {
		
		int n = arr.length ; 
		// create temp array to store element their correct position 
		
		int temp[] = new int[n];
	       for( int  i =0; i <  n ; i++ ) {
	    	   temp[index[i]] = arr[i];
	       }

	       for (int i=0; i<arr.length; i++)
	        { 
	           arr[i]   = temp[i];
	           index[i] = i;
	        }

	       printArray(arr);
	       
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 50, 40, 70, 60, 90 };
        int[] index = { 3, 0, 4, 1, 2 };
        
     // Call the reorder function to rearrange elements
        // in arr[] based on index[]
       // reorder(arr, index);
        
        printArray( arr);
        
        reorderedarry(arr, index);
       // printArray( arr);
	}
}
