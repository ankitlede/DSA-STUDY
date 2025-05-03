package com.nt.pack;

import java.util.ArrayList;
import java.util.Collections;

public class ReversalArrayRotation {

	public static void leftRotate(int arr[], int d) {
		if (d == 0)
			return;

		int n = arr.length;

		// in case rotating factor is greater than array length
		d = d % n;

		System.out.println("Value of  d element : : " + d);

		reverseArray(arr, 0, d - 1); // 0 to 1
		reverseArray(arr, d, n - 1); // 2 to 6
		reverseArray(arr, 0, n - 1); // 0 to 6

	}

	public static void reverseArray(int arr[], int start, int end) {

		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void rotateArray(ArrayList<Integer> arr, int k) {

		// find the size of the array
		int n = arr.size();

		// mode k with the size of the array to handle
		// the case where k is greater than the size of the array

		k %= n;  // here insure that rotation of the array with length

	//	 int pi = (n + k) / 2;
		//  System.out.println(" k  : : " + k + "  n   : : " + n +"  pi : : "+pi);

		// Reverse the entire array
	   	Collections.reverse(arr);

		 // Reverse the first k elements
        for (int i = 0; i < k / 2; i++) {          // while  k=2   -->    i< 1 
            int temp = arr.get(i);                 //    temp = 1
            arr.set(i, arr.get(k - i - 1));       //      get 2 and store index position at i=0
            arr.set(k - i - 1, temp);            //       swapping with index 0 with 1 and stop loop 
        }
 
        // Reverse the remaining n-k elements
        for (int i = k; i < (n + k) / 2; i++) {       // k=2       i< 3      
            int temp = arr.get(i);                       // temp = 3 
            arr.set(i, arr.get(n + k - i - 1));      //      get element from index 4 and swapping with i=2
            arr.set(n + k - i - 1, temp);              //   swapping with index 2 with index 4 
        }
	}
	
	
	// Function to left rotate multiple times 
	public static void printLeftRotate(int arr[] , int n , int k) {
		
		// To get Starting point of array
		
		int mod = k%n;
		
		
		// print the rotated array from from the start position 
		
		for(int i =0; i< n ; i++) 
			System.out.print(arr[( i  +  mod )  %  n ]  + "    ");

		System.out.println();

	}
	
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int d = 2;

		leftRotate(arr, d);
		print(arr);
		
		System.out.println("  ---------------------------------------------------------------------  ");	
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		 int k =2 ;
		 
		 rotateArray(list, k);
	    //	print(); 
		
		 
		  list.forEach(input -> System.out.print(input  +   "   "));
		  
		  System.out.println();
			System.out.println("  ---------------------------------------------------------------------  ");	

		    int array[]= {1,2,3,4,5};
		    
		    int length = array.length;
		    
        	   int r =2;
        	   
        	   System.out.println("Print left Rotation  : : "+r);
               printLeftRotate(array, length, r);
               
	              r =3;
        	    System.out.println("Print left Rotation  : : "+r);
                printLeftRotate(array, length, r);
                
                r =4;
        	    System.out.println("Print left Rotation  : : "+r);
                printLeftRotate(array, length, r);
		  
	}
}
