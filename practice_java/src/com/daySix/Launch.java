package com.daySix;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Launch {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sachin", "Rahul", "Sehwag", "Anil", "Sourav", "Sunil", "Laxman");
		System.out.println("after applying filter method");
		System.out.println(names);
		System.out.println("___________________________________");
		
		//filter the name start with "S"
		List<String> result = names.stream()
								   .filter(name -> name.startsWith("S"))
								   .collect(Collectors.toList());
		
		System.out.println("after applying filter method");
		System.out.println(result);

	}

}
/*
after applying filter method
[Sachin, Rahul, Sehwag, Anil, Sourav, Sunil, Laxman]
___________________________________
after applying filter method
[Sachin, Sehwag, Sourav, Sunil]
*/