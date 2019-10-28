package com.javapatterns.patterns.creational.factory;

import org.junit.Test;

import com.javapatterns.practice.factory.cupcake.Cupcake;
import com.javapatterns.practice.factory.cupcake.CupcakeBaseFactory;
import com.javapatterns.practice.factory.cupcake.CupcakeFactory;

public class CupcakeFactoryTest {
	
	@Test
	public void testMakeCupcakes() {
		CupcakeBaseFactory cupcakeFactory = new CupcakeFactory();
		Cupcake velvetCupcake = cupcakeFactory.makeCupcake("velvet");
		Cupcake chocolateCupcake = cupcakeFactory.makeCupcake("chocolate");
	}

}
