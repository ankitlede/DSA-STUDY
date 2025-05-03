package com.pack;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class StringPangramChecking {

	//  this function return true if string is pangram
	
	public static boolean isPangram(String str) {
		
		  // Create hash table to mark the 
	     // character representation in the string
		// by default all the elements of mark would be false 

          boolean mark[]= new boolean[26];
          
          // for indexing in the mark[]
          
          int index=0;
          
          // traverse all the character of the string 
          
          for(int i =0; i< str.length() ; i++) {	  
        	  // If upper Case character, subtract 'A' to find index.
        	  if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
        		                 index = str.charAt(i)-'A';
        		                 System.out.println(index);
        		                 
        	  }else if ('a'<=str.charAt(i) && str.charAt(i) <= 'z') {
        		              index = str.charAt(i) -'a';
     		                 System.out.println(index);

        	  }
        	  
        	  // if lower case character , Subtract 'a' to find index
        	  
        		// If this character is other than English 
        	  // lower case and upper case character.
        	  
        	  else
        		  continue;
        		  
        	  mark[index]= true;
        	  
        	  
          }  // ends for here 
          
       // Return false if any character is unmarked
          for (int i = 0; i <= 25; i++)
              if (mark[i] == false)
                  return (false);
   
          // If all characters were present
          return (true);
	}
	
	
	public static boolean isPangramAdvance(String str) {
		
		// create HashTable  for in insert all character of string 
		
		 Set<Character> set = new HashSet();
		 
		 for (char c : str.toCharArray()) {
		
			 
			 // If   character is Upper case
			 if(c >= 'A' && c <='Z') {
				        c = Character.toLowerCase(c);
                        set.add(c );
			 }
			 else if(c>='a' && c <='z') {
				        set.add(c);
			 }
		 }
		 
		 
		 // check if size is 26 or not 
		
		return set.size()==26;
	}

	
	public static void main(String[] args) {
	
		 String str  = "The quick brown fox jumps over  the lazy dog";
		 
     if (isPangramAdvance(str) == true)
         System.out.print(str + " \nis a pangram.");
     else
         System.out.print(str + " \nis not a pangram.");
     
	}
}
