package com.javapatterns.patterns.structural.flyweight;

/**
 * 
 * Concrete flyweight object
 *
 */
public class FlyweightRallyCar extends RaceCar {

	public static int num;
	
	public FlyweightRallyCar () {
		num++;
	}
	
	@Override
	void moveCar(int currentX, int currentY, int newX, int newY) {
		System.out.println("New location of rally car " + this.name + " is X" + newX + " - Y" + newY);

	}

}
