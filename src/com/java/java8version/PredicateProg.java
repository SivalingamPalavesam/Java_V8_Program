package com.java.java8version;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateProg {

	/*public boolean test(Integer t) {
		if(t % 2 == 0)
		{
			return true;
		}else 
		{
			return false;
		}
		
	}
	public static void main(String[] args)
	{
		PredicateProg predicate = new PredicateProg();
		System.out.println(predicate.test(4));
	}*/
	public static void main(String[] args)
	{
		
		Predicate<Integer> predicate = (t) -> t%2==0;
		System.out.println(predicate.test(5));
		
		List<Integer>  list  =  Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.stream().filter(t->t>4).map(t->t).forEach(System.out::println);
		
	}
	
	
}
