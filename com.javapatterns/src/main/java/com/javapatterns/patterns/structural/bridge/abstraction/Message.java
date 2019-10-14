package com.javapatterns.patterns.structural.bridge.abstraction;

import com.javapatterns.patterns.structural.bridge.implementation.MessageSender;

public abstract class Message {
	
	MessageSender messageSender;

	public Message(MessageSender messageSender) {
		this.messageSender = messageSender;
	}
	
	abstract public void send();

}
