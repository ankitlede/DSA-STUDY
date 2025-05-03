package com.pack.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class PasswordUtils {
	
	
    public static String getSalt() throws NoSuchAlgorithmException {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        sr.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }
    
	public static String hashPassword(String password, String salt) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA1");
		md.update(salt.getBytes());
		byte[] hashedPassword = md.digest(password.getBytes());
		StringBuilder sb = new StringBuilder();
		for (byte b : hashedPassword) {
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
	}    
    
    
    
}
