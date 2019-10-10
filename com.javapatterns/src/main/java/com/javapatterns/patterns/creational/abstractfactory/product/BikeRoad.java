package com.javapatterns.patterns.creational.abstractfactory.product;

import com.javapatterns.patterns.creational.abstractfactory.PartsBaseFactory;

public class BikeRoad extends Bike {
	PartsBaseFactory partsFactory;
	
	public BikeRoad(PartsBaseFactory partsFactory) {
		this.partsFactory = partsFactory;
	}
	
	@Override
	public void addParts() {
		System.out.println("Preparing parts for road bike.");
		partsFactory.buildBrakes();
		partsFactory.buildHandlebars();

	}

}
