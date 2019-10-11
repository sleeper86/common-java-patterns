package com.javapatterns.patterns.creational.singleton;

public class SingletonClassLazy {
	private static SingletonClassLazy instance = null;
	
	private SingletonClassLazy() {
		
	}
	
	/* Use lazy initialization to instantiate the class */
	/* Use synchronized to make this thread safe - performance cost */
	private static SingletonClassLazy getInstance() {
		if (instance == null) {
			instance = new SingletonClassLazy();
		}
		
		return instance;
	}
}
