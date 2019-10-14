package com.javapatterns.patterns.structural.adapter;

import org.junit.Test;

import com.javapatterns.patterns.structural.adapter.adaptee.CsvFormattable;
import com.javapatterns.patterns.structural.adapter.adaptee.CsvFormatter;
import com.javapatterns.patterns.structural.adapter.csvadapter.CsvAdapterImpl;
import com.javapatterns.patterns.structural.adapter.source.NewLineFormatter;
import com.javapatterns.patterns.structural.adapter.source.TextFormattable;

public class NewLineFormatterTest {

	@Test
	public void testFormatText() throws Exception {
		String testString =" Formatting line 1. Formatting line 2. Formatting line 3.";
		TextFormattable newLineFormatter = new NewLineFormatter();
		String resultString = newLineFormatter.formatText(testString);
		System.out.println(resultString);
		
		CsvFormattable csvFormatter = new CsvFormatter();
		TextFormattable csvAdapter = new CsvAdapterImpl(csvFormatter);
		String resultCsvString = csvAdapter.formatText(testString);
		System.out.println(resultCsvString);
	}

}
