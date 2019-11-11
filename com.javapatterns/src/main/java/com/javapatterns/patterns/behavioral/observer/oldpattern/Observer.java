package com.javapatterns.patterns.behavioral.observer.oldpattern;

import java.math.BigDecimal;

public interface Observer {
	public void update(Observer observer, String productName, BigDecimal bidAmount);
}
