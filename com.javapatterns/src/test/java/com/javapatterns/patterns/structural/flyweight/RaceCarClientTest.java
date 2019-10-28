package com.javapatterns.patterns.structural.flyweight;

import java.util.ArrayList;

import org.junit.Test;

/**
 * 
 * Test for the race car flyweight client.
 *
 */
public class RaceCarClientTest {
	
	@Test
	public void testRaceCar() throws Exception {
		ArrayList<RaceCarClient> raceCars = new ArrayList<RaceCarClient>();
		raceCars.add(new RaceCarClient("indy"));
		raceCars.add(new RaceCarClient("indy"));
		raceCars.add(new RaceCarClient("indy"));
		raceCars.add(new RaceCarClient("rally"));
		raceCars.add(new RaceCarClient("rally"));
		raceCars.add(new RaceCarClient("rally"));
		
		raceCars.get(0).moveCar(28, 312); // TODO loop
		raceCars.get(1).moveCar(38, 410);
		raceCars.get(2).moveCar(48, 525);
		raceCars.get(3).moveCar(58, 632);
		raceCars.get(4).moveCar(68, 733);
		raceCars.get(5).moveCar(78, 842);
		
		System.out.println("Indy car instances: " + FlyweightIndyCar.num);
		System.out.println("Rally car instances: " + FlyweightRallyCar.num);
		
	}
}
