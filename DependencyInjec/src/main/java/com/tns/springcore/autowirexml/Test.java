package com.tns.springcore.autowirexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tns/springcore/autowirexml/beans.xml");
		Empl emp = context.getBean("emp",Empl.class);
		System.out.println(emp);

	}

}
