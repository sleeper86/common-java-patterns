package com.javapatterns.patterns.structural.adapter.source;

public class NewLineFormatter implements TextFormattable {

	@Override
	public String formatText(String text) {
		String formattedText = text.replace(".", "\n");
		return formattedText;
	}

}
