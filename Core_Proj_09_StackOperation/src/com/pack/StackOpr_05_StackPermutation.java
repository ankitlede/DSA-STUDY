package com.pack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackOpr_05_StackPermutation {

	
	public static boolean isPermutation(int arr1[] , int arr2[]) {

		Queue<Integer> input = new LinkedList<Integer>();
		for(int i=0; i< arr1.length; i++) {
			input.add(arr1[i]);
		}
		Queue<Integer> output = new LinkedList<Integer>();
		for(int i=0; i< arr2.length; i++) {
			output.add(arr2[i]);
		}
		
        Stack<Integer> stack = new Stack<Integer>();
        
        
        while(!input.isEmpty()) {
        	
        	int element = input.poll();
        	
        	if(element == output.peek()) {
        		
        		    output.poll();
        		    
        		    while(!stack.isEmpty()) {
        		    	
        		    	if (stack.peek() == output.peek()) {
        		    		 
        		    		stack.pop();
        		    		output.poll();
        		    		
        		    		
        		    	}else 
        		    		   break;
		    	
        		    }
        		
         	}else
        		stack.push(element);
        }

		return (input.isEmpty() && stack.isEmpty()) ;
	}
	

	public static void main(String[] args) {

		int arr1[]= {1,2,3};
		int arr2[]= {3,1,2};

		System.out.println("Given sets is permutation sets ="+isPermutation(arr1, arr2));
				
	}

}
