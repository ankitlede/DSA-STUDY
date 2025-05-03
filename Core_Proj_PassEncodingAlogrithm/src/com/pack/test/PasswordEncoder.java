package com.pack.test;

import java.security.NoSuchAlgorithmException;

import com.pack.util.PasswordUtils;

public class PasswordEncoder {

	public static void main(String[] args) {

		
		
		try {
			String salt = PasswordUtils.getSalt();
			String password = "jml";
			String hashedPassword = PasswordUtils.hashPassword(password, null);
		//	System.out.println("Salt: " + salt);
			System.out.println("Hashed Password: " + hashedPassword);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}		
		
		
		
		
	}

}
