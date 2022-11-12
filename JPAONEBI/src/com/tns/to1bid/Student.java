package com.tns.to1bid;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Student2")
public class Student implements Serializable{
	private static final long serialVersionUId = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentid;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Addresss address;
	
	
	public Addresss getAddress() {
		return address;
	}
	public void setAddress(Addresss address) {
		this.address = address;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
