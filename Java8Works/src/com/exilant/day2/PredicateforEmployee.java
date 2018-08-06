package com.exilant.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.exilant.day1.Customer;

public class PredicateforEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Customer> customers=Arrays.asList(
				new Customer(101, "rupa", 6000, "tester"),
				new Customer(102, "divya", 0, "develoepr"),
				new Customer(104, "gautam", 10, "manager"),
				new Customer(105, "rahul", 50, "trainer"),
				new Customer(103, "rahul", 50000, "engineer")
				);
		
		Predicate<Customer> positive500Plus=c->c.getCustPurchases()>5000;
		Predicate<Customer> greaterthan=c->c.getCustPurchases()>5000;
		Predicate<Customer> engineers=c->c.getDesignation().equals("engineer");
		Predicate<Customer> predicate=positive500Plus.and(engineers);
		List<Customer> filteredCustomers1=filteredlist(customers
				,predicate);
				
		System.out.println("............."+greaterthan.equals(50000));
		
		
		List<Customer> filteredCustomers=filteredlist(customers, isEngineerGreaterThan5k());
		filteredCustomers.forEach(System.out::println);
	}
public static List<Customer> filteredlist(List<Customer> customers,Predicate<Customer> predicate)
{
	return customers.stream().filter(predicate).collect(Collectors.<Customer>toList());
}

public static Predicate<Customer> isEngineerGreaterThan5k()
{
	return p->p.getDesignation().equals("engineer")&&p.getCustPurchases()>5000;
}
}
