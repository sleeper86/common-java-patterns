package com.javapatterns.patterns.creational.abstractfactory;

import org.junit.Test;

import com.javapatterns.patterns.creational.abstractfactory.product.Bike;

public class BikeHighEndFactoryTest {
	
	@Test
	public void testBuildBike() throws Exception {
		BikeBaseFactory bikeFactory = new BikeHighEndFactory();
		
		Bike roadBike = bikeFactory.buildBike("road");
		
		Bike hybridBike = bikeFactory.buildBike("hybrid");
	}

}
