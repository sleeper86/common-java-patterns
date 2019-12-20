package com.javapatterns.patterns.behavioral.strategy.context;

import com.javapatterns.patterns.behavioral.strategy.strategies.EncryptionStrategy;

/**
 * Context for the strategy pattern
 */
public class Encryptor {
	private EncryptionStrategy strategy;
	private String plainText;
	
	public Encryptor(EncryptionStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void encrypt() {
		strategy.encryptData(plainText);
	}
	
	public String getPlainText() {
		return plainText;
	}
	
	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}

}
