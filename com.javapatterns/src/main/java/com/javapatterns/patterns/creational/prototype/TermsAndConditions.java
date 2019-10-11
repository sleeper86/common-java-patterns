package com.javapatterns.patterns.creational.prototype;

/**
 * 
 * Concrete prototype of prototype PrototypeCapableDocument
 *
 */
public class TermsAndConditions extends PrototypeCapableDocument {

	@Override
	public PrototypeCapableDocument cloneDocument() {
		/* Clone with a shallow copy. Copied objects will be references to the original instead of a separate instance. */
		TermsAndConditions tac = null;
		try {
			tac = (TermsAndConditions) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return tac;
	}
	
	@Override
	public String toString() {
		return "[TermsAndConditions - Vendor name: " + getVendorName() + ", Content: " + getContent() + "]";
	}

}
