package com.javapatterns.patterns.behavioral.iterator;

public class DesignPattern {
	private String patternType;
	private String patternName;
	
	public DesignPattern(String patternType, String patternName) {
		this.patternType = patternType;
		this.patternName = patternName;
	}

	/**
	 * @return the patternType
	 */
	public String getPatternType() {
		return this.patternType;
	}

	/**
	 * @return the patternName
	 */
	public String getPatternName() {
		return this.patternName;
	}

}
