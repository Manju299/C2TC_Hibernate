package com.tns.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tns/springcore/collections/bean.xml");
		Emp e =(Emp) context.getBean("emp");
		System.out.print(e);

	}

}
