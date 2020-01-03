package com.javapatterns.patterns.behavioral;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.javapatterns.patterns.behavioral.chainofresponsibility.RequestorClientTest;
import com.javapatterns.patterns.behavioral.command.RemoteControlTest;
import com.javapatterns.patterns.behavioral.interpreter.ExpressionParserTest;
import com.javapatterns.patterns.behavioral.iterator.PatternAggregateImplTest;
import com.javapatterns.patterns.behavioral.mediator.CommanderImplTest;
import com.javapatterns.patterns.behavioral.memento.EmpOriginatorTest;
import com.javapatterns.patterns.behavioral.observer.newpattern.ObservableJavaAPITest;
import com.javapatterns.patterns.behavioral.observer.oldpattern.ObserverTest;
import com.javapatterns.patterns.behavioral.state.CandyVendingMachineTest;
import com.javapatterns.patterns.behavioral.strategy.EncryptorTest;
import com.javapatterns.patterns.behavioral.template.PizzaMakerTest;

@RunWith(Suite.class)				
@Suite.SuiteClasses({		
	CandyVendingMachineTest.class,
	CommanderImplTest.class,
	EmpOriginatorTest.class,
	EncryptorTest.class,
	ExpressionParserTest.class,
	ObservableJavaAPITest.class,
	ObserverTest.class,
	PatternAggregateImplTest.class,
	PizzaMakerTest.class,
	RemoteControlTest.class,
	RequestorClientTest.class,
})

public class BehavioralTestSuite {

}
