package com.javapatterns.patterns.behavioral.interpreter;

import com.javapatterns.patterns.behavioral.interpreter.expressions.AdditionExpression;
import com.javapatterns.patterns.behavioral.interpreter.expressions.MultiplicationExpression;
import com.javapatterns.patterns.behavioral.interpreter.expressions.SubtractionExpression;

public class ParserUtil {
	public static boolean isOperator(String symbol)	{
		return (symbol.equals("+") || symbol.equals("-") || symbol.equals("*"));
	}
	
	public static Expression getExpressionObject(Expression firstExpression, Expression secondExpression, String symbol) {
		switch(symbol) {
		case "+":
			return new AdditionExpression(firstExpression, secondExpression);
		case "-":
			return new SubtractionExpression(firstExpression, secondExpression);
		default:
			return new MultiplicationExpression(firstExpression, secondExpression);
		}
	}
}
