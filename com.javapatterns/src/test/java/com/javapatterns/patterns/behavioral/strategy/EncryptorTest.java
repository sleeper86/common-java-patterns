package com.javapatterns.patterns.behavioral.strategy;

import org.junit.Test;

import com.javapatterns.patterns.behavioral.strategy.context.Encryptor;
import com.javapatterns.patterns.behavioral.strategy.strategies.AesEncryptionStrategy;
import com.javapatterns.patterns.behavioral.strategy.strategies.BlowfishEncryptionStrategy;
import com.javapatterns.patterns.behavioral.strategy.strategies.EncryptionStrategy;

public class EncryptorTest {

	@Test
	public void testEncrypt() throws Exception {
		System.out.println("************* Pattern: Strategy *************");
		EncryptionStrategy aesStrategy = new AesEncryptionStrategy();
		Encryptor aesEncryptor = new Encryptor(aesStrategy);
		aesEncryptor.setPlainText("This is plain text");
		aesEncryptor.encrypt();
		
		EncryptionStrategy blowfishStrategy = new BlowfishEncryptionStrategy();
		Encryptor blowfishEncryptor = new Encryptor(blowfishStrategy);
		blowfishEncryptor.setPlainText("This is plain text");
		blowfishEncryptor.encrypt();
		
	}

}
