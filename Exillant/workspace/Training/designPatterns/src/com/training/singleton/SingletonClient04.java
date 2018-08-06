package com.training.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonClient04 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton singleton=Singleton.getInstance();
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("sample.ser"));
		out.writeObject(singleton);
		System.out.println("object saved with hashcode"+singleton);
		out.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("sample.ser"));
		Singleton singletonI2=(Singleton)ois.readObject();
		ois.close();
		
		System.out.println("object received with hashocdee.."+singletonI2);
	}

}
