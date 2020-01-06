package com.javapatterns.patterns.behavioral.visitor.structure;

import com.javapatterns.patterns.behavioral.visitor.visitors.MailClientVisitor;

/**
 * Element
 */
public interface MailClient {
	void sendMail(String[] mailInfo);
	void receiveMail(String[] mailInfo);
	boolean accept(MailClientVisitor visitor);
}
