package com.javapatterns.patterns.creational.abstractfactory;

import com.javapatterns.patterns.creational.abstractfactory.parts.Brakes;
import com.javapatterns.patterns.creational.abstractfactory.parts.Handlebars;
import com.javapatterns.patterns.creational.abstractfactory.parts.BrakesPad;
import com.javapatterns.patterns.creational.abstractfactory.parts.HandlebarsStraight;

public class PartsLowEndFactory extends PartsBaseFactory {

	@Override
	public Brakes buildBrakes() {
		return new BrakesPad();
	}

	@Override
	public Handlebars buildHandlebars() {
		return new HandlebarsStraight();
	}

}
