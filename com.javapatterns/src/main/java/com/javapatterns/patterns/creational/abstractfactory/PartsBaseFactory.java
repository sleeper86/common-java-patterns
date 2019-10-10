package com.javapatterns.patterns.creational.abstractfactory;

import com.javapatterns.patterns.creational.abstractfactory.parts.Brakes;
import com.javapatterns.patterns.creational.abstractfactory.parts.Handlebars;

public abstract class PartsBaseFactory {
	public abstract Brakes buildBrakes();
	public abstract Handlebars buildHandlebars();
}
