package com.javapatterns.patterns.structural.bridge.abstraction;

import com.javapatterns.patterns.structural.bridge.implementation.MessageSender;

public class EmailMessage extends Message {

	public EmailMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send() {
		messageSender.sendMessage();

	}

}
