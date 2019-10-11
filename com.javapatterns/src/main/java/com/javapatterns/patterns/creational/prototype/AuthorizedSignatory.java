package com.javapatterns.patterns.creational.prototype;

/**
 * 
 * Prototype class for NDAgreement. Allows for a deep copy of this object.
 *
 */
public class AuthorizedSignatory implements Cloneable {
	private String name;
	private String designation;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "AuthorizedSignatory - Name: " + getName() + ", Designation: " + getDesignation() + "]";
	}

}
