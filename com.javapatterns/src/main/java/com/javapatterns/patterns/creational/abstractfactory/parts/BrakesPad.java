package com.javapatterns.patterns.creational.abstractfactory.parts;

public class BrakesPad implements Brakes {

	public BrakesPad() {
		selectBrakes();
	}
	
	@Override
	public void selectBrakes() {
		System.out.println("Selecting pad brakes...");

	}

}
