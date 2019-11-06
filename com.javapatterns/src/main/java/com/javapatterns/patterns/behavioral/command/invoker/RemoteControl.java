package com.javapatterns.patterns.behavioral.command.invoker;

import com.javapatterns.patterns.behavioral.command.commandobjects.CommandBase;

public class RemoteControl {
	CommandBase onCommand, offCommand, undoCommand;
	
	public void onButtonPress(CommandBase onCommand) {
		this.onCommand = onCommand;
		onCommand.execute();
		undoCommand = onCommand;
	}
	
	public void offButtonPress(CommandBase offCommand) {
		this.offCommand = offCommand;
		offCommand.execute();
		undoCommand = offCommand;
	}
	
	public void undoButtonPress() {
		undoCommand.undo();
	}
}
