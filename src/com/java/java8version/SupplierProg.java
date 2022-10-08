package com.java.java8version;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierProg 
{

	public static void main(String[] args)
	{
		Supplier<String> obj = () -> "Java is object oriented programing language" ;
		System.out.println(obj.get());
		
		List<String> list = Arrays.asList();
		list.stream().findAny().orElseGet(obj);
	}
	

}
