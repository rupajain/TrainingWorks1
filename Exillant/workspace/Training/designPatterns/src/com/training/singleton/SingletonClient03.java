package com.training.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//program to access singleton(eager) through reflection
public class SingletonClient03 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Singleton singletonI1=Singleton.getInstance();
	Singleton singletonI2=null;
	Singleton singletonI3=null;
	
	Constructor [] constructors=Singleton.class.getDeclaredConstructors();
	
	for(Constructor constructor:constructors)
	{
		//with this stmt we can access private methods
		constructor.setAccessible(true);
		singletonI2=(Singleton) constructor.newInstance();
		singletonI3=(Singleton) constructor.newInstance();
		break;
	}
	System.out.println("instance one-hashcode"+singletonI1.hashCode());
	System.out.println("instance two-hashcode"+singletonI2);
	System.out.println("instance three-hashcode"+singletonI3);
}
}
