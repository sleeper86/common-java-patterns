package com.javapatterns.patterns.behavioral.visitor.visitors;

import com.javapatterns.patterns.behavioral.visitor.structure.OperaMailClient;
import com.javapatterns.patterns.behavioral.visitor.structure.SquirrelMailClient;
import com.javapatterns.patterns.behavioral.visitor.structure.ZimbraMailClient;

/**
 * Visitor
 */
public interface MailClientVisitor {
	void visit(OperaMailClient mailClient);
	void visit(SquirrelMailClient mailClient);
	void visit(ZimbraMailClient mailClient);
}
