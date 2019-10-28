package com.javapatterns.patterns.structural.proxy;

/**
 * 
 * Subject portion of the proxy pattern
 * 
 * Different types of proxies: virtual, protection, remote, and smart reference.
 *
 */
public interface ReportGenerator {
	
	void displayReportTemplate(String reportFormat, int reportEntries);
	void generateComplexReport(String reportFormat, int reportEntries);
	void generateSensitiveReport();

}
