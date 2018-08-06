package com.exilant.day2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class randomFilteredExample {
public static void main(String[] args) {
	//this will generate one random number
	int randomNumber= ThreadLocalRandom.current().nextInt(100, 200);
	System.out.println(randomNumber);
	
	Random random=new Random();
	random.ints(10, 100, 200).forEach(System.out::println);
	System.out.println(".......................");
	random.ints(10, 100, 200).sorted().forEach(System.out::println);
	System.out.println(".......................");
	System.out.println(random.ints(10, 100, 200).max());
	System.out.println(".......................");
	//random.ints().sorted().forEach(System.out::println);
	
	
	Stream.iterate(10, i->i+1).limit(20).sorted().forEach(System.out::println);;
	
}
}
