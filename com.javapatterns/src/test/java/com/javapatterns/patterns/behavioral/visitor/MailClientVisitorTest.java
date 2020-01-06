package com.javapatterns.patterns.behavioral.visitor;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.javapatterns.patterns.behavioral.visitor.structure.OperaMailClient;
import com.javapatterns.patterns.behavioral.visitor.structure.SquirrelMailClient;
import com.javapatterns.patterns.behavioral.visitor.structure.ZimbraMailClient;
import com.javapatterns.patterns.behavioral.visitor.visitors.LinuxMailClientVisitor;
import com.javapatterns.patterns.behavioral.visitor.visitors.MacMailClientVisitor;
import com.javapatterns.patterns.behavioral.visitor.visitors.WindowsMailClientVisitor;

public class MailClientVisitorTest {
	// Clients specific to an OS
	private MacMailClientVisitor macVisitor;
	private LinuxMailClientVisitor linuxVisitor;
	private WindowsMailClientVisitor windowsVisitor;
	
	// Clients to use visitors for configuration
	private OperaMailClient operaMailClient;
	private SquirrelMailClient squirrelMailClient;
	private ZimbraMailClient zimbraMailClient;
	
    @Before
    public void setup() {
    	macVisitor=new MacMailClientVisitor();
    	linuxVisitor=new  LinuxMailClientVisitor();
    	windowsVisitor=new WindowsMailClientVisitor();
    	operaMailClient = new OperaMailClient();
    	squirrelMailClient=new SquirrelMailClient();
    	zimbraMailClient=new ZimbraMailClient();
    }
    
    @Test
     public void testOperaMailClient() throws Exception {
    	System.out.println("************* Pattern: Visitor *************");
        System.out.println("*** Testing Opera Mail Client for different environments ***");
        assertTrue(operaMailClient.accept(macVisitor));
        assertTrue(operaMailClient.accept(linuxVisitor));
        assertTrue(operaMailClient.accept(windowsVisitor));
    }
    @Test
    public void testSquirrelMailClient() throws Exception {
        System.out.println("*** Testing Squirrel Mail Client for different environments ***");
        assertTrue(squirrelMailClient.accept(macVisitor));
        assertTrue(squirrelMailClient.accept(linuxVisitor));
        assertTrue(squirrelMailClient.accept(windowsVisitor));
    }
    @Test
    public void testZimbraMailClient() throws Exception {
        System.out.println("*** Testing Zimbra Mail Client for different environments ***");
        assertTrue(zimbraMailClient.accept(macVisitor));
        assertTrue(zimbraMailClient.accept(linuxVisitor));
        assertTrue(zimbraMailClient.accept(windowsVisitor));
    }
}
