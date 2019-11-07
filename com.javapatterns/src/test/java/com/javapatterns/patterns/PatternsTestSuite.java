package com.javapatterns.patterns;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.javapatterns.patterns.behavioral.BehavioralTestSuite;
import com.javapatterns.patterns.creational.CreationalTestSuite;
import com.javapatterns.patterns.structural.StructuralTestSuite;

@RunWith(Suite.class)				
@Suite.SuiteClasses({		
	BehavioralTestSuite.class,
	CreationalTestSuite.class,
	StructuralTestSuite.class,
})

public class PatternsTestSuite {

}
