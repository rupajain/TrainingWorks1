package com.training.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("spring-context3.xml", "camera-context.xml",
		// "screen-context.xml", "speaker-context.xml");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context3.xml");

		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(MobileAppConfiguration.class);

		Mobile mobile = context.getBean("Mobile", Mobile.class);

		System.out.println("mobiles details:");

		System.out.println("mobile  camera type:  " + mobile.getCamera().getType());

		System.out.println("mobile speaker deatils:" + mobile.getSpeaker().getType() + "....."
				+ mobile.getSpeaker().getVolLevels());

		System.out.println("screen details:..." + mobile.getScreen().getBre() + "...."
				+ mobile.getScreen().getGlassType() + "...." + mobile.getScreen().getLen());
	}

}
