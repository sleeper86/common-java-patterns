package com.javapatterns.patterns.creational.abstractfactory;

import com.javapatterns.patterns.creational.abstractfactory.parts.HandlebarsAero;
import com.javapatterns.patterns.creational.abstractfactory.parts.Brakes;
import com.javapatterns.patterns.creational.abstractfactory.parts.BrakesDisc;
import com.javapatterns.patterns.creational.abstractfactory.parts.Handlebars;

public class PartsHighEndFactory extends PartsBaseFactory {

	@Override
	public Brakes buildBrakes() {
		return new BrakesDisc();
	}

	@Override
	public Handlebars buildHandlebars() {
		return new HandlebarsAero();
	}

}
