package com.tns.Di;

public class Student {
	private int id;
	private String studentName;
	
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

	public void displayStudent() {
		System.out.println("ID = "+id+ " Name = "+studentName);
	}

}
