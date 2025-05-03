package com.proj;

public class Dsa_ImageRotation {
	
	 // Function to rotate a N x M matrix by 90 degrees in clockwise direction

	public void rotatesMatrix( int mat[][] ) {
		
		int n = mat.length;           
		int m = mat[0].length;   

		
		// here n represent rows of new matrix
		 // here m represent rows of new matrix
		int newMat[] [] = new int[m] [n];
		
		for (int i=0; i<n;  i++) {
			for(int j=0; j<m ; j++) {
				newMat[j][n-i-1]=mat[i][j];				   
			}
	    }
		
		System.out.println("New  matrix :: :: ::");

		
		printMat(newMat);
		
		System.out.println("New  matrix :: :: ::");

		// copy the newmat into the mat
	
		mat = newMat;
	
	}
	
	public void  printMat(int mat[][]) {
       
	  for(int i=0 ; i< mat.length; i++) {
		  for(int j=0; j<mat[i].length;j++) {  
			  System.out.print(mat[i][j]+"  ");
		  }
		  System.out.println();
		  
	  }
	}
	
	
	public static void main(String[] args) {
		
		
		Dsa_ImageRotation obj = new Dsa_ImageRotation();
		
		   int mat[][]= {{1,2,3,4},
				                      {5,6,7,8}, 
				                      {9,10,11,12}
				                      };
		
		System.out.println("Before Rotates matrix :: :: ::");
		
		obj.printMat(mat);
		
		System.out.println("After Rotates matrix :: :: ::");
		
		obj.rotatesMatrix(mat);
		
		obj.printMat(mat);	
	}

}
