package com.javapatterns.patterns.behavioral.visitor.structure;

import com.javapatterns.patterns.behavioral.visitor.visitors.MailClientVisitor;

/**
 * Concrete element
 */
public class ZimbraMailClient implements MailClient {

	@Override
	public void sendMail(String[] mailInfo) {
		System.out.println("ZimbraMailClient: Sending mail");

	}

	@Override
	public void receiveMail(String[] mailInfo) {
		System.out.println("ZimbraMailClient: Receiving mail");

	}
	
	@Override
	public boolean accept(MailClientVisitor visitor) {
		visitor.visit(this);
		return true;
	}

}
