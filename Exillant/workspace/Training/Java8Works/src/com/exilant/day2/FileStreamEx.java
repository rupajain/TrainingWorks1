package com.exilant.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Files.list(Paths.get(".")).map(Path::getFileName).forEach(System.out::println);

		//Stream.of("one", "two", "three", "four").peek(System.out::println).map(String::toUpperCase)
				//.filter(name -> name.endsWith("txt")).collect(Collectors.toList()).forEach(System.out::println);

		Files.list(Paths.get(".")).map(Path::getFileName).map(Path::toString).map(String::toUpperCase)
				.filter(name -> name.endsWith("TXT")).sorted().skip(1).limit(5).forEach(name -> doSomeAction(name));
	}

	private static void doSomeAction(String filename) {
		// TODO Auto-generated method stub
		System.out.println("action comes here...." + filename);
	}

}
