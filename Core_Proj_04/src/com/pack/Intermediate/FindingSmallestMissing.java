package com.pack.Intermediate;

public class FindingSmallestMissing {
	
	
	
	public static int  findingMissing(int arr[], int start , int end) {
          
          if (start > end)
        	  return end+1;
		
          if(start != arr[start])
        	  return start;
          
          
          int mid =( start + end) /2 ;
          
          if (arr[mid] == mid )
        	  
         return findingMissing(arr, mid+1, end );

		return findingMissing(arr, start, mid);
	}

	
	public static void main(String[] args) {
		
		
		
		int arr[] = {0,1,2,3,4,6,7};
		int n = arr.length;
		System.out.println("The First Missing Number is :: ");
		
		int mis = findingMissing(arr, 0 , n-1);
		System.out.println(mis);
		
		
	}
	
	
	
	
	
	
	

}
