package com.proj;

public class FindMaxOnes {

	public static int  findingMax(int mat[][]) {

		int row = 0 , col=0;
		
		int counter=0;
		
		int arr[] = new int[mat.length];
		
		for(int i=row ; i< mat.length; i++) {
			
			for(int j=col ; j< mat[i].length; j++) {
				
				  if(mat[i][j]==1) 
					  counter ++;
				 			
			}
			  arr[i]=counter;
			  counter=0;
	}
		
		int k=1;
		for(int i=0 ; i<arr.length-1; i ++) {
			
			   System.out.println( arr[i]+"   "+arr[k] );

			  if(arr[i] > arr[k]) {
				  row =i;
			  }else {
				  row = k;
				  
			  }
  
		 k++;
		}
		
		System.out.println("Row :: "+row);
		return row;
	}
		
	public static void main(String[] args) {
		int mat[][] = { { 0, 0, 0, 1 }, { 1, 1, 0, 0 }, { 1,0, 1, 1 }, { 1, 0, 0, 0 } };
		findingMax(mat);
	}

}
