package com.tns.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		College c = context.getBean("collegebean",College.class);
		System.out.print("the object is created "+c);
		
		

	}

}

