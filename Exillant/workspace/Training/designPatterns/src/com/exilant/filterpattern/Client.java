package com.exilant.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Lohit", "male", "single"));
		list.add(new Person("Ramana", "male", "single"));
		list.add(new Person("Kumar", "male", "married"));
		list.add(new Person("ee", "male", "married"));
		list.add(new Person("Shubhashree", "female", "single"));

		ICriteria malecriteria = new Male();
		ICriteria femalecriteria=new Female();
		ICriteria single=new Single();
		ICriteria marriedcriteria=new Married();
		
		
		
		System.out.println(".......only males...");
		malecriteria.meetCirteria(list).forEach(System.out::println);
		System.out.println(".......only females...");
		
		femalecriteria.meetCirteria(list).forEach(System.out::println);
		
		
		System.out.println(".......only married...");
		
		marriedcriteria.meetCirteria(list).forEach(System.out::println);
		
		System.out.println(".......only single...");
		
		single.meetCirteria(list).forEach(System.out::println);
		
		System.out.println(".......only marriedmale...");
		ICriteria malemarried=new AndCriteria(marriedcriteria,malecriteria);
		malemarried.meetCirteria(list).forEach(System.out::println);
		
		System.out.println(".......only singlemale...");
		ICriteria malesingle=new AndCriteria(single,malecriteria);
		malesingle.meetCirteria(list).forEach(System.out::println);
		
		
		System.out.println(".......single and male...");
		ICriteria malesingle1=new OrCriteria(single,malecriteria);
		malesingle1.meetCirteria(list).forEach(System.out::println);
		
		System.out.println(".......not male...");
		ICriteria notmale=new NegativeCriteraia(malecriteria);
		notmale.meetCirteria(list).forEach(System.out::println);
		
		
		System.out.println(".......not married..");
		
		System.out.println("married list..."+marriedcriteria.toString());
		ICriteria notmarried=new NegativeCriteraia(marriedcriteria);
		notmarried.meetCirteria(list).forEach(System.out::println);
	}

}
