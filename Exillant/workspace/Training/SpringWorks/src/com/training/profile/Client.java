package com.training.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		context.getEnvironment().setActiveProfiles("Production", "Development");
		// ((AnnotationConfigApplicationContext)context).getEnvironment().setActiveProfiles("Development");

		// scans mentioned packages and register all the components vaailable in spring

		context.scan("com.training.profile");
		 //((AnnotationConfigApplicationContext)context).refresh();
		context.close();

	}

}
