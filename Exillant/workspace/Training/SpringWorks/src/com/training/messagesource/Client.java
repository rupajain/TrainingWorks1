package com.training.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("message-resource-context.xml");
	
	
	
	String enggoodmorning=context.getMessage("goodmorning", new Object[] {},null);
	String frgoodmorning=context.getMessage("goodmorning", new Object[] {},new Locale("Fr"));
	String degoodmorning=context.getMessage("goodmorning", new Object[] {},new Locale("de"));
	String jagoodmorning=context.getMessage("goodmorning", new Object[] {},new Locale("ja"));
	
	
	System.out.println(enggoodmorning);
	System.out.println(frgoodmorning);
	System.out.println(degoodmorning);
	System.out.println(jagoodmorning);
	
	
	HelloWorld helloWorld=context.getBean("helloworld",HelloWorld.class);
	
	helloWorld.sayHelloWorld();
	helloWorld.sayHelloWorld_fr();
	helloWorld.sayHelloWorld_de();
	helloWorld.sayHelloWorld_ja();
}
}
