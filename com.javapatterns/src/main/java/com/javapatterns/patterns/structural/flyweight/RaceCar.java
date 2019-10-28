package com.javapatterns.patterns.structural.flyweight;

/**
 * 
 * Abstract flyweight
 *
 */
public abstract class RaceCar {
	/* Intrinsic state */
	String name;
	int speed;
	int horsePower;
	
	/* Extrinsic state stored/computed by client objects. Passed to the flyweight */
	abstract void moveCar(int currentX, int currentY, int newX, int newY);
}
