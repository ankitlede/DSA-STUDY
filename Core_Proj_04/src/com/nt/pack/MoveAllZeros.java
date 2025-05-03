package com.nt.pack;

public class MoveAllZeros {
	
	
	// Function to push all zeros at the end of the array
	public static void pushElements(int arr[], int n) {
		// Count of non zero element 
		int count = 0 ;    
		// Traverse the array , if the element is encountered is non zero , 
	  //then replace the element at  index count with this element.
		for(int i=0; i< arr.length ; i++) {
			
			if(arr[i]!=0) {
				arr[count++]= arr[i];
			}		
			// Now all non zero element have been shifted to front and count is set as index of first 0
			// Make all element zero from count to end .
				}
		while(count < n) {
			arr[count++]=0;
		}
	}
	
	public static void printArray(int arr[]) {
		for(int i=0 ; i< arr.length ; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,5,0,6,7,0,9,0,8,4};
		int n = arr.length;
		System.out.println("Before Push : ");
		printArray(arr);
		System.out.println("After Push :");
		pushElements(arr, n);
		printArray(arr);	
		
	}
}