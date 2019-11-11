package com.javapatterns.patterns.behavioral.interpreter.expressions;

import com.javapatterns.patterns.behavioral.interpreter.Expression;

public class MultiplicationExpression implements Expression {
	
	private Expression firstExpression, secondExpression;
	
	public MultiplicationExpression(Expression firstExpression, Expression secondExpression) {
		this.firstExpression = firstExpression;
		this.secondExpression = secondExpression;
	}

	@Override
	public int interpret() {
		return this.firstExpression.interpret() * this.secondExpression.interpret();
	}
	
	@Override
	public String toString() {
		return "*";
	}

}
