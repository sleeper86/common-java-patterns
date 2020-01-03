package com.javapatterns.patterns.behavioral.template;

public class NonVeggiePizzaMaker extends PizzaMaker {
	@Override
	void prepareIngredients() {
		System.out.println("Preparing chicken ham, onion, chicken sausages, and smoked chicken");
	}

	@Override
	void addToppings() {
		System.out.println("Adding cheese, pepper jelly, and BBQ sauce along with ingredients to crust.");
	}
}
