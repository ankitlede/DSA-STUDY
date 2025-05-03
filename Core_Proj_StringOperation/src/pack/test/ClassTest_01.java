package pack.test;

import java.util.Base64;

public class ClassTest_01 {
	 public static void main(String[] args) {
	        // Example Base64-encoded string
	        String base64Password = "JHlZkBu2/g7SK4uEI0HZ1cMI1QE=";

	        // Decode the Base64 string
	        byte[] decodedBytes = Base64.getDecoder().decode(base64Password);
	        String decodedPassword = new String(decodedBytes);

	        // Print the decoded result
	        
	        for (byte b : decodedBytes) {
	            System.out.printf("%02X ", b);
	        }

	    }
	
	
	
		/*
		 * public static void main(String[] args) {
		 * 
		 * 
		 * StringBuilder sb = new StringBuilder(); String[] elements = {"apple",
		 * "banana", "cherry"};
		 * 
		 * for (int i = 0; i < elements.length; i++) { if (i > 0) { sb.append(";"); }
		 * sb.append(elements[i]); }
		 * 
		 * System.out.println(sb.toString());
		 * 
		 * 
		 * }
		 */
}
