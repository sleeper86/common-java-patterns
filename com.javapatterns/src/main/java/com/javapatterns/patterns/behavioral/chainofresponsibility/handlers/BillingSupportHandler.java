package com.javapatterns.patterns.behavioral.chainofresponsibility.handlers;

/**
 * 
 * Concrete implementation of abstract class
 *
 */
public class BillingSupportHandler extends AbstractSupportHandler {

	public BillingSupportHandler(int level) {
		this.level = level;
	}
	
	@Override
	protected void handleRequest(String message) {
		System.out.println("BillingSupportHandler: processing request. " + message);

	}

}
