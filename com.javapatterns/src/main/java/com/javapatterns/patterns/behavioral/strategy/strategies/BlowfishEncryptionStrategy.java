package com.javapatterns.patterns.behavioral.strategy.strategies;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class BlowfishEncryptionStrategy implements EncryptionStrategy {

	public BlowfishEncryptionStrategy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encryptData(String plainText) {
		System.out.println("\n-------Encrypting data using Blowfish algorithm-------");

		try {
			KeyGenerator kg = KeyGenerator.getInstance("Blowfish");
			kg.init(128);
			
			SecretKey secretKey = kg.generateKey();
			byte[] plainTextByteArray = plainText.getBytes("UTF8");
			
			Cipher cipher = Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			
			byte[] cipherText = cipher.doFinal(plainTextByteArray);
			
			System.out.println("Original data: " + plainText);
			System.out.println("Encrypted data:");
			for(int i = 0; i < cipherText.length; i++) {
				System.out.print(cipherText[i] + " ");
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
