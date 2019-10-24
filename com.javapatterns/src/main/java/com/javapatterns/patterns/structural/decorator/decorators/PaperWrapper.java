package com.javapatterns.patterns.structural.decorator.decorators;

import com.javapatterns.patterns.structural.decorator.components.FlowerBouquet;

/**
 * 
 * Concrete decorator
 *
 */
public class PaperWrapper extends FlowerBouquetDecorator {
	FlowerBouquet flowerBouquet;
	
	public PaperWrapper(FlowerBouquet flowerBouquet) {
		this.flowerBouquet = flowerBouquet;
	}
	
	@Override
	public String getDescription() {
		return flowerBouquet.getDescription() + ", paper wrap";
	}

	@Override
	public double cost() {
		return 3 + flowerBouquet.cost();
	}

}
