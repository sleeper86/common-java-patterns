package com.javapatterns.patterns.behavioral.template;

/**
 * "high level" pizza maker class
 * Follows the hollywood principle of inverted control.
 *
 */
public abstract class PizzaMaker {

	public void makePizza() {
		preparePizzaDough();
		preBakeCrust();
		prepareIngredients();
		addToppings();
		bakePizza();
		if(customerWantsPackedPizza()) {
			packPizza();
		}
	}
	
	public PizzaMaker() {
		// TODO Auto-generated constructor stub
	}
	
	final void preparePizzaDough() {
		System.out.println("Preparing pizza dough...");
	}
	
	final void preBakeCrust() {
		System.out.println("Pre-baking crust...");
	}
	
	abstract void prepareIngredients();
	
	abstract void addToppings();
	
	void bakePizza() {
		System.out.println("Baking pizza...");
	}
	
	void packPizza() {
		System.out.println("Packing pizza in delivery box");
	}
	
	boolean customerWantsPackedPizza() {
		return true;
	}
}
