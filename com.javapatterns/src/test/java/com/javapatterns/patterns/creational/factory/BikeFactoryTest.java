package com.javapatterns.patterns.creational.factory;

import org.junit.Test;

public class BikeFactoryTest {
	
	@Test
	public void testMakeBikes() {
		BikeBaseFactory bikeFactory = new BikeFactory();
		Bike roadBike = bikeFactory.createBike("road");
		Bike mountainBike = bikeFactory.createBike("mountain");
	}

}
