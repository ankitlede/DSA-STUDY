package com.nt.pack;

public class FindAppearsOnce {


	public static int findingOnce(int arr[]) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {

			// initialize the counter 0
			int counter = 0;

			for (int j = 0; j < n; j++) {

				// find frequency of the element
 
		//	System.out.println(" I  :: "+ arr[ i ] +" J  :: "+ arr[ j ]);
				
				if (arr[i] == arr[j])
					counter++;
			}

			// if the frequency of the element is 1
			if (counter == 1) {
				return arr[i];

			}

		}
		
		return -1;
	}
	
	// Return the maximum sum of difference between consecutive element.
	public static int  appearOnce(int arr[] ) {
		
		int n = arr.length;
		// Do  XOR for all element  and return  	
		
		int res = arr[0];
		
		for(int  i=1; i< n ; i++) 
			res = res ^ arr[i];

		return res;		
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 2,2,3,3,4,5,5};
	    System.out.println("Appearse only onec in Given Array :  ( findingOnce )   : "+ findingOnce(arr));
	    System.out.println("Appearse only onec in Given Array : ( appearOnce  ) : "+ appearOnce(arr));
	    
	}

}
