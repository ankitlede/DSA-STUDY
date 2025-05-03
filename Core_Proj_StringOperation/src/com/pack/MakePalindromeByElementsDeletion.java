package com.pack;

public class MakePalindromeByElementsDeletion {

	
	public static  int minDeletionsToPalindromStr(String str , int start , int end) {
		
		if (start >= end )
			return 0;
		
		
		
		    // check start and end position character are matched or not
		
		    if(str.charAt(start) == str.charAt(end)) {
		    			    	
		    	// recursive call Function here 
		    return	minDeletionsToPalindromStr(str , start+1 , end-1);

		    }
		    
		    // return value , increment by 1 
		
             return 1 + Math.min(minDeletionsToPalindromStr( str ,  start+1 ,  end) , minDeletionsToPalindromStr( str ,  start ,  end-1) );
	}
	
	
   public static int callingUtillityFunctionForPalindrom(String str) {
	   
	   
	   // call utility function for palindrom	   
	 return  minDeletionsToPalindromStr(str , 0 , str.length()-1);
	
	   
   }
   
   
// Utility function for calculating
// Minimum element to delete
public static int utility_fun_for_del(String str, 
                                      int i, int j)
{
    if (i >= j)
        return 0;
 
    // Condition to compare characters
    if (str.charAt(i) == str.charAt(j)) 
    {
        
        // Recursive function call
        return utility_fun_for_del(str, 
                                   i + 1, j - 1);
    }
 
    // Return value, incrementing by 1
    return 1 + Math.min(utility_fun_for_del(str, i + 1, j),
                        utility_fun_for_del(str, i, j - 1));
}
 
// Function to calculate the minimum
// Element required to delete for
// Making string palindrome
public static int min_ele_del(String str)
{
    
    // Utility function call
    return utility_fun_for_del(str, 0, 
                               str.length() - 1);
}


		
	private static int minDeletionsToPalindrome(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int cl = 2; cl <= n; cl++) {
            for (int i = 0; i < n - cl + 1; i++) {  // n-1
                int j = i + cl - 1;             //   1
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }

        int longestPalindromicSubseq = dp[0][n - 1];
        return n - longestPalindromicSubseq;
    }

	
	public static void main(String[] args) {
		
	        String str = "geeksforgeeks";
	        
	        System.out.println("  Minimum deletions to make palindrome: " + callingUtillityFunctionForPalindrom(str));
	    
	}
	
}
