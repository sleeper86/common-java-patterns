package com.javapatterns.patterns.behavioral.chainofresponsibility;

import org.junit.Test;

import com.javapatterns.patterns.behavioral.chainofresponsibility.handlers.AbstractSupportHandler;

public class RequestorClientTest {
	
	@Test
	public void testGetHandlerChain() throws Exception {
		System.out.println("************* Pattern: Chain of Responsibility *************");
		AbstractSupportHandler handler = RequestorClient.getHandlerChain();
		handler.receiveRequest(AbstractSupportHandler.TECHNICAL, "My internet is broken.");
		
		System.out.println(".................................");
		handler.receiveRequest(AbstractSupportHandler.BILLING, "Please resend my bill for this month.");
		
		System.out.println(".................................");
		handler.receiveRequest(AbstractSupportHandler.GENERAL, "Please send any other plans for home users.");
		System.out.println();
	}

}
