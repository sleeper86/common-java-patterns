package com.javapatterns.patterns.creational.abstractfactory;

import org.junit.Test;

import com.javapatterns.patterns.creational.abstractfactory.product.Bike;

public class BikeLowEndFactoryTest {
	
	@Test
	public void testBuildBike() throws Exception {
		BikeBaseFactory bikeFactory = new BikeLowEndFactory();
		
		Bike roadBike = bikeFactory.buildBike("road");
		
		Bike hybridBike = bikeFactory.buildBike("hybrid");
	}

}
