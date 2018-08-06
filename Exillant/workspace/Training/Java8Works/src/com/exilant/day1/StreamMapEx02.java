package com.exilant.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//to show working of map and filter based on the customer type
public class StreamMapEx02 {

	public static List<PriorityCustomer> filterCustomers(List<Customer> customers) {
		List<PriorityCustomer> priorityCustomers = new ArrayList<>();
		for (Customer temp : customers) {
			if (temp.getCustPurchases() > 5000) {
				priorityCustomers.add(new PriorityCustomer(temp.getCustId(), temp.getCustName(), "Gold"));
			}

		}
		return priorityCustomers;
	}
//////////////////////////
	//in java8 // to filter the customer as silver,gold,platinum with map.
	//if no condition is matched the null is returned.(oprtional)
	public static List<PriorityCustomer> filterCustomers1(List<Customer> customers) {
		List<PriorityCustomer> priorityCustomers = customers.stream().map(temp -> {
			if (temp.getCustPurchases() > 5000) {
				return new PriorityCustomer(temp.getCustId(), temp.getCustName(), "Gold");
			}
			return null;
		}).collect(Collectors.toList());
		return priorityCustomers;
	}
/////////////////
	public static List<PriorityCustomer> filterCustomers2(List<Customer> customers) {
		return customers.stream().filter(temp -> temp.getCustPurchases() > 5000).map(temp -> {
			return new PriorityCustomer(temp.getCustId(), temp.getCustName(), "Gold");
		}).collect(Collectors.toList());
	}
	public static List<PriorityCustomer> filterCustomers3(List<Customer> customers) {
		List<PriorityCustomer>  prioritycustomers=customers.stream().map(temp->{
			return new PriorityCustomer(temp.getCustId(),temp.getCustName(),
					temp.getCustPurchases()<3000 && temp.getCustPurchases()<5000?"gold":"platinum");
		})
		.collect(Collectors.toList());
		return prioritycustomers;
	}
	
	
//	public static List<PriorityCustomer> filterCustomers4(List<Customer> customers) {
//		customers.stream().
//		List<PriorityCustomer>  prioritycustomers=customers.stream().map(temp->{
//			return new PriorityCustomer(temp.getCustId(),temp.getCustName(),
//					temp.getCustPurchases()<3000 && temp.getCustPurchases()<5000?"gold":"platinum");
//		})
//		.collect(Collectors.toList());
//		return prioritycustomers;
//	}

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(new Customer(101, "Rupa", 6000, "software enginner"),
				new Customer(101, "Rupa", 3000, "software enginner"),
				new Customer(102, "divya", 6000, "software enginner"),
				new Customer(103, "Birendra", 8000, "software enginner"),
				new Customer(104, "Ankit", 2000, "software enginner"),
				new Customer(105, "lohit", 1000, "software enginner"));
		

		//filterCustomers(customers.forEach(System.out::println));
		filterCustomers(customers).forEach(System.out::println);
		filterCustomers1(customers).forEach(System.out::println);
		filterCustomers2(customers).forEach(System.out::println);
		filterCustomers3(customers).forEach(System.out::println);
	}
}
