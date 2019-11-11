package com.javapatterns.patterns.behavioral.command;

import org.junit.Test;

import com.javapatterns.patterns.behavioral.command.commandobjects.CarMoveCommand;
import com.javapatterns.patterns.behavioral.command.commandobjects.CarStopCommand;
import com.javapatterns.patterns.behavioral.command.commandobjects.CommandBase;
import com.javapatterns.patterns.behavioral.command.commandobjects.TopRotateCommand;
import com.javapatterns.patterns.behavioral.command.commandobjects.TopStopRotateCommand;
import com.javapatterns.patterns.behavioral.command.invoker.RemoteControl;
import com.javapatterns.patterns.behavioral.command.receiver.Car;
import com.javapatterns.patterns.behavioral.command.receiver.RotatingTop;

public class RemoteControlTest {
	/**
	 * Test command pattern
	 * @throws Exception
	 */
	@Test
	public void testRemoteControlButtonPress() throws Exception {
		System.out.println("************* Pattern: Command *************");
		
		RemoteControl remoteControl=new RemoteControl();
		Car car=new Car();
		
        System.out.println("-----Testing onButtonPressed on RemoteControl for Car-----");
        CommandBase carMoveCommand = new CarMoveCommand(car);
        remoteControl.onButtonPress(carMoveCommand);
        
        System.out.println("-----Testing offButtonPressed on RemoteControl for Car-----");
        CommandBase carStopCommand = new CarStopCommand(car);
        remoteControl.offButtonPress(carStopCommand);
        
        System.out.println("-----Testing undoButtonPressed() on RemoteControl for Car-----");
        remoteControl.undoButtonPress();
        
        System.out.println("-----Testing onButtonPressed on RemoteControl for RotatingTop-----");
        RotatingTop top = new RotatingTop();
        CommandBase topRotateCommand =new TopRotateCommand(top);
        remoteControl.onButtonPress(topRotateCommand);
        
        System.out.println("-----Testing offButtonPressed on RemoteControl for RotatingTop-----");
        CommandBase topStopRotateCommand = new TopStopRotateCommand(top);
        remoteControl.offButtonPress(topStopRotateCommand);
        
       System.out.println("-----Testing undoButtonPressed on RemoteControl for RotatingTop-----");
        remoteControl.undoButtonPress();
        
        System.out.println();
	}
}
