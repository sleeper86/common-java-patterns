package com.javapatterns.patterns.behavioral.template;

import org.junit.Test;

public class PizzaMakerTest {

	@Test
	public void testPizzaMaker() throws Exception {
		System.out.println("************* Pattern: Template *************");
		
		System.out.println("--- Making Veggie Pizza ---");
		PizzaMaker veggiePizzaMaker = new VeggiePizzaMaker();
		veggiePizzaMaker.makePizza();
		
		System.out.println("-- Making Non-Veggie Pizza ---");
		PizzaMaker nonVeggiePizzaMaker = new NonVeggiePizzaMaker();
		nonVeggiePizzaMaker.makePizza();
		
		System.out.println("--- Making In-Store Pizza");
		PizzaMaker inStorePizzaMaker = new InStorePizzaMaker();
		inStorePizzaMaker.makePizza();

	}

}
