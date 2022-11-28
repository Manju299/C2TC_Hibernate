package com.tns.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tns/springcore/ref/refer.xml");
		A a = (A)context.getBean("aref");
		System.out.println(a.getX()+"\n"+a.getOb().getY());
		System.out.print(a);

	}

}
