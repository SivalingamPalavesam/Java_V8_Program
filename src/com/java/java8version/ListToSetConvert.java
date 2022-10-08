package com.java.java8version;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class ListToSetConvert {

	public static void main(String[] args) {

		List<String> list  = new ArrayList<>();
		list.add("siva");
		list.add("sri");
		list.add("riyas");
		list.add("sanchu");
		
		 Function<List<String>,Set<String>> names = (namelist) -> new HashSet<>(list);
		 System.out.println(names.apply(list));
		 
		 //Using Method Reference
		 Function<List<String>,Set<String>> namesMethodRef =HashSet::new;
		 System.out.println(namesMethodRef.apply(list));
		 
		
	}

}
