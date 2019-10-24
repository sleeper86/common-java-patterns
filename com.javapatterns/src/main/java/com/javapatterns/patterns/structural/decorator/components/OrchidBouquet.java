package com.javapatterns.patterns.structural.decorator.components;

public class OrchidBouquet extends FlowerBouquet {

	public OrchidBouquet() {
		description = "Orchid Bouquet";
	}
	
	@Override
	public double cost() {
		return 29.0;
	}

}
