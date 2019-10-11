package com.javapatterns.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Prototype manager
 */
public class DocumentPrototypeManager {

	private static Map<String, PrototypeCapableDocument> prototypes = new HashMap<String, PrototypeCapableDocument>();
	
	static {
		TermsAndConditions tac = new TermsAndConditions();
		tac.setVendorName("Vendor Name Placeholder");
		
		/* Retrieve Terms and Conditions from database/network call/disk I/O here */
		tac.setContent("Please read and accept the terms and conditions...");
		prototypes.put("tac", tac);
		
		AuthorizedSignatory authorizedSignatory = new AuthorizedSignatory();
		authorizedSignatory.setName("Frank Smith");
		authorizedSignatory.setDesignation("Operation Head");
		
		NDAgreement nda = new NDAgreement();
		nda.setVendorName("Vendor Name Placeholder");
		
		/* Retrieve non disclosure agreement from database/network/disk here */
		nda.setContent("Please read and accept the NDA...");
		nda.setAuthorizedSignatory(authorizedSignatory);
		prototypes.put("nda", nda);
	}
	
	public static PrototypeCapableDocument getClonedDocument(final String type) {
		PrototypeCapableDocument clonedDoc = null;
		try {
			PrototypeCapableDocument doc = prototypes.get(type);
			clonedDoc = doc.cloneDocument();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clonedDoc;
	}
}
