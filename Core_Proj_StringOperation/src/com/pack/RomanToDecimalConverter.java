package com.pack;

import java.util.HashMap;

public class RomanToDecimalConverter {

	public static int values(char value) {
		if (value=='I') {
			return 1;
		} else if (value=='V') {
			return 5;
		} else if (value=='X') {
			return 10;
		} else if (value=='L') {
			return 50;
		} else if (value=='C') {
			return 100;
		} else if (value=='D') {
			return 500;
		} else if (value=='M') {
			return 1000;
		} else
			return -1;
	}
	
	
	
	
	
	

	public static int  romToDecLagacyStyle(String value) {

	 // Initialize the result 
		
		int  result=0;
		
	//	System.out.println(value.length());
		
		
		for(int i=0; i<value.length(); i++) {
			 
			// get the value of the current symbol 
			
			int  s1 = values(value.charAt(i));
			
			// If the value of the current is greater and equal to next value then add it to the result.
			
			if(i+1 < value.length()) {

		    // Get the value of the next symbol 
				
				int s2 = values(value.charAt(i+1));
				
				// if the Current value is greater and equal to next value then add it to the result .
				
				if (s1 >= s2) {
					result += s1;
				
				}else {
					
					// else add the difference and skip the next symbol 	
					result += (s2-s1);
					i++;	
				}
			}else{
				//  Add the Last symbol to the result 			
				result += s1 ;
				
			}
	
		}
		
	return  result;
		
	}

	public static int romeToDecAdvanceSyle(String str)
    {
        HashMap<Character, Integer> romanMap
            = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
          
            // If the current value is less than the next
            // value, subtract current from next and add to
            // sum
            if (i + 1 < str.length()
                && romanMap.get(str.charAt(i))
                       < romanMap.get(str.charAt(i + 1))) {
                sum += romanMap.get(str.charAt(i + 1))
                       - romanMap.get(str.charAt(i));
              
              // Skip the next symbol
                i++;
            }
            else {
              
                // Otherwise, add the current value to sum
                sum += romanMap.get(str.charAt(i));
            }
        }

        return sum;
    }
	
	
	public static void main(String[] args) {
		
		       System.out.println(romToDecLagacyStyle("LXXXVIII"));		       
		       System.out.println(romeToDecAdvanceSyle("XVIII"));

	}
}
