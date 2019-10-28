package com.javapatterns.patterns.structural.flyweight;

/**
 * 
 * Concrete flyweight object
 *
 */
public class FlyweightIndyCar extends RaceCar {
	/* Track number of flyweight instances */
	public static int num;
	
	public FlyweightIndyCar() {
		num++;
	}

	/* Car location passed to this method is extrinsic data. */
	/* No references to new or current location is maintained inside the flyweight */
	@Override
	void moveCar(int currentX, int currentY, int newX, int newY) {
		System.out.println("New location of Indy car " + this.name + " is X" + newX + " - Y" + newY);

	}

}
