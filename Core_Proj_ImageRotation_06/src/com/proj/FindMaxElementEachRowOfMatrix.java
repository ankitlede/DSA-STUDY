package com.proj;

public class FindMaxElementEachRowOfMatrix {
	
	public static void FindMaxElement(int no_of_rows , int mat[][]) {
		
		int i =0;
		int max = 0;
		
		int result [] = new int[no_of_rows];
		
		 while (i<no_of_rows) {
			 
			 for(int j=0 ; j <  mat[i].length ; j++) {
		 
			         if(mat[i][j] > max) {
			        	 max= mat[i][j];
			         }
			 } // end of traversing of row
			 result[i] = max;
			 max = 0;
			 i++;
	   }
		 
		 printArray(result); 
	} 
	
	
	public static void printArray(int arr[]) {
		for(int i=0; i < arr.length ; i++) {		
			System.out.print(arr[i]  +  "  ");
		}
	}
	
	public static void main(String[] args) {
		
		int mat[][]= {
				                {  3 ,  5,   8  },
				                {  7,    4,    7},
				                {  1,    2,    9}
		                          };
		
		
		
		FindMaxElement(3,mat);
		
		
		
		
	}
	
}
