package com.javapatterns.patterns.behavioral.memento;

/**
 * 
 * Stores the state of the originator object {@link EmpOriginator}
 *
 */
public class EmpMemento {
	private int empID;
    private String empName;
    private String empPhoneNo;
    private String empDesignation;
    
    public EmpMemento(int empId,String empName,String empPhoneNo,String empDesignation) {
        this.empID = empId;
        this.empName = empName;
        this.empPhoneNo = empPhoneNo;
        this.empDesignation = empDesignation;
	}
    
   public int getEmpID() {
        return empID;
    }
   
    public String getEmpName() {
        return empName;
    }
    
    public String getEmpDesignation() {
        return empDesignation;
    }
    
    public String getEmpPhoneNo() {
        return empPhoneNo;
    }
    
    @Override
    public String toString(){
        String str="Current Memento State" + this.empID +" , "+this.empName +" , "+this.getEmpPhoneNo()+" , "+this.getEmpDesignation();
        return str;
    }

}
