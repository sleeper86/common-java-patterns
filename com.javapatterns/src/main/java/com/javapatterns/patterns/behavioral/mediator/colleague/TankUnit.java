package com.javapatterns.patterns.behavioral.mediator.colleague;

import com.javapatterns.patterns.behavioral.mediator.mediator.Commander;

/**
 * 
 * Concrete colleague
 *
 */
public class TankUnit implements ArmedUnit {
	private Commander commander;
	
	public TankUnit(Commander commander) {
		this.commander = commander;
	}
	
	@Override
	public void attack() {
		if(commander.canAttack()) {
			System.out.println("TankUnit: Attacking...");
			commander.setAttackStatus(false);
		} else {
			System.out.println("TankUnit: Cannot attack now. Other units attacking...");
		}

	}

	@Override
	public void stopAttack() {
		System.out.println("TankUnit: Stopped attacking...");
		commander.setAttackStatus(true);

	}

}
