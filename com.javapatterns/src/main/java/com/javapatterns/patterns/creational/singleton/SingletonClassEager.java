package com.javapatterns.patterns.creational.singleton;

public class SingletonClassEager {
	private static final SingletonClassEager INSTANCE = new SingletonClassEager(); /* final keyword ensures there is only one instance */
	
	private SingletonClassEager() {
		
	}
	
	/* Will always create an instance, even if one is not necessary */
	/* Useful when creating the instance is not too expensive */
	/* Use synchronized to make this thread safe - performance cost */
	public static SingletonClassEager getInstance() {
		return INSTANCE;
	}
}
