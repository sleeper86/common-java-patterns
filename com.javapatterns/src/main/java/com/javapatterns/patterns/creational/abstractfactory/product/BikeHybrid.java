package com.javapatterns.patterns.creational.abstractfactory.product;

import com.javapatterns.patterns.creational.abstractfactory.PartsBaseFactory;

public class BikeHybrid extends Bike {
	PartsBaseFactory partsFactory;
	
	public BikeHybrid(PartsBaseFactory partsFactory) {
		this.partsFactory = partsFactory;
	}
	
	@Override
	public void addParts() {
		System.out.println("Preparing parts for hybrid bike.");
		partsFactory.buildBrakes();
		partsFactory.buildHandlebars();

	}

}
