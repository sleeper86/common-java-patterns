package com.javapatterns.patterns.creational.factory;

public class BikeFactory extends BikeBaseFactory {

	@Override
	public Bike createBike(String type) {
		Bike bike;
		
		switch(type)
		{
		case "mountain":
			bike = new BikeMountain();
			break;
		case "road":
			bike = new BikeRoad();
			break;
		case "hybrid":
			bike = new BikeHybrid();
			break;
			default: throw new IllegalArgumentException("Bike type does not exist.");
		}
		
		bike.adjustSeat();
		bike.spinWheel();
		return bike;
	}

}
