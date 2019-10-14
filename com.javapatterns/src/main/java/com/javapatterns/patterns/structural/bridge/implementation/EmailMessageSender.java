package com.javapatterns.patterns.structural.bridge.implementation;

public class EmailMessageSender implements MessageSender {

	@Override
	public void sendMessage() {
		System.out.println("EmailMessageSender: Sending email message...");

	}

}
