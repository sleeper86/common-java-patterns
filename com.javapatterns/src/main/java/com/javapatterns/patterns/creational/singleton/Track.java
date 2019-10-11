package com.javapatterns.patterns.creational.singleton;

public class Track {
	
	private String value;
	
	public Track(String userValue) {
		value = userValue;
		
	}
	
	public void start() {
		System.out.println("Starting track " + value.toString());
	}
}
