package com.tns.client;

import com.tns.entities.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		student.setStudentid(20);
		student.setName("Manju");
		service.addStudent(student);
		System.out.println("operation Successfull");

	}

}
