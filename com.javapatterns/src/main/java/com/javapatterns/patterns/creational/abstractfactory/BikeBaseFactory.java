package com.javapatterns.patterns.creational.abstractfactory;

import com.javapatterns.patterns.creational.abstractfactory.product.Bike;

public abstract class BikeBaseFactory {
	public abstract Bike buildBike(String type);
}
