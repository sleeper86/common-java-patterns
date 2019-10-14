package com.javapatterns.patterns.structural.bridge;

import org.junit.Test;

import com.javapatterns.patterns.structural.bridge.abstraction.Message;
import com.javapatterns.patterns.structural.bridge.abstraction.TextMessage;
import com.javapatterns.patterns.structural.bridge.implementation.EmailMessageSender;
import com.javapatterns.patterns.structural.bridge.implementation.MessageSender;
import com.javapatterns.patterns.structural.bridge.implementation.TextMessageSender;

public class MessageTest {
	@Test
	public void testSend() throws Exception {
		MessageSender textMessageSender = new TextMessageSender();
		Message textMessage = new TextMessage(textMessageSender);
		textMessage.send();
		
		MessageSender emailMessageSender=new EmailMessageSender();
		Message emailMessage=new TextMessage(emailMessageSender);
		emailMessage.send();
	}
}
