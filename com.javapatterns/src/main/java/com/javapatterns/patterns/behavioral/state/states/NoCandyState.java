package com.javapatterns.patterns.behavioral.state.states;

import com.javapatterns.patterns.behavioral.state.context.CandyVendingMachine;

/**
 * 
 * Concrete state of the state machine
 *
 */
public class NoCandyState implements CandyVendingMachineState {
	
	CandyVendingMachine machine;

	public NoCandyState(CandyVendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() {
		System.out.println("No candies available");
	}

	@Override
	public void pressButton() {
		System.out.println("No candies available");
	}

	@Override
	public void dispense() {
		System.out.println("No candies available");
	}

    @Override
    public String toString(){
        return "NoCandyState";
    }
}
