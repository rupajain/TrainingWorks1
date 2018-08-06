package com.exilant.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class getExilantString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Files.list(Paths.get(".")).map(Path::getFileName).map(Path::toString).map(String::toUpperCase)
				.filter(name -> name.endsWith("TXT")).forEach(name -> doSomeAction(name));

	}

	private static void doSomeAction(String filename){
		// TODO Auto-generated method stub
		System.out.println("action comes here...." + filename);
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			// String s=br.readLine();
			// br.lines().anyMatch(str->str.equals("Exilant")).forEach(System.out::println);
			br.lines().filter(str -> str.equals("Exilant")).forEach(System.out::println);
			// br.lines().forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
