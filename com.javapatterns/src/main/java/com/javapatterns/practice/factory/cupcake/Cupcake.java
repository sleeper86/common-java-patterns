package com.javapatterns.practice.factory.cupcake;

public abstract class Cupcake {
	public abstract void addSprinkles();
	
	public void addFrosting() {
		System.out.println("Adding frosting...");
	}
}
