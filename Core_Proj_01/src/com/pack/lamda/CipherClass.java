package com.pack.lamda;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class CipherClass {
	
	 public static SecretKey keyGenerator() throws NoSuchAlgorithmException {
		 
		 
		 KeyGenerator keyGen = KeyGenerator.getInstance("AES");
	        keyGen.init(128); // or 192, 256
	        SecretKey secretKey = keyGen.generateKey();
		 
		 System.out.println(secretKey.toString());
		 return secretKey;
	 }
	
	
	
	
	
	 public static void main(String[] args) throws Exception {
		   
		   // Sample password
	        String password = "jml";
	        
	        // Generate a secret key
	        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
	        keyGen.init(128); // for AES-128
	        SecretKey secretKey = keyGen.generateKey();
	        
	        // Convert key to Base64 for storage
	        String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
	        System.out.println("Encoded Key: " + encodedKey);
	        
	        // Initialize Cipher for encryption
	        Cipher cipher = Cipher.getInstance("AES");
	        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	        
	        // Encrypt the password
	        byte[] encryptedBytes = cipher.doFinal(password.getBytes());
	        String encryptedPassword = Base64.getEncoder().encodeToString(encryptedBytes);
	        System.out.println("Encrypted Password: " + encryptedPassword);
	    }

}
