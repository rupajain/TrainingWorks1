package com.exilant.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	public static void writeToFile() {
		BufferedWriter bw=null;
	 try {
		bw=new BufferedWriter(new FileWriter("Exilant.txt"));
	
	 bw.write("hello");
	 bw.newLine();
	 bw.write("how r u today");
	 bw.newLine();
	 bw.write("its nice weather in bangalore");
	 bw.newLine();
	 System.out.println("data saved successfully");
	 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 finally{
		 try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	
	}
public static void main(String[] args) throws IOException {
	writeToFile();
	writeToFile01();
	readFromFile();
}

public static void writeToFile01() throws IOException
{
	try(BufferedWriter bw=new BufferedWriter(new FileWriter("NewSample.txt"))){
		 bw.write("Exilant technology sss");
		 bw.newLine();
		 bw.write("how r u today");
		 bw.newLine();
		 bw.write("its nice weather in bangalore");
		 bw.newLine();
	}
}
public static void readFromFile() throws IOException
{
	try(BufferedReader br=new BufferedReader(new FileReader("NewSample.txt"))){
	//String s=br.readLine();
	br.lines().forEach(System.out::println);
	System.out.println(".........................");
//	while(s!=null)
//	{
//		System.out.println(s);
//		s=br.readLine();
//	}
//	
	}
	
}
}
