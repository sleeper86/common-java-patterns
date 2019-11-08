package com.javapatterns.patterns.behavioral.mediator.mediator;

import com.javapatterns.patterns.behavioral.mediator.colleague.ArmedUnit;

/**
 * 
 * Mediator class
 *
 */
public interface Commander {
	void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);
	void setAttackStatus(boolean attackStatus);
	boolean canAttack();
	void startAttack(ArmedUnit armedUnit);
	void ceaseAttack(ArmedUnit armedUnit);
}
