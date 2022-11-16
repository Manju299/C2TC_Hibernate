package com.tns.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
		Human h = context.getBean("human", Human.class);
		h.startPumping();
	}

}
