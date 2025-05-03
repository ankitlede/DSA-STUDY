package com.proj;

public class printDiagonals {
	
	
	
	
 public static void  printDiagonalsSum(int mat[][], int n) {
 
	 int primary=0 , secondary=0;
	 
	 for( int i=0; i<mat.length ; i++) {
		   for(int j=0; j < mat[i].length; j++ ) {
			   
			   if(i == j)
				   primary += mat[i][j];
			   
			   if((i+j)==(n-1)) {
				   
				   secondary += mat[i][j];
				   
			   }
			   
		   }
	 }
	 
	 System.out.println("Principal ::  "+ primary);
	 
	 System.out.println("Secondary :: "+ secondary);
	 
	        	   
	        	   
 }
	
	public static void main(String[] args) {

		 int [][]a = {
				                 { 1, 2, 3, 4 },
                                 { 5, 6, 7, 8 }, 
                                 { 1, 2, 3, 4 },
                                 { 5, 6, 7, 8 } 
                             };
		 printDiagonalsSum(a,4);
		
		
	}

}
