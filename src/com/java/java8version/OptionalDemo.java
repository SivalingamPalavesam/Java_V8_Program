package com.java.java8version;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		String email = null;
		Optional<Object> emptymethod = Optional.empty();
		System.out.println(emptymethod);
		
//		Optional<Object> ofMethod = Optional.of(email);
//		System.out.println(ofMethod);
		
		Optional<Object> ofNullaleMethod = Optional.ofNullable(email);
		System.out.println(ofNullaleMethod.isPresent());
		
//		Optional<Object> ofNullaleMethod1 = Optional.ofNullable(email);
//		System.out.println(ofNullaleMethod1.get());
		
		Optional<String> condition = Optional.of(email);
		condition.filter(res -> res.contains("siva"))
				.map(String::trim)
				.ifPresent(System.out::printf);
	}

}
