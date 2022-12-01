package com.tns.springcore.constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tns/springcore/constr/const.xml");
		Emp e = (Emp)context.getBean("emp");
		Emp e1 = (Emp)context.getBean("emp1");
		System.out.println(e);
		System.out.println(e1);

	}

}
