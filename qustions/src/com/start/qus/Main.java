package com.start.qus;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		String str = "amit dewal";
		
		String[] arr = str.trim().split("");
		
	List<String> list = Arrays.asList(arr);
//	System.out.println(list);
//	
//	
//	HashSet<String> set = new HashSet<String>(list);
//	System.out.println(set);
//	for(String st:set) {
//		
//		System.out.println( st + " " +Collections.frequency(list, st));
//	}
	//System.out.println("end");
		
		
		
		Map<String, Long> map = list
				                   .stream()
				                   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		map.forEach((k,v) -> {
			if(map.get(k) > 1) {
				System.out.println(k + " "+ v);
			}
		});
		
		
		
				
	}

}
