package com.pack.Intermediate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FixedArraySuchAs {
	
	//  If the element is not present then there will be -1 present in the array
	//Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
    //Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

	public static void fixeArray(int arr[]) {
	
	int  n  = arr.length;
	
	int i , j , temp;
	
	// Iterate over the array
	for( i=0; i < n ; i++) {
		
		for (j=0 ; j < n ; j++) {
		
			// check if any arr[j] is exists such that arr[J] is equal  to i
			
		 if(arr[j]==i) {
			 
			 temp = arr[j];
	        arr[j]=arr[i];
	        arr[i]= temp;
			break;
			 
		 }		
		}
	}
	
	// iterate over the array 
	
	for(i=0; i < n ; i++) {
		
		if(arr[i] != i) {
			arr[i]= -1; 
		}
			
	}
	
	System.out.println("After Rearrange the array : : ");
	
	print(arr);
	
}
	
    // Function to rearrange an array
   // such that arr[i] = i.
public static int []  fix(int A[]) {
	
	 int n = A.length;
	 
	 
	 for (int i = 0; i < n; i++)
     {
         if (A[i] != -1 && A[i] != i) 
         {
             int x = A[i];

             // check if desired place
             // is not vacate
             while (A[x] != -1 && A[x] != x)
             {
                 // store the value from
                 // desired place
                 int y = A[x];

                 // place the x to its correct
                 // position
                 A[x] = x;

                 // now y will become x, now
                 // search the place for x
                 x = y;
             }

             // place the x to its correct
             // position
             A[x] = x;

             // check if while loop hasn't
             // set the correct value at A[i]
             if (A[i] != i) 
             {
                 // if not then put -1 at
                 // the vacated place
                 A[i] = -1;
             }
         }
     }
     return A;
	
}

//  By implementing HashSet() 

       public static int[] fixArrys(int arr[]) {
    	   
    	    // Storing all the values in the hash set .
       Set< Integer> 	set = new HashSet<Integer>();
       
       for(int i =0; i < arr.length; i++) {
    
    	   set.add(arr[i]);

       }
       
       for(int i =0 ; i < arr.length ; i++) {
    	  
    	   if(set.contains(i))
    		   arr[i]= i;
    	   else 
    		   arr[i]=-1;
    	   
       }

    	   return arr;
    	   
       }

       
       // Simple Sort and swapping Algorithm use here
       
        public static void fixArrByCyclicSort(int arr[]) {

        	for (int i = 0; i < arr.length;) {	
        		
        		if(arr[i] >= 0 && arr[i] != i)
        		{
                     int ele = arr[arr[i]];
                     arr[arr[i]] = arr[i];
                     arr[i] = ele;
        		}else {
        			i++;
        		}            
             }
        	print(arr);
        }
        
       
        public static int[] fixArrByArraylist(int arr[]) {
        	
        	int n = arr.length;
        	
        	ArrayList<Integer> list = new ArrayList<Integer>(Collections.nCopies(n, -1));
        	
        	
        	for (int i = 0 ; i < n ; i++) {
        		
        		if(arr[i] != -1 ) {
        			
        			list.set( arr[i], arr[i]);

        		}
 	}

        	  for (int i = 0; i < n; i++) {
                  arr[i] = list.get(i);
              }
              return arr;
        	
        }

	public static void print(int arr[]) {
	   for(int i =0; i< arr.length ; i++) {
		   System.out.print(arr[i]+"  ");
		   }		
		System.out.println();
	}

	
	public static void main(String[] args) {
		
          int arr[]= { -1, -1, 6, 1, 9, 3,2, -1, 4, -1 };
          
          System.out.println("Before Rearrange the array :: ");
         

          print(arr);
          
     //     int A[] = fix(arr);
          
        //  print(A);
          
          
          System.out.println("After Rearrange the arrays ::");
          
       //   int ar[] = fixArrys(arr);
        //  print(ar);
          
      //    fixArrByCyclicSort(arr);
          
         int r[] =  fixArrByArraylist(arr);
         print(arr);
         

	}

}
