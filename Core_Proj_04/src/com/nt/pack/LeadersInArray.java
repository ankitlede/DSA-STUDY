package com.nt.pack;

public class LeadersInArray {
	
	        public static void  findSubArraySum(int arr[] , int sum) {
	        	
	        	// find length of the array 
	        	
	        	int n = arr.length ;
	        	
	        	 // Pick a starting point
	            for (int i = 0; i < n; i++) {
	                int currentSum = arr[i];
	     
	                if (currentSum == sum) {
	                    System.out.println("Sum found at indexe "
	                                       + i);
	                    return;
	                }
	                else {
	                    // Try all subarrays starting with 'i'
	                    for (int j = i + 1; j < n; j++) {
	                        currentSum += arr[j];
	     
	                        if (currentSum == sum) {
	                            System.out.println(
	                                "Sum found between indexes " + i
	                                + " and " + j);
	                            return;
	                        }
	                    }
	                }
	            }
	            System.out.println("No subarray found");
	            return;
	        }
	
	        
	public static void main(String[] args) {
		
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 25};
		int sum =49 ;
		findSubArraySum(arr, sum);
	
	}
	
}
