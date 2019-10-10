package com.javapatterns.patterns.creational.abstractfactory.product;

import com.javapatterns.patterns.creational.abstractfactory.PartsBaseFactory;

public class BikeMountain extends Bike {
	PartsBaseFactory partsFactory;
	
	public BikeMountain(PartsBaseFactory partsFactory) {
		this.partsFactory = partsFactory;
	}
	
	@Override
	public void addParts() {
		System.out.println("Preparing parts for mountain bike.");
		partsFactory.buildBrakes();
		partsFactory.buildHandlebars();

	}

}
