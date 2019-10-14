package com.javapatterns.patterns.structural.bridge.abstraction;

import com.javapatterns.patterns.structural.bridge.implementation.MessageSender;

public class TextMessage extends Message {

	public TextMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send() {
		messageSender.sendMessage();

	}

}
