package com.nt.pack;

public class MergeSort {
	
	
	
	   public static void merge(int arr[], int l , int m , int r) {
		   
		   // find size of  two sub Array to be merged
		   
		   int n1 = m-l+1;
		   int n2 = r-m;
		   
		   
		   // create Temp arrays 
		   
		   int L[] = new int[n1];
		   int R[] = new int[n2];
		   
		   
		   // copy Date to Temp arrays 
		   
		    for (int i=0; i < n1 ; ++i) {
		    	L[i] = arr[l+i];
		      }
		    
		    for (int j=0; j< n2 ; ++j) {
		    	R[j]= arr[m+1+j];
		    }
		   
		    // Merg the temp arrays initial indices of First and Second sub array 
		    
		    int i=0 ,    j= 0 ;
		    
		    // Initial indexes of merged sub arrays
		    
		    int k=l;
		    
		    while (i< n1 && j< n2) {
		    	
		    	        if (L[i] <= R[j]) {
		    	        	arr[k]=L[i];
		    	        	i++;
		    	        }else {
		    	        	arr[k]=R[j];
		    	        	j++;
                       }
		    	        
		    	        k++;
		    }
		    
		    // copy remaining elements of L[]  if any
		    
		   
		   while (i<n1) {
			   arr[k] = L[i];
			   i++;
			   k++;
		    }
		   
		   // copy remaining element of R[] if any 
		   while(j<n2) {
			   arr[k]=R[j];
			   j++;
			   k++;	
		   }
	   }
	
	// Main function that sort  arr[L.....R] using merge
	  public static void sort (int arr[] , int l , int r) {
		  if(l< r) {
			  
			  // find the middle point of array 
			  int m = l+(r-l)/2;

			 // Sort first and second halves 
			  sort(arr, l , m);
			  sort(arr , m+1 , r);

			  // merge the sorted halves   
			  merge(arr, l, m, r);
			  
		  }
  }
	
	 public static void print (int arr[]) {
		 for (int i =0; i< arr.length; i++) {
			 System.out.print(arr[i]+"   ");
		 }
		 System.out.println();
	 }
	
	public static void main(String[] args) {
	
		 		 int arr[] = {11,55,44,66,88};
		 		 System.out.println("Before Merge and Sort....");
		 		 print(arr);
		 		 System.out.println("After Merge and sort ...");
		 		 sort(arr, 0, arr.length-1);	 		 
		 		 print(arr);

	}
}
