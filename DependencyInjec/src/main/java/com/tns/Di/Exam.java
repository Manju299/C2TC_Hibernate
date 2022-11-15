package com.tns.Di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 =context.getBean("s1",Student.class);
		s1.displayStudent();
		

	}

}
