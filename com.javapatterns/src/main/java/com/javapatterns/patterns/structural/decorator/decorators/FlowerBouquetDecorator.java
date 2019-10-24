package com.javapatterns.patterns.structural.decorator.decorators;

import com.javapatterns.patterns.structural.decorator.components.FlowerBouquet;

/**
 * 
 * Abstract decorator
 *
 */
public abstract class FlowerBouquetDecorator extends FlowerBouquet {
	
public abstract String getDescription();

}
