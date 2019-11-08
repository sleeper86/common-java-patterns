package com.javapatterns.patterns.behavioral.mediator.colleague;

import com.javapatterns.patterns.behavioral.mediator.mediator.Commander;

/**
 * 
 * Colleague object. Communicates with mediator.
 *
 */
public class SoldierUnit implements ArmedUnit {
	private Commander commander;
	
	public SoldierUnit(Commander commander) {
		this.commander = commander;
	}

	@Override
	public void attack() {
		if(commander.canAttack()) {
			System.out.println("SoldierUnit: Attacking...");
			commander.setAttackStatus(false);
		} else {
			System.out.println("SoldierUnit: Cannot attack now. Other unites attacking...");
		}

	}

	@Override
	public void stopAttack() {
		System.out.println("SoldierUnit: Stopped attacking...");
		commander.setAttackStatus(true);

	}

}
