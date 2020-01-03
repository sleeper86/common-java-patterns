package com.javapatterns.patterns.behavioral.template;

public class VeggiePizzaMaker extends PizzaMaker {

	@Override
	void prepareIngredients() {
		System.out.println("Preparing mushroom, tomato slices, onions, and fresh basil leaves.");
	}

	@Override
	void addToppings() {
		System.out.println("Adding mozzerella cheese and tomato sauce along with ingredients to crust.");
	}

}
