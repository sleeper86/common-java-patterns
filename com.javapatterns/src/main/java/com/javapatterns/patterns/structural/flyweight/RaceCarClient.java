package com.javapatterns.patterns.structural.flyweight;

/**
 * 
 * Client for race car factory.
 *
 */
public class RaceCarClient {
	private RaceCar raceCar;
	
	public RaceCarClient(String name) {
		/* Return a race car from the factory */
		raceCar = CarFactory.getRaceCar(name);
	}
	
	/**
	 * Extrinsic state of the flyweight object is maintained by the client
	 */
	private int currentX = 0;
	private int currentY = 0;
	
	public void moveCar(int newX, int newY) {
		/* Car movement also handled by the client */
		raceCar.moveCar(currentX, currentY, newX, newY);
		currentX = newX;
		currentY = newY;
	}
}
