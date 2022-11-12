package com.tns.manytoone;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Department implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	private String name;
	@OneToMany(mappedBy = "department" ,cascade = CascadeType.ALL)
	private Set<Employee> employee = new HashSet<Employee>();
	
	public void addEmployee(Employee employee) {
		employee.setDepartment(this);
		this.getEmployee().add(employee);
	}
	
}
