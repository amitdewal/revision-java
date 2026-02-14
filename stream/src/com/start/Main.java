package com.start;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		
		
		 List<Integer> list2 = Arrays.asList(2,1,4,7,10);
    	 //list2.stream().filter(i -> i >= 3).forEach(i-> System.out.println(i));
    	 
    	 Integer[] array = list2.stream().filter(i -> i >=3).toArray(size -> new Integer[size]);
    	 //System.out.println(array);
    	 
    	 List<Integer> list3 = Arrays.asList(2,1,4,7,10);
    	 		Integer reduce = list3.stream().reduce(0 ,(a,b) -> a + b);
    	 		//System.out.println(reduce);
    	 		
    	 		
    	 		
    	 		 List<Integer> list4 = Arrays.asList(2,1,7,4,10);
    	 		 
    	 		Integer min = list4.stream().filter(i -> i >=3).min(Comparator.reverseOrder()).get();
    	 		//System.out.println(min);
    	 		
    	 		
    	 		Integer max = list4.stream().filter(i -> i >=3).max(Comparator.reverseOrder()).get();
    	 		//System.out.println(max);
    	 		
    	 		
    	 		List<Integer> list5 = Arrays.asList(2,1,7,4,10);
    	 		
    	 		boolean anyMatch = list5.stream().noneMatch(i -> i > 7);
    	 		System.out.println(anyMatch);
    	 		
	}

}
