package com.javapatterns.patterns.behavioral.strategy.strategies;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AesEncryptionStrategy implements EncryptionStrategy {

	public AesEncryptionStrategy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encryptData(String plainText) {
		System.out.println("-------Encrypting data using AES algorithm-------");
		
		try {
			KeyGenerator kg = KeyGenerator.getInstance("AES");
			kg.init(128);
			
			SecretKey secretKey = kg.generateKey();
			byte[] plainTextByteArray = plainText.getBytes("UTF8");
			
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			byte[] cipherText = cipher.doFinal(plainTextByteArray);
			
			System.out.println("Original data: " + plainText);
			System.out.println("Encrypted data:");
			for(int i = 0; i < cipherText.length; i++) {
				System.out.print(cipherText[i] + " ");
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
