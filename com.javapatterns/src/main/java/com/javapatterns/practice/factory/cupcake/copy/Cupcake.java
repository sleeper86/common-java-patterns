package com.javapatterns.practice.factory.cupcake.copy;

public abstract class Cupcake {
	public abstract void addSprinkles();
	
	public void addFrosting() {
		System.out.println("Adding frosting...");
	}
}
