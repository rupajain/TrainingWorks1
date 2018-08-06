package com.exilant.day2.defaultmenthods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> greaterthan = i -> i > 10;
		Predicate<Integer> lessthan = i -> i < 10;
		Predicate<Integer> positiveNumbvers = i -> i > 0;
		Predicate<Integer> betweenRange = i -> i > 0 && i < 100;
		System.out.println(greaterthan.test(5));
		List<Integer> integerlist = Arrays.asList(12, 23, 45, -56, -35, 4, 7);
		// passing single predicate
		List<Integer> greaterthan10List = filteredList(integerlist, greaterthan);
		greaterthan10List.forEach(System.out::println);

		// we can have compound predicate passed
		Predicate<Integer> compoundPredicate = positiveNumbvers.and(betweenRange);
		List<Integer> compoundList = filteredList(integerlist, compoundPredicate);
		System.out.println("list of values...");
		compoundList.forEach(System.out::println);

	}

	public static List<Integer> filteredList(List<Integer> numbers, Predicate<Integer> predicate) {
		List<Integer> filterdList = new ArrayList<Integer>();

		for (Integer temp : numbers) {
			if (predicate.test(temp)) {
				filterdList.add(temp);
			}
		}
		return filterdList;
	}
}
