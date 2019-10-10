package com.javapatterns.patterns.creational.abstractfactory.parts;

public class HandlebarsStraight implements Handlebars {

	public HandlebarsStraight() {
		selectHandlebars();
	}
	
	@Override
	public void selectHandlebars() {
		System.out.println("Selecting straight handlebars...");

	}

}
