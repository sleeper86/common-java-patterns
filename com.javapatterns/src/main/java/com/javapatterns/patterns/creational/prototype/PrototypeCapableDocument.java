package com.javapatterns.patterns.creational.prototype;

/**
 * Prototype class
 */
public abstract class PrototypeCapableDocument implements Cloneable {
	private String vendorName;
	private String content;
	
	/**
	 * @return the vendorName
	 */
	public String getVendorName() {
		return vendorName;
	}
	/**
	 * @param vendorName the vendorName to set
	 */
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	public abstract PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException;

}
