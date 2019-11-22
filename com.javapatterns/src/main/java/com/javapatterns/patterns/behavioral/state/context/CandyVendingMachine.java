package com.javapatterns.patterns.behavioral.state.context;

import com.javapatterns.patterns.behavioral.state.states.CandyVendingMachineState;
import com.javapatterns.patterns.behavioral.state.states.ContainsCoinState;
import com.javapatterns.patterns.behavioral.state.states.DispensedState;
import com.javapatterns.patterns.behavioral.state.states.NoCandyState;
import com.javapatterns.patterns.behavioral.state.states.NoCoinState;

/**
 * 
 * Object that provides context for the state pattern
 *
 */
public class CandyVendingMachine {
	
    CandyVendingMachineState noCoinState;
    CandyVendingMachineState noCandyState;
    CandyVendingMachineState dispensedState;
    CandyVendingMachineState containsCoinState;
    CandyVendingMachineState currentState;
    int count;

	public CandyVendingMachine(int numberOfCandies) {
		// Fill the vending machine with candy at initialization
		count = numberOfCandies;

        noCoinState = new NoCoinState(this);
        noCandyState = new NoCandyState(this);
        dispensedState = new DispensedState(this);
        containsCoinState = new ContainsCoinState(this);
        currentState = noCoinState;
	}
	
    public void refillCandy(int numberOfCandies) {
        this.count += numberOfCandies;
        this.currentState = noCoinState;
    }
    
    public void dispenseCandy() {
        if (count!=0) {
            count--;
        }
    }
    
    public void insertCoin() {
        System.out.println("You inserted a coin.");
        this.currentState.insertCoin();
    }
    
    public void pressButton() {
        System.out.println("You have pressed the button.");
        this.currentState.pressButton();
        this.currentState.dispense();
    }
    
    public CandyVendingMachineState getState() {
        return currentState;
    }
    public void setState(CandyVendingMachineState state) {
        this.currentState = state;
    }
    
    public int getCount() {
        return count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }
    
    // State getters and setters
    public CandyVendingMachineState getNoCandyState() {
        return noCandyState;
    }
    
    public void setNoCandyState(CandyVendingMachineState noCandyState) {
        this.noCandyState = noCandyState;
    }
    
    public CandyVendingMachineState getNoCoinState() {
        return noCoinState;
    }
    
    public void setNoCoinState(CandyVendingMachineState noCoinState) {
        this.noCoinState = noCoinState;
    }
    
    public CandyVendingMachineState getContainsCoinState() {
        return containsCoinState;
    }
    
    public void setContainsCoinState(CandyVendingMachineState containsCoinState) {
        this.containsCoinState = containsCoinState;
    }
    
    public CandyVendingMachineState getDispensedState() {
        return dispensedState;
    }
    
    public void setDispensedState(CandyVendingMachineState dispensedState) {
        this.dispensedState = dispensedState;
    }
    
    @Override
    public String toString(){
        return "Current state of machine " + currentState + ". Candies available " + count;
    }


}
