package com.javapatterns.patterns.behavioral.chainofresponsibility.handlers;

/**
 * 
 * Concrete implementation of abstract class
 *
 */
public class TechnicalSupportHandler extends AbstractSupportHandler {
	
	public TechnicalSupportHandler(int level) {
		this.level = level;
	}

	@Override
	protected void handleRequest(String message) {
		System.out.println("TechnicalSupportHandler: Processing request " + message);

	}

}
