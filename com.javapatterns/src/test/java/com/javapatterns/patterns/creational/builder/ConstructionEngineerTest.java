package com.javapatterns.patterns.creational.builder;

import org.junit.Test;

import com.javapatterns.patterns.creational.builder.builders.ConcreteHouseBuilder;
import com.javapatterns.patterns.creational.builder.builders.HouseBuilder;
import com.javapatterns.patterns.creational.builder.builders.PrefabricatedHouseBuilder;
import com.javapatterns.patterns.creational.builder.director.ConstructionEngineer;
import com.javapatterns.patterns.creational.builder.product.House;

public class ConstructionEngineerTest {

	@Test
	public void testConstructHouse() throws Exception {
		
		HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
		ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
		House houseA = engineerA.constructHouse();
		System.out.println("House is: " + houseA);
		
		PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
		ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
		House houseB = engineerB.constructHouse();
		System.out.println("House is: " + houseB);
	}

}
