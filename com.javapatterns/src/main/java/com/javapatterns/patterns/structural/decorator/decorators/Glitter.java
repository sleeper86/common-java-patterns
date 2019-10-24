package com.javapatterns.patterns.structural.decorator.decorators;

import com.javapatterns.patterns.structural.decorator.components.FlowerBouquet;

/**
 * 
 * Concrete decorator
 *
 */
public class Glitter extends FlowerBouquetDecorator {

	FlowerBouquet flowerBouquet;
	
	public Glitter(FlowerBouquet flowerBouquet) {
		this.flowerBouquet = flowerBouquet;
	}
	
	@Override
	public String getDescription() {
		return this.flowerBouquet.getDescription()+", glitter";
	}

	@Override
	public double cost() {
		return 4 + this.flowerBouquet.cost();
	}

}
