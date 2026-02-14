package com.start.qus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LaunchTwo {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,40,32,67,43,50,7,5,45,343,565,11);
		List<Integer> ans = list.stream().sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(ans);
		Integer i = ans.stream().sorted(Comparator.reverseOrder()).limit(5).findFirst().get();
		System.out.println(i);
	}
	
}
