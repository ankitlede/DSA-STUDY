package com.nt.arr;

public class BinarySearch {

	// Return index of x if it is present in array

	public static int binarySearch(int arr[], int x) {
		int l = 0, h = arr.length - 1;

		while (l <= h) {

			// formula for binary search
			int m = l + (h - 1) / 2;

			// Check if x is present at the middle
			if (arr[m] == x)
				return m;

			// if x is greater , ignore left half
			if (arr[m] < x)
				l = m + 1;

			// if x is smaller , ignore right half

			if (arr[m] > x)
				h = m - 1;

		}
		// if we reach here then element not present in array.
		return -1;
	}
	
	
	
	// return index of x if it is present in arr[l......r] , else return -1
	public static int recursiveBinarySearch(int arr[], int l , int r, int x ) {
		
		if(r>=l) {
			
			int mid = l+(r-l)/2;
			
			// if the element  is present at middle itself
				if(arr[mid]==x) 
					return mid;
	
        	// if element is smaller than mid ,then it can only present half of left subarray			
			 if(arr[mid] < x) 
				 return recursiveBinarySearch(arr,  l , mid-1 , x);
	
			 
			 // else the array can only present half of right array		 
			return recursiveBinarySearch(arr, l , mid+1 , x);	 
				
			 }
	
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int [] {2,3,4,10,40,44,45,54,64,33,75,23};
        int  n = arr.length;
        int x = 23;
        
        int result = recursiveBinarySearch(arr, 0 , n-1 , x);
        
        if (result == -1)
        	System.out.println("Element not present in Array  :: ");
        else 
        	System.out.println("Element Present at index position :: "+ result);
        
        
        
        
        
        
        
        
        
        
       
	}
	
}
