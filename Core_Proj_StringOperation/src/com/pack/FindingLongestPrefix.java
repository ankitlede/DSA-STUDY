package com.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindingLongestPrefix {
    // Return the common prefix

	
	public static String  getPrefix(String str[]) {
		// Sort the array of strings	
		Arrays.sort(str);
	    // Get the first and last strings after sorting
		String first= str[0];
		String last = str[str.length-1];
        // Find the common prefix between the first and last strings
		int i=0 ;  
		// here i tracking the end  of string whose length of minimum. 
		
		int min= Math.min(first.length(), last.length());
		
		while(  i < min && first.charAt(i)==last.charAt(i)) {
			i++;
		}
		
		// Check if there's no common prefix
        if(i==0) 
        	return "-1";
        else 
        	return first.substring(0,i);
	}
	
	
	
	// A Utility Function to find the common prefix between 
	// strings- str1 and str2 
	    static String commonPrefixUtil(String str1, String str2) {
	        String result = "";
	        int n1 = str1.length(), n2 = str2.length();
	 
	        // Compare str1 and str2 
	        for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
	            if (str1.charAt(i) != str2.charAt(j)) {
	                break;
	            }
	            result += str1.charAt(i);
	        }
	 
	        return (result);
	    }
	 
	// A Function that returns the longest common prefix 
	// from the array of strings 
	    static String commonPrefix(String arr[], int n) {
	        String prefix = arr[0];
	 
	        for (int i = 1; i <= n - 1; i++) {
	            prefix = commonPrefixUtil(prefix, arr[i]);
	        }
	 
	        return (prefix);
	    }
	 
	// Driver program to test above function 
	
	public static void main(String[] args) {

		String[] strs = { "geeksforgeeks", "geeks", "geek",
        "geezer" };
		
		
		int n =   strs.length;
		
           System.out.println(commonPrefix(strs, n));


	}

}
