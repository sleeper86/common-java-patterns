package com.javapatterns.patterns.creational.abstractfactory.parts;

public class BrakesDisc implements Brakes {

	public BrakesDisc() {
		selectBrakes();
	}
	
	@Override
	public void selectBrakes() {
		System.out.println("Selecting disc brakes...");

	}

}
