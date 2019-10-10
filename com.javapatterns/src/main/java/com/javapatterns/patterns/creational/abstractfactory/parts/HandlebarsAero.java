package com.javapatterns.patterns.creational.abstractfactory.parts;

public class HandlebarsAero implements Handlebars {

	public HandlebarsAero() {
		selectHandlebars();
	}
	
	@Override
	public void selectHandlebars() {
		System.out.println("Selecting aero handlebars...");

	}

}
