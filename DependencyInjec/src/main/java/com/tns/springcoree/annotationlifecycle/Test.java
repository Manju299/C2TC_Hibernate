package com.tns.springcoree.annotationlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		AbstractApplicationContext context = new  ClassPathXmlApplicationContext("com/tns/springcoree/annotationlifecycle/annotaion.xml");
		Example e = (Example)context.getBean("s1");
		System.out.print(e);
		context.registerShutdownHook();		
		
	}
 
} 
