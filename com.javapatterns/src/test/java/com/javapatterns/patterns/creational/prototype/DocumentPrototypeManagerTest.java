package com.javapatterns.patterns.creational.prototype;

import org.junit.Test;

public class DocumentPrototypeManagerTest {
	@Test
	public void testGetClonedDocument() throws Exception {
		PrototypeCapableDocument clonedTAC = DocumentPrototypeManager.getClonedDocument("tac");
		clonedTAC.setVendorName("Mary Parker");
		System.out.println(clonedTAC);
		
		PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getClonedDocument("nda");
		clonedNDA.setVendorName("Pat Smith");
		System.out.println(clonedNDA);
	}
}
