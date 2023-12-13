package com.training.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext ct = new ClassPathXmlApplicationContext("applicationContext.xml");
		Parent p1 = (Parent) ct.getBean("parentBean");
		System.out.println(p1);
	}
}
