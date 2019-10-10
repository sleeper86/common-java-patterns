package com.javapatterns.patterns.creational.abstractfactory;

import com.javapatterns.patterns.creational.abstractfactory.product.Bike;
import com.javapatterns.patterns.creational.abstractfactory.product.BikeHybrid;
import com.javapatterns.patterns.creational.abstractfactory.product.BikeMountain;
import com.javapatterns.patterns.creational.abstractfactory.product.BikeRoad;

public class BikeLowEndFactory extends BikeBaseFactory {

	@Override
	public Bike buildBike(String type) {
		Bike bike;
		PartsBaseFactory partsFactory = new PartsLowEndFactory();
		
		switch(type.toLowerCase())
		{
		case "road":
			bike = new BikeRoad(partsFactory);
			break;
		case "mountain":
			bike = new BikeMountain(partsFactory);
			break;
		case "hybrid":
			bike = new BikeHybrid(partsFactory);
			break;
			default: throw new IllegalArgumentException("Bike type does not exist.");
		}
		
		bike.addParts();
		bike.buildBike();
		return bike;
	}

}
