package com.javapatterns.patterns.creational.factory;

public abstract class Bike {
	public abstract void adjustSeat();
	
	public void spinWheel() {
		System.out.println("Spinning the wheel.");
	}

}
