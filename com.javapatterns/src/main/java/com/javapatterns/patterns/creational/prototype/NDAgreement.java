package com.javapatterns.patterns.creational.prototype;

public class NDAgreement extends PrototypeCapableDocument {
	
	private AuthorizedSignatory authorizedSignatory;
	
	/**
	 * @return the authorizedSignatory
	 */
	public AuthorizedSignatory getAuthorizedSignatory() {
		return authorizedSignatory;
	}

	/**
	 * @param authorizedSignatory the authorizedSignatory to set
	 */
	public void setAuthorizedSignatory(AuthorizedSignatory authorizedSignatory) {
		this.authorizedSignatory = authorizedSignatory;
	}

	@Override
	public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
		/* Clone with a deep copy. Used when mutable objects are present (2 authorized signatures). */
		NDAgreement nda;
		nda = (NDAgreement) super.clone(); /* Start with a shallow copy of NDAgreement*/
		
		/* Now make a deep copy */
		AuthorizedSignatory clonedAuthorizedSignatory = (AuthorizedSignatory)nda.getAuthorizedSignatory().clone();
		nda.setAuthorizedSignatory(clonedAuthorizedSignatory);
		
		return nda;
	}
	
	@Override
	public String toString() {
		return "[NDAgreement - Vendor Name: " + getVendorName() + ", Content: " + getContent() + ", Authorized Signatory: " + getAuthorizedSignatory() + "]";
	}

}
