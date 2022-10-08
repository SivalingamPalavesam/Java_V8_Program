package com.java.java8version;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		String[] strArr = {"a","b","c"};
		Stream<String> stream = Arrays.stream(strArr);
		stream.forEach(System.out::println);
	}

}
