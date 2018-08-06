package com.training.helloi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Greeting greeting =  context.getBean("french", Greeting.class);
		
		System.out.println(greeting.greetHello());
	}

}
