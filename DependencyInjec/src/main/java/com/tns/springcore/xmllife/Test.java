package com.tns.springcore.xmllife;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context  = new ClassPathXmlApplicationContext("com/tns/springcore/xmllife/lifecycle.xml");
		Dog d = (Dog) context.getBean("d1");
		context.registerShutdownHook();
		System.out.println(d);
		

	}

	
}
