package com.javapatterns.patterns.behavioral;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.javapatterns.patterns.behavioral.chainofresponsibility.RequestorClientTest;
import com.javapatterns.patterns.behavioral.command.RemoteControlTest;
import com.javapatterns.patterns.behavioral.iterator.PatternAggregateImplTest;
import com.javapatterns.patterns.behavioral.mediator.CommanderImplTest;
import com.javapatterns.patterns.behavioral.memento.EmpOriginatorTest;

@RunWith(Suite.class)				
@Suite.SuiteClasses({		
	CommanderImplTest.class,
	EmpOriginatorTest.class,
	PatternAggregateImplTest.class,
	RemoteControlTest.class,
	RequestorClientTest.class,
})

public class BehavioralTestSuite {

}
