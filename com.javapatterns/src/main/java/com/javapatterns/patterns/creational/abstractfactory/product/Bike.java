package com.javapatterns.patterns.creational.abstractfactory.product;

public abstract class Bike {
	public abstract void addParts();
	public void buildBike() {
		System.out.println("Bike is built.");
	}
}
