package com.dayFive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LaunchQustion {
public static void main(String[] args) {
	
	
	String names [] = {"Ranjan","Sumit","Ramesh","Rzkesh"};
	System.out.println(Arrays.toString(names));
	Arrays.sort(names);
	System.out.println(Arrays.toString(names));
	List<String> collect = Arrays.stream(names).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	System.out.println(collect);
}
}
