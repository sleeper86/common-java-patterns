package com.javapatterns.patterns.creational.singleton;

import org.junit.Test;

import com.javapatterns.patterns.creational.singleton.FactoryManager;

public class SingletonFactoryManagerTest {

	@Test
	public void testSingletonFactoryManager() {
		FactoryManager fm = FactoryManager.getInstance();
		fm.startTracks();
	}
}
