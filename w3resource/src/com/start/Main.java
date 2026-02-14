package com.start;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {
	public static void main(String[] args) {
		
		List < Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
		nums.stream().mapToDouble(i -> i.doubleValue());
	
		List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
		
		List<String> collect = colors.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(collect);
		
		 List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 int sum = numbers.stream().filter(i -> i%2 ==0).mapToInt(Integer::intValue).sum();
		 System.out.println(sum);
		 
		 List < Integer > num1s = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
		 System.out.println(num1s);
		 //remove duplicate
		 List<Integer> collect2 = num1s.stream().distinct().collect(Collectors.toList());
		 System.out.println(collect2);
		 
		 
		 List < String > colors1 = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
		 
		 String startingLetter = "B";
		 
		 long count = colors1.stream().filter(c -> c.startsWith(startingLetter)).count();
		 	System.out.println(count);
		 	
		 	List<String> list = colors1.stream().sorted().toList();
		 	System.out.println(list);
		 	
		 	List<String> list2 = colors1.stream().sorted(Comparator.reverseOrder()).toList();
		 	System.out.println(list2);
		 	List < Integer > numsa = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		 	
		 	Integer max = numsa.stream().max(Integer::compare).orElse(null);
		 	System.out.println(max);
		 	
		 	Integer min = numsa.stream().min(Integer::compare).orElse(null);
		 	System.out.println(min);
		 	
		 	Integer smax = numsa.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		 	System.out.println(smax);
		 	
		 	Integer orElse = numsa.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
	
		 		System.out.println(orElse);
	}
	

}
