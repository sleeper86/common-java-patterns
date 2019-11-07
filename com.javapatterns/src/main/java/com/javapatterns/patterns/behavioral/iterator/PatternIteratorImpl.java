package com.javapatterns.patterns.behavioral.iterator;

import java.util.List;

public class PatternIteratorImpl implements PatternIterator {
	public List<DesignPattern> patternList;
	int position;
	DesignPattern designPattern;
	
	public PatternIteratorImpl(List<DesignPattern> patternList) {
		this.patternList = patternList;
	}

	@Override
	public DesignPattern nextPattern() {
		System.out.println("Returning pattern at Position: " + this.position);
        designPattern=(DesignPattern)this.patternList.get(this.position);
        
        this.position++;
        
        return designPattern;
	}

	@Override
	public boolean isLastPattern() {
		if(this.position < this.patternList.size()){
			return false;
	    }
		return true;
	}

}
