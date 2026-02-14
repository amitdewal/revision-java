package com.start;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,2,4,5,6,7,8,9,10);
		
		List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		//System.out.println(evenList);
		
		
//		qus 2 find the numbers starting with 1

		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		
		List<String> startWithOneList = myList.stream()
				                     .map(ele -> Integer.toString(ele))
				                     .filter(ele -> ele.startsWith("1"))
				                     .collect(Collectors.toList());
		//System.out.println(startWithOneList);
		
		
		/*
		 * How to find duplicate elements in a given integers list in java using Stream
		 * functions?
		 */		 
		List<Integer> qusList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		Map<Integer, Long> map = qusList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//System.out.println( map);
		
		map.forEach((k,v) -> {
			
			if( v > 1) {
				//System.out.println( k +" " + v);
			}
		});
		
		/*
		 * Given the list of integers, find the first element of the list using Stream
		 * functions?
		 */		 
		List<Integer> l1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		//l1.stream().findFirst().ifPresent((element) -> System.out.println(element));
		
		/*
		 * Given a list of integers, find the total number of elements present in the
		 * list using Stream functions?
		 */		List<Integer> l2 = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 //System.out.println(l2.size());
		 long count = l2.stream().count();
		// System.out.println(count);
		 
		 
		/*
		 * Given a list of integers, find the maximum value element present in it using
		 * Stream functions?
		 */		
		 List<Integer> l3 = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 
		 Integer max = l3.stream().max(Integer::compare).get();
		// System.out.println(max);
		 
		/*
		 * Given a String, find the first non-repeated character in it using Stream
		 * functions?
		 */		 
		 String input = "Java articles are Awesome";
		String[] arr = input.toLowerCase().split("");
		
		List<String> listarr = Arrays.asList(arr);
		System.out.println(listarr);
		                                      String string = listarr
												.stream()
												.collect(Collectors
												.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
												.entrySet().stream().filter(s -> s.getValue() == 1).map(ele -> ele.getKey()).findFirst().get();
		 										
		 
	
		 

		// System.out.println(string);
		                   
		                                      //sort asc
 List<Integer> l5 = Arrays.asList(10,15,8,49,25,98,98,32,15);
 
 List<Integer> collect = l5.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
 System.out.println(collect);
		
 
 System.out.println(LocalDate.now());
 System.out.println(LocalTime.now());
 System.out.println(LocalDateTime.now());
 
 
 System.out.println("-------");
 
 Main obj = null;
 System.out.println(obj);
	}

}
