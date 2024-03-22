//   flat map use to  work on nested object 
/// like list of list of integer to convert into list of integer
package com.daySix;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LaunchFlatMap {
public static void main(String[] args) {
	
	
	List<Integer> listOne = Arrays.asList(1,2,3);
	List<Integer> listTwo = Arrays.asList(4,5,6);
	List<Integer> listYhree = Arrays.asList(7,8,9);
	
	
	//nested object
	List<List<Integer>> finalList = Arrays.asList(listOne,listTwo,listYhree);
	System.out.println("list of list of integer");
	System.out.println(finalList);
	
	List<Integer> flatList = finalList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
	System.out.println("list of integer");
	System.out.println(flatList);
	
}
}
