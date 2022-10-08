package com.java.java8version;

import java.util.function.Consumer;

public abstract class ConsumerInterface   {

	
	
	public static void main(String[] args) {

	Consumer<String> consumer =(a)-> System.out.println(a);
	
	//consumer.accept("10");
	
	Consumer<String> consumer1 =(c)-> System.out.println(c.length());
	
	consumer.andThen(consumer1).accept("Sivalingam");
	}

}
