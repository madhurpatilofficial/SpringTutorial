package com.training.com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeManagement {
	public static void main(String[] args) {
		
		//1st way to create bean factory
//		Resource resource=new ClassPathResource("applicationContext.xml");  
//	    BeanFactory factory=new XmlBeanFactory(resource);
//	 
//	    Employee e1=(Employee) factory.getBean("employeeBean");
//	    System.out.println(e1);
	    
	    
//	    2nd method
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Employee e2=(Employee) context.getBean("employeeBean");
	    System.out.println(e2);
	}
}
