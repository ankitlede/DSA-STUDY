package com.pack.Intermediate;

public class ArrangePositiveNegative {

	
	/* The main function that Rearranges
	 * function that given arrays. It put positive
	 *  element at even indexes ( 0,  2, .. ,.. ,..   ) 
	 *  and Negative Numbers at odd indexes (1, 3, 5, ..,..,..)
	 *   */
	public static void arrange(int arr[]) {
		
		int n = arr.length ;
		
		
		/* following few lines are similar to partition process of quickSort .
		 *  The idea is to consider 0 and pivot and divide the array around it   */
		
		
		int i= -1 ,   temp =0;
		
		for ( int j=0; j< n ; j++) {
			
			if( arr[j] < 0 ) {
			   
				i++;
				temp= arr[i];
				arr[i]= arr[j];
				arr[j]=temp;
				}
			
				/* Now all positive Numbers all are at end and Negative 
				 * numbers at the beginning  of array  initialize indexes for
				 *  starting point positive and Negative Number to be swapped */
			
			int pos = i+1 , neg = 0 ;
			
			/* Increment the negative index by 2 and positive index by 
			 * 1 i.e. swapped every alternate negative number with 
			 * next positive number*/
			
			
			while (pos <  n && neg < pos && arr[neg]<0) {
				
				temp =  arr[neg];
				arr[neg]= arr[pos];
				arr[pos] = temp;
				pos++ ;
				neg +=2 ;
	
			}
					
		}
				
	}
	
	public  static void printArray(int arr[]) {
		int n = arr.length ;
		for(int i=0; i< n ; i++) {	
			System.out.print( arr[i]+ "  ");
        }
		System.out.println();
		}
		
	public static void main(String[] args) {
		
		 int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
	     //   int n = arr.length;
	        arrange(arr);
	        System.out.println("Array after rearranging: ");
	        printArray(arr);
     	}

}
