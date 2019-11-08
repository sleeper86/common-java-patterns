package com.javapatterns.patterns.behavioral.mediator.mediator;

import com.javapatterns.patterns.behavioral.mediator.colleague.ArmedUnit;

/**
 * 
 * Concrete implementation
 *
 */
public class CommanderImpl implements Commander {
	ArmedUnit soldierUnit, tankUnit;
	boolean attackStatus = true;
	
	@Override
	public void setAttackStatus(boolean attackStatus) {
		this.attackStatus = attackStatus;

	}

	@Override
	public boolean canAttack() {
		return attackStatus;
	}

	@Override
	public void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit) {
		this.soldierUnit = soldierUnit;
		this.tankUnit = tankUnit;
		
	}

	@Override
	public void startAttack(ArmedUnit armedUnit) {
		armedUnit.attack();
		
	}

	@Override
	public void ceaseAttack(ArmedUnit armedUnit) {
		armedUnit.stopAttack();
		
	}

}
