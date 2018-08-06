package com.exilant.day2;

import java.util.Arrays;
import java.util.List;

import com.exilant.day2.PersonConsumer.PrintConsumer;

public class PersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Person> personList=Arrays.asList(
		new Person(101,"Rupa"),
		new Person(102,"Birendra"),
		new Person(103,"Divya"),
		new Person(104,"Jaya"),
		new Person(105,"Gautam"),
		new Person(106,"Rahul")
		
		);

personList.forEach(System.out::println);

PersonConsumer print=new PersonConsumer();

personList.forEach(print);

personList.forEach(PrintConsumer::print);

	}

}
