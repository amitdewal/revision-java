package com.start.qus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoTest {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		String collect = list.stream()
				             .map(i -> i.toString())
				             .collect(Collectors.joining(","));
		System.out.println(collect);
		
	    
	   
		
	}

}
