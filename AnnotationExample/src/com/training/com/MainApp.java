package com.training.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("annotationContext.xml");

		Employee e1 = (Employee) ct.getBean("empBean");
		System.out.println(e1);

	}
}
