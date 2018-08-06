package com.training.singleton;

import java.io.Serializable;

//the singleton says there should be only opne objecr 
//to do so we will have the variable as static so that you can have only one reference,in singleton we can have two types
//1. eager singleton 2. lazy singleton
public class Singleton implements Serializable{
	private static final Singleton instance=new Singleton();
	
	//shall have the private constructor so that ,it is not accessible outside the class
	//one copy is always kept in JVM
private Singleton()
{
	System.out.println("the constuctor ia callled");
}
public static Singleton getInstance()
{
	return instance;
}

//to stop creating an instance if already exists
//this is only for objectInputSream class
protected Object readResolve() {
	return getInstance();
}
}
