package com.javapatterns.patterns.behavioral.iterator;

import java.util.List;
import java.util.ArrayList;

public class PatternAggregateImpl implements PatternAggregate {
	List<DesignPattern> patternList;
	
	public PatternAggregateImpl() {
		patternList = new ArrayList<DesignPattern>();
	}

	@Override
	public void addPattern(DesignPattern designPattern) {
		patternList.add(designPattern);

	}

	@Override
	public void removePattern(DesignPattern designPattern) {
		patternList.remove(designPattern);

	}

	@Override
	public PatternIterator getPatternIterator() {
		return new PatternIteratorImpl(patternList);
	}

}
