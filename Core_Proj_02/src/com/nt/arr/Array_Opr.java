package com.nt.arr;

public class Array_Opr {

	// Function to implement search operation
   // or Fucntion to search key to be deleted 
 public static int findElementWithKey(int arr[], int n, int key) {
		for (int i = 0; i < n; i++) {

			if (arr[i] == key)
				return i;
		}
		// if the key is not found 
		return -1;
	}
	
	
	// Function to insert given key in the array , this function returns n+1 if insertion successful else return n .
	public static int insertSorted(int arr[] , int n , int key , int capacity) {
		
		//  Cannot insert more element if n is already more than or equal to capacity 
		// where, n is the insertion position 
		     if (n >= capacity) {
		    	 return n ;
		     }
		        arr[n]= key;
		        
		return n+1;
	}
	
	
	// Function for insert element at any position 
	public static void insertByPos(int arr[] , int n , int x, int pos) {
		// shift element to the right which are on the right side at the position
		for (int i = n-1 ; i> pos ; i--) {
                      arr[i+1]=arr[i];
               }
		arr[pos]= x;
	}
	
	public static void printArray(int arr[]) {
		for(int i=0; i< arr.length;i++) {
			System.out.print(arr[i]+"   ");		
		}
		System.out.println();
	}
	
	
	public static void printArray(int arr[], int n) {
		for(int i=0; i< n;i++) {
			System.out.print(arr[i]+"   ");		
		}
		System.out.println();
	}
	
	
	public static int deleteByKey(int arr[] , int n , int k) {		
		// find position of element to be deleted.		
		int pos = findElementWithKey(arr, n, k);
		
		if (pos == -1) {
			System.out.println("Element not found ");
			return n;
		}
		
		// deleting element 
		
	    int  i  ;
	    for(i= pos ; i< n-1; i++) {	
	    	arr[i]=arr[i+1];
        }
	    
		return n-1;		
	}
	
	
	
	
	public static void main(String[] args) {
		
		/*
		 * int arr[] = new int [] {10,20,30,40,50,60};
		 * 
		 * int n = arr.length ; int key = 60 ;
		 * 
		 * int position = findElementWithKey(arr, n, key);
		 * 
		 * 
		 * if(position== -1) { System.out.println("Element not found :: "); }else {
		 * 
		 * System.out.println("Element found at the position  :: " + position);
		 * 
		 * }
		 */
		
		/*
		 * int arr[]= new int[20]; arr[0]=10; arr[1]=20; arr[2]=30; arr[3]=40;
		 * arr[4]=50; arr[5]=60;
		 * 
		 * int capacity=20 ; int n =19 ; int key=26 ;
		 * 
		 * System.out.println("Before insertion :: "); printArray(arr);
		 * System.out.println("After insertion  :: "); insertSorted(arr, n, key,
		 * capacity); printArray(arr);
		 */
		  

		/*
		 * int arr[]= new int[6]; arr[0]=10; arr[1]=20; arr[2]=30; arr[3]=40; arr[4]=50;
		 * arr[5]=60;
		 */
	  
		int arr[] = new int [] {10,20,30,40,50,60};	
	    int n=6 ;
	    int key= 40;

	   
	   
	   System.out.println("Befor Insertion  :: ");
	   printArray(arr);
	   
	   System.out.println("After Insertion ::");
     int  num =  deleteByKey(arr, n, key);
      printArray(arr, num);

	}
}
