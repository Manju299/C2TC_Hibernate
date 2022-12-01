package com.tns.springcoree.interfacelifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tns/springcoree/interfacelifecycle/inteface.xml");
		Job j = (Job) context.getBean("j1");
		System.out .println(j);
		context.registerShutdownHook();
		

	}

}
