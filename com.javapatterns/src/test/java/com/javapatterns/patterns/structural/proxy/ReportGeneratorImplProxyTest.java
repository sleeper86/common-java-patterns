package com.javapatterns.patterns.structural.proxy;

import org.junit.Test;

/**
 * 
 * Test method for the proxy pattern.
 *
 */
public class ReportGeneratorImplProxyTest {
	
	@Test
	public void testGenerateReport() throws Exception {
		Role accessRole = new Role();
		accessRole.setRole("Manager"); // Allow creation of sensitive reports
		
		ReportGenerator proxy = new ReportGeneratorImplProxy(accessRole);
		proxy.displayReportTemplate("PDF", 150);
		proxy.generateComplexReport("PDF", 150);
		proxy.generateSensitiveReport();
	}
}
