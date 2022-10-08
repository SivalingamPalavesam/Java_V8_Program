package com.java.java8version;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GroupingBy {
	public static void main(String[] args) {

		String str = "sivalingam";

		Map<String, Long> countmaps = Arrays.stream(str.split("")).filter(s -> s.startsWith("l"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(countmaps);

		List<Integer> arr = Arrays.asList(1, 3, 8, 4, 5, 3, 6, 2);

		// arr.stream().filter(t-> t>3).sorted().forEach(System.out::println);

		arr.stream().filter(s -> s > 3).collect(Collectors.toList());

		List<Integer> maps = arr.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println("*************" + maps);
		List<Integer> sorts = arr.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("*************" + sorts);
		Collections.sort(arr);
		List<Integer> natur = arr.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println("*************" + natur);

		// IntStream.rangeClosed(1, 10).forEach(t->System.out.println(Thread.currentThread().getName()+t));
		// IntStream.rangeClosed(1, 10).parallel().forEach(t->System.out.println(Thread.currentThread().getName()+t));

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15 , 20);
		myList.stream()
						.min(Integer::compare)
						.ifPresent(System.out::println);
		
		myList.stream()
				.max(Integer::compare)
				.ifPresent(System.out::println);
		
		 long count =myList.stream()
				.count();
		System.out.println("The Number of count is :"+count);
				
			
	}

}
