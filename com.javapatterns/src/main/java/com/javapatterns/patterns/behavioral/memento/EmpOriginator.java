package com.javapatterns.patterns.behavioral.memento;

/**
 * 
 * Originator class. State needs to be saved externally.
 *
 */
public class EmpOriginator {
	private int empID;
	private String empName;
	private String empPhoneNo;
	private String empDesignation;
	
	public EmpOriginator(int empID, String empName, String empPhoneNo, String empDesignation) {
		this.empID = empID;
		this.empName = empName;
		this.empPhoneNo = empPhoneNo;
		this.empDesignation = empDesignation;
	}
	/**
	 * @return the empID
	 */
	public int getEmpID() {
		return empID;
	}
	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empPhoneNo
	 */
	public String getEmpPhoneNo() {
		return empPhoneNo;
	}
	/**
	 * @param empPhoneNo the empPhoneNo to set
	 */
	public void setEmpPhoneNo(String empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}
	/**
	 * @return the empDesignation
	 */
	public String getEmpDesignation() {
		return empDesignation;
	}
	/**
	 * @param empDesignation the empDesignation to set
	 */
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	public EmpMemento saveToMemento() {
		EmpMemento empMemento = new EmpMemento(this.empID, this.empName, this.empPhoneNo, this.empDesignation);
		return empMemento;
	}
	
	public void undoFromMemento(EmpMemento memento) {
		this.empID = memento.getEmpID();
		this.empName = memento.getEmpName();
		this.empPhoneNo = memento.getEmpPhoneNo();
		this.empDesignation = memento.getEmpDesignation();
	}
	
	public void printInfo() {
		System.out.println("ID: "+ this.empID);
        System.out.println("Name: "+ this.empName);
        System.out.println("Phone Number: "+ this.empPhoneNo);
        System.out.println("Designation: "+ this.empDesignation);
	}
}
