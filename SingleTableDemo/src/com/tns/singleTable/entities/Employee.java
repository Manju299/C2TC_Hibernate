package com.tns.singleTable.entities;
import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;

import javax.persistence.Inheritance;

import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorValue;

import javax.persistence.DiscriminatorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "emp_store")

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="emp_type", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("EMP")
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeid;
	private String name;
	private double salary;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
