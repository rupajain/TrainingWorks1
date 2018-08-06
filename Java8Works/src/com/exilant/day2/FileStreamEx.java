package com.exilant.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Files.list(Paths.get(".")).map(Path::getFileName).forEach(System.out::println);
	}

}
