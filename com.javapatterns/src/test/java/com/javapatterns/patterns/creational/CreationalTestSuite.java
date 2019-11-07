package com.javapatterns.patterns.creational;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.javapatterns.patterns.creational.abstractfactory.BikeHighEndFactoryTest;
import com.javapatterns.patterns.creational.abstractfactory.BikeLowEndFactoryTest;
import com.javapatterns.patterns.creational.builder.ConstructionEngineerTest;
import com.javapatterns.patterns.creational.factory.BikeFactoryTest;
import com.javapatterns.patterns.creational.factory.CupcakeFactoryTest;
import com.javapatterns.patterns.creational.prototype.DocumentPrototypeManagerTest;
import com.javapatterns.patterns.creational.singleton.SingletonFactoryManagerTest;

@RunWith(Suite.class)				
@Suite.SuiteClasses({		
	BikeFactoryTest.class,
	BikeHighEndFactoryTest.class,
	BikeLowEndFactoryTest.class,
	ConstructionEngineerTest.class,
	CupcakeFactoryTest.class,
	DocumentPrototypeManagerTest.class,
	SingletonFactoryManagerTest.class,
})

public class CreationalTestSuite {

}
