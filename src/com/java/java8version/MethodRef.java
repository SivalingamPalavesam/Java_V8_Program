package com.java.java8version;

import java.util.function.Function;

public class MethodRef {

	public static void main(String[] args) 
	{
		Function<String , String> strFunction = (String input) ->input.toUpperCase();
		System.out.println(strFunction.apply("sivalingam"));
		
		Function<String , String> strFun = (String::toLowerCase);
		System.out.println(strFun.apply("SIVALINGAM"));
	}

}
