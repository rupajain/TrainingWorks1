package com.exilant.day2.stats;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dragon> dragonList = Stream.of(new Dragon("Errol", "USA", 15), new Dragon("Errol", "USA", 56),
				new Dragon("Firnan", "USA", 5), new Dragon("Firnan", "France", 15), new Dragon("IceFire", "France", 15),
				new Dragon("IceFire", "USA", 15)).collect(Collectors.toList());

		// to find number of dragons
		Map<String, Long> mapDragobnCount = dragonList.stream()
				.collect(Collectors.groupingBy(Dragon::getName, Collectors.counting()));

		System.out.println(mapDragobnCount);
		Map<String, Integer> sumofDragons = dragonList.stream()
				.collect(Collectors.groupingBy(Dragon::getName, Collectors.summingInt(Dragon::getCount)));

		System.out.println(".............report of dragons");
		sumofDragons.forEach((k, v) -> {
			System.out.println("Dragon Name " + k + " number of dragons " + v);
		});
//
		
		System.out.println("sum of dragons....."+dragonList.stream().collect(Collectors.summingInt(Dragon::getCount)));
		System.out.println("average of dragons....."+dragonList.stream().collect(Collectors.averagingInt((Dragon::getCount))));
		System.out.println("max of dragons....."+dragonList.stream().max(Comparator.comparing(Dragon::getCount)).get().getCount());
		System.out.println("min of dragons....."+dragonList.stream().min(Comparator.comparing(Dragon::getCount)).get().getCount());
		
	//System.out.println(".............."+	dragonList.stream().collect(Collectors.groupingBy(Dragon::getCountry,Collectors.counting())).get());
		//////
		IntSummaryStatistics stats=dragonList.stream().mapToInt((x)->x.getCount()
				).summaryStatistics();
		
		System.out.println("sum is.."+stats.getSum());
		System.out.println("average  is.."+stats.getAverage());
		System.out.println("max  is.."+stats.getMax());
		System.out.println("min is.."+stats.getMin());
		System.out.println("count is.."+stats.getCount());
			}
	
	//find dragons by country and keep the names of dragons of different countries in the list/set
}
