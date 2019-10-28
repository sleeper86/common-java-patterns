package com.javapatterns.patterns.structural.proxy;

/**
 * 
 * RealSubject portion of the proxy pattern.
 *
 */
public class ReportGeneratorImpl implements ReportGenerator {
	
	/**
	 * Constructor
	 */
	public ReportGeneratorImpl() {
		System.out.println("ReportGeneratorImpl instance created");
	}

	@Override
	public void displayReportTemplate(String reportFormat, int reportEntries) {
	}

	@Override
	public void generateComplexReport(String reportFormat, int reportEntries) {
		/* Real world scenario: this would communicate with remote repos of large data sets */
		System.out.println("ReportGeneratorImpl: Generating complex report in " + reportFormat + " format with " + reportEntries + " entries.");

	}

	@Override
	public void generateSensitiveReport() {
		System.out.println("ReportGeneratorImpl: Generating sensitive report.");

	}

}
