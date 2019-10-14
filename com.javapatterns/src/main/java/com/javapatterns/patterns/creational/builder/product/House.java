package com.javapatterns.patterns.creational.builder.product;

public class House {
	
	private String foundation;
	private String structure;
	private String roof;
	private boolean furnished;
	private boolean painted;
	/**
	 * @return the foundation
	 */
	public String getFoundation() {
		return foundation;
	}
	/**
	 * @param foundation the foundation to set
	 */
	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}
	/**
	 * @return the structure
	 */
	public String getStructure() {
		return structure;
	}
	/**
	 * @param structure the structure to set
	 */
	public void setStructure(String structure) {
		this.structure = structure;
	}
	/**
	 * @return the roof
	 */
	public String getRoof() {
		return roof;
	}
	/**
	 * @param roof the roof to set
	 */
	public void setRoof(String roof) {
		this.roof = roof;
	}
	/**
	 * @return the furnished
	 */
	public boolean isFurnished() {
		return furnished;
	}
	/**
	 * @param furnished the furnished to set
	 */
	public void setFurnished(boolean furnished) {
		this.furnished = furnished;
	}
	/**
	 * @return the painted
	 */
	public boolean isPainted() {
		return painted;
	}
	/**
	 * @param painted the painted to set
	 */
	public void setPainted(boolean painted) {
		this.painted = painted;
	}
	
	@Override
	public String toString() {
		return "Foundation - " + foundation + " Structure - " + structure + " Roof - " + roof +" Is Furnished? "+furnished+" Is Painted? "+painted;
	}

}
