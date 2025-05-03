package com.pack;

public class RightRotateArray {

	public static void rightRotateArray(int arr[], int n, int k) {

		// n = length of array and k = position
		// if rotation is greater than size of array
		// {1,2,3,4,5,6,7};

		k = k % n;     // pos 2

		for (int i = 0; i < n; i++) { // loop 0 to 7

			if (i < k) {

				System.out.print(arr[n + i - k] + "   "); // [7+0-2] =5

			} else {

				System.out.print(arr[i - k] + "   ");

			}
		}

		System.out.println();

	}
	
	
 public static void rightRotateByReverse(int arr[], int n , int k) {
	    	
                     k = k%n;              
                     int  i , j ;
                     
                     // reverse last k Elements  
                     
                     for(i=n-k , j = n-1 ;  i < j ; i++ , j-- ) {
                    	 
                    	 int temp =  arr[i];
                    	 arr[i]= arr[j];
                    	 arr[j]=temp ; 	 
                    	 
                     }
  
                     // Reverse the first n-k term
                   
                     for(i=0 , j=n-k-1 ; i< j ;  i++, j-- ) {
                    	 int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;

                     }

                     // Reverse Entire array 
                     
                     for (i=0, j=n-1 ;  i< j; i++ , j-- ) {
                    	 int temp = arr[i];
                    	 arr[i]=arr[j];
                    	 arr[j]=temp;    	 
                     }
          
	       }
	    
	   public static void printArray(int []a) {
		   
		// Print the rotated array
	        for (int t = 0; t < a.length; t++) {
	            System.out.print(a[t] + " ");
	        }
		   System.out.println();
	   }
	
	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int k = 2;
		rightRotateArray(arr, n, k);
		
		int a[] = new int[] {1,3,5,7,9,11};
		
		int l = a.length ;
		int p= 3 ;
		
		System.out.println("array before rotate : ");
		
	    printArray(a);
		
		System.out.println("array after  rotate : ");
		rightRotateByReverse(a, l, p);
		
	    printArray(a);

	}

}
