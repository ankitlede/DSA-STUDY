package com.pack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Proj_01_ReverseString {

	public static void reverseString(String str) {

		char template[] = str.toCharArray();

		for (int i = template.length - 1; i >= 0; i--) {

			System.out.print(template[i]);

		}
	}

	public static String reversingStr(String str) {

		List<String> words = new ArrayList<String>();
		String[] pureString = str.split("\\.");

		for (String word : pureString) {

			if (!word.isEmpty()) {
				words.add(word);
			}

		}
		
       Collections.reverse(words);
  
	   return  String.join(".", words);
 
	}

	public static String reverseStrUsingLegacyStyle(String str) {

        // Convert the string to mutable StringBuilder 
        StringBuilder s = new StringBuilder(str);
        
        // Reverse the whole string
        s.reverse();
        
        int n = s.length();
        int i = 0;
        
        for (int l = 0; l < n; ++l) {
            if (s.charAt(l) != '.') {
              
                // go to the beginning of the word
            	System.out.println( " charat i :: "+ s.charAt(i));
           // 	System.out.println( " charat i++ :: "+ s.charAt(i++));

            	
                if (i != 0) s.setCharAt(i++, '.');

                // go to the end of the word
                int r = l;
                while (r < n && s.charAt(r) != '.') {
                    s.setCharAt(i++, s.charAt(r++));
                }

                // reverse the word
                int start = i - (r - l);
                int end = i - 1;
                while (start < end) {
                    char temp = s.charAt(start);
                    s.setCharAt(start, s.charAt(end));
                    s.setCharAt(end, temp);
                    start++;
                    end--;
                }

                // move to the next word
                l = r;
            }
        }
        
        return s.substring(0, i);
		   
	}
	
  public static String  reverseStrUsingStack(String str) {
	  
	  
	    Stack<String>   stack = new Stack<String>();
	    StringBuilder  word = new StringBuilder();
	    
	    // Iterate Through the String 
	    
	    for(int i=0; i<str.length(); i++) {
	    	// if Not a dot build the current word.
	    	
	    	if(str.charAt(i) != '.') {	    		
	    		word.append(str.charAt(i));
	    	    System.out.println("word :: "+i+"  "+word);

	    	
	    	}else if(word.length() > 0) {
	    		// If we See a dot push the word into stack 		
	    		stack.push(word.toString());
	    		word.setLength(0);
	    	}
	    	if(!stack.isEmpty()) {
            System.out.println("Stack :: "+stack.pop());
	    	}
	    }

	    System.out.println("word :: "+word);
	    
	    
	    
	    // Last word remaining  push it to stack 
	    if(word.length()>0) {
	    	stack.push(word.toString());
	    }
	    
	    
	    
	    // rebuild the string from the stack 
	    
	    StringBuilder result = new StringBuilder();
	    
	    while(!stack.isEmpty()) {
	    	          result.append(stack.pop());
	    	          if(!stack.isEmpty()) {
	    	        	  result.append(".");
	    	          }
	             }
	    
	    return result.toString();
  }

	public static void main(String[] args) {
		
		System.out.println(reverseStrUsingLegacyStyle("Geek..for..Geeks"));

	}
}
