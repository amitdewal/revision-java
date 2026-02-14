package com.start;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LaunchList {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		String temp = "";
		String num = list.stream()
				         .map(i -> Integer.toString(i))
				         .collect(Collectors.joining(","));
		
		
		String trim = String.join(",", list.toString()).replace("[", "").replace("]", "").trim();
		System.out.println(trim);
		System.out.println(num);
	}
}
