package com.javapatterns.patterns.behavioral;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.javapatterns.patterns.behavioral.chainofresponsibility.RequestorClientTest;
import com.javapatterns.patterns.behavioral.command.RemoteControlTest;
import com.javapatterns.patterns.behavioral.iterator.PatternAggregateImplTest;

@RunWith(Suite.class)				
@Suite.SuiteClasses({		
	PatternAggregateImplTest.class,
	RemoteControlTest.class,
	RequestorClientTest.class,
})

public class BehavioralTestSuite {

}
