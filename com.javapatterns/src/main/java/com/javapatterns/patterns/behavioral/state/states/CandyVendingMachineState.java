package com.javapatterns.patterns.behavioral.state.states;

/**
 * 
 * State portion of pattern
 *
 */
public interface CandyVendingMachineState {
	void insertCoin();
	void pressButton();
	void dispense();
}
