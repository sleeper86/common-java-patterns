package com.javapatterns.patterns.behavioral.command.commandobjects;

public interface CommandBase {
	void execute();
	void undo();
}
