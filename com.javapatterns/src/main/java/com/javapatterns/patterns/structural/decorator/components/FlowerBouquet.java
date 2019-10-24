package com.javapatterns.patterns.structural.decorator.components;

/**
 * Abstract component
 *
 */
public abstract class FlowerBouquet {
	String description;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();

}
