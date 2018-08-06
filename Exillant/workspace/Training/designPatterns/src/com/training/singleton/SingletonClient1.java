package com.training.singleton;

public class SingletonClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Singleton singleton=Singleton.getInstance();
//shall give the  storage location
System.out.println(singleton.hashCode());

//shall give the storage location
System.out.println(singleton.hashCode());
 singleton=Singleton.getInstance();
//shall give the  storage location
System.out.println(singleton.hashCode());
System.out.println();
	}

}
