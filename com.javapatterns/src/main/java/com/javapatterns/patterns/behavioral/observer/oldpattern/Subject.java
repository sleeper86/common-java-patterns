package com.javapatterns.patterns.behavioral.observer.oldpattern;

import java.math.BigDecimal;

/**
 * 
 * Subject interface
 *
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
	public void setBidAmount(Observer observer, BigDecimal newBidAmount);
}
