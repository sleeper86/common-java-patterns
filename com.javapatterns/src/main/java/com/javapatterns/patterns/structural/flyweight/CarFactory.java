package com.javapatterns.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Flyweight factory
 *
 */
public class CarFactory {
	
	private static Map<String, RaceCar> flyweights = new HashMap<>();
	
	public static RaceCar getRaceCar(String key) {
		/* If the race car exists, return the flyweight object */
		if(flyweights.containsKey(key)) {
			return flyweights.get(key);
		}
		
		RaceCar raceCar;
		
		/* If key doesn't exist, create the flyweight object in the map and return it */
		switch(key) {
		case "indy":
			raceCar = new FlyweightIndyCar();
			raceCar.name = "IndyCar";
			raceCar.speed = 200; // TODO random number
			raceCar.horsePower = 1000;
			break;
		case "rally":
			raceCar = new FlyweightRallyCar();
			raceCar.name = "RallyCar";
			raceCar.speed = 150; // TODO random number
			raceCar.horsePower = 700;
			break;
		default:
			throw new IllegalArgumentException("Unsupported car type.");
		}
		
		flyweights.put(key, raceCar);
		return raceCar;
	}
}
