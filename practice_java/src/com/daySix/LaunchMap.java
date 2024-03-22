/*map method*/

package com.daySix;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LaunchMap {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("before apply map method");
		System.out.println(numbers);
		
		List<Integer> sqNumbers = numbers.stream()
										 .map(num -> num * num)
										 .collect(Collectors.toList());
		System.out.println("after apply map method");
		System.out.println(sqNumbers);
	}

}
/*
before apply map method
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
after apply map method
[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
*/