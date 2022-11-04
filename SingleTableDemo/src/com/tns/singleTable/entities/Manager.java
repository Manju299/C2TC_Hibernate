package com.tns.singleTable.entities;

import javax.persistence.Entity;

import javax.persistence.DiscriminatorValue;
@Entity
@DiscriminatorValue("MGR")
public class Manager extends Employee{
	private static final long serialVersionUID = 1L;
	
	
	private String departmentName;
	
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
