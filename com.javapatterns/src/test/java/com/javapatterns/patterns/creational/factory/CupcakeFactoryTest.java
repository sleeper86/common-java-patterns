package com.javapatterns.patterns.creational.factory;

import org.junit.Test;

import com.javapatterns.patterns.practice.factory.cupcake.Cupcake;
import com.javapatterns.patterns.practice.factory.cupcake.CupcakeBaseFactory;
import com.javapatterns.patterns.practice.factory.cupcake.CupcakeFactory;

public class CupcakeFactoryTest {
	
	@Test
	public void testMakeCupcakes() {
		CupcakeBaseFactory cupcakeFactory = new CupcakeFactory();
		Cupcake roadBike = cupcakeFactory.makeCupcake("velvet");
		Cupcake mountainBike = cupcakeFactory.makeCupcake("chocolate");
	}

}
