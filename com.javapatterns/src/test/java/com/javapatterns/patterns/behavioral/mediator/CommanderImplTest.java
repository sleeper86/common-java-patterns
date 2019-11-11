package com.javapatterns.patterns.behavioral.mediator;

import org.junit.Test;

import com.javapatterns.patterns.behavioral.mediator.colleague.ArmedUnit;
import com.javapatterns.patterns.behavioral.mediator.colleague.SoldierUnit;
import com.javapatterns.patterns.behavioral.mediator.colleague.TankUnit;
import com.javapatterns.patterns.behavioral.mediator.mediator.Commander;
import com.javapatterns.patterns.behavioral.mediator.mediator.CommanderImpl;

public class CommanderImplTest {
	
	@Test
	public void testMediator() throws Exception {
		
		System.out.println("************* Pattern: Mediator *************");
		
		Commander commander = new CommanderImpl();
		ArmedUnit soldierUnit = new SoldierUnit(commander);
		ArmedUnit tankUnit = new TankUnit(commander);
		
		commander.registerArmedUnits(soldierUnit, tankUnit);
		commander.startAttack(soldierUnit);
		commander.startAttack(tankUnit);
		commander.ceaseAttack(soldierUnit);
		commander.startAttack(tankUnit);
		
		System.out.println();
	}

}
