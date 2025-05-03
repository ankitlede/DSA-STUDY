package com.pack.test;

public class ClassTest_01 {

	public static void main(String[] args) {

		String str = "SystemMMM";

		int count[] = new int[256];

	//	System.out.println(count['e'] == 101);

		
		  for(int i=0 ; i < str.length() ; i++) {
                 	  count[str.charAt(i)]++;
		  }
		  
      for (int i = 0; i < count.length; i++) {
						if (count[i] > 0) {
							System.out.println((char) i + ": " + count[i]); // Print character and its count }
						}
					}
		  
		  
		  
	
	} 

	
}
