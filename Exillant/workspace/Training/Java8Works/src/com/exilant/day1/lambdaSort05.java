package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lambdaSort05 {
	public static void main(String[] args) {
		
		List<Customer> customer=Arrays.asList(new Customer(101, "rupa", 3.4, "software developeer"),
				new Customer(101, "ansu",2 , "machanica engi")
				,new Customer(101, "sss", 50000, "tester"),
				new Customer(101, "sss", 2888999, "engineer"));
		
		System.out.println("after sort");
		customer.forEach(System.out::println);
		
		Collections.sort(customer,new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return o1.getCustName().compareTo(o2.getCustName());
			}
		});
		System.out.println("after sort on name asc");
		customer.forEach(System.out::println);
		
		
		///java8
		System.out.println("after sort on purchase acs");
		customer.sort((Customer c1,Customer c2)->(int)(c1.getCustPurchases()-c2.getCustPurchases()));
		customer.forEach(System.out::println);
		
		System.out.println("after sort on designatiomn asc");
		customer.sort((c1,c2)->c1.getDesignation().compareTo(c2.getDesignation()));
		customer.forEach(System.out::println);
		
		Comparator<Customer> customerComparator=(c1,c2)->
		c1.getCustName().compareTo(c2.getCustName());
		Collections.sort(customer,customerComparator);
		System.out.println("after sort on name asc");
		customer.forEach(System.out::println);
		
		customer.sort(customerComparator.reversed());
		System.out.println("after sort on name desc");
		customer.forEach(System.out::println);
		
		///sorting first on
		
	}

}
