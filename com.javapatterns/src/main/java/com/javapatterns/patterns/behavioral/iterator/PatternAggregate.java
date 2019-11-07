package com.javapatterns.patterns.behavioral.iterator;

public interface PatternAggregate {
	void addPattern(DesignPattern designPattern);
	void removePattern(DesignPattern designPattern);
	PatternIterator getPatternIterator();

}
