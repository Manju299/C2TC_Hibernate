package com.tns.service;

import com.tns.dao.StudentDao;
import com.tns.dao.StudentDaoImpl;
import com.tns.entities.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao;
	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	private Student StudentDaoImpl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		Student student1 = dao.getStudentById(id);
		return student1;
	}
	

}
