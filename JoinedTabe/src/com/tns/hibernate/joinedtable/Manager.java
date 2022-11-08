package com.tns.hibernate.joinedtable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Mgr")
public class Manager extends Employee{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String departmentName;


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
	

}
