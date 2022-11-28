package com.tns.Di;

public class Student {
	private int id;
	private String studentName;
	private String studentAddress;
	
	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public void setId(int id) {
		
		this.id = id;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void displayStudent() {
		System.out.println("ID = "+id+ " Name = "+studentName);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
	}
	

}
