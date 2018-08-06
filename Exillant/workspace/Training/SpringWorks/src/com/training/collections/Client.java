package com.training.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("collection-context.xml");
	MyClass collection=context.getBean("mycollection",MyClass.class);
	
	
	System.out.println(collection.getQuestionBank());
	System.out.println(collection.getAddressSet());
	System.out.println(collection.getAccountMap());
}
}
