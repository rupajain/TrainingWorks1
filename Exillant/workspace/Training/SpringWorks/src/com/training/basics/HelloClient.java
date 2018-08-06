package com.training.basics;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class HelloClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// by using https: spring_beanfactory_container
		// XmlBeanFactory factory=new XmlBeanFactory(new
		// ClassPathResource("spring-context.xml"));
		// HelloService helloService=(HelloService)factory.getBean("defaultHello");

		// by using applicationcontext
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("spring-context.xml");
		HelloService helloService = 
				(HelloService) context.getBean("defaultHello");
		System.out.println(helloService.sayHello());
	}

}
