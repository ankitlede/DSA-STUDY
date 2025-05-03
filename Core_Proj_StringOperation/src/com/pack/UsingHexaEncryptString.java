package com.pack;

public class UsingHexaEncryptString {
	
	
	// function for Conversion Decimal to Hexadecimal
	
	
	public static String  DecToHex( int no) {
		
		// Divide the given number.
		// get quotient and divide again until the quotient is equal to zero  
		// check reminder and convert into hexadecimal
		
		StringBuilder hexa = new StringBuilder();
		
		while(no != 0 ) {
			
			int rem = no % 16 ;
			char c ;
			
			if(rem < 10 ) 	
			      c = (char) (rem + 48);
				else 
			    	c=(char)(rem+87);
			
			hexa.append(c);
			
			no = no / 16 ;
			
          }
		
	      return hexa.toString();
	}
	

	
    public static String encrypt(String pass) {
    	
    	//   traverse the string  and count how many time found single character.
    	
    	StringBuilder encryptedPassword = new StringBuilder();
    

    	     for(int i =0; i < pass.length(); i++) {

    	    	 char ch = pass.charAt(i);
    	    	 int count =0;
    	    	 String hex;
    	    	 
    	    	 while(i < pass.length()  &&  pass.charAt(i) == ch) {
    	            count ++;
    	             i++;
    	    	 }
    	    	 
    	    	 // i decrement by 1 
    	    	 
    	    	 i-- ;
    	    	 
    	    	 // convert count to hexa 
    	    	 
    	    	 hex = DecToHex(count);
    	    	 
    	    	 // append char 
    	    	 
    	    	 encryptedPassword.append(ch);
    	    	 
    	    	 // append hex 
    	    	 
    	    	 encryptedPassword.append(hex);     
    	     }
    	
    	
       // reverse the Encrypted password.
    	     
    	     encryptedPassword.reverse();

    	     
    	     return encryptedPassword.toString();
    	     
    }

    
	public static void main(String[] args) {
	
		
		System.out.println(encrypt("Tutorial"));
		
		
		
	}
}
