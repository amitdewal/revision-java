package com.start.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Launch {
	
	public static <E> void main(String[] args) {
		
		String arr [] = new String[] {"abc", "mno","abc","mno"};
		
		//array to list conversion
		List<String> list = Arrays.asList(arr);
		//System.out.println(list);
		
		
		//list to array conversion
		
		String[] array = list.toArray(new String[0]);
		for(String ele:array) {
			//System.out.println(ele);
		}
		
		//array to set conversion
		
		HashSet<String> set = new HashSet<String>(Arrays.asList(array));
		//System.out.println(set);
		
		LinkedHashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(array));
		//System.out.println(hashSet);
		
		
		//set to array conversion
		
		String[] array2 = set.toArray(new String[0]);
		for(String ele:array) {
		//System.out.println(ele);
		}
		
		//array to string conversion
		
		String str = Arrays.toString(array2);
		//System.out.println(str);
		String join = String.join("\s", array2);
		//System.out.println(join);
		
		String a = "apple,cccccc,banana,orange";
		String[] split = a.split(",");
		for(String s:split) {
			//System.out.println(s);
		}
		
		
		//list to set conversion
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("apple");
		alist.add("banana");
		
		HashSet<String> set2 = new HashSet<>(alist);
		//System.out.println(set2); 
		
		String[] arrr = {"key1", "value1", "key2", "value2", "key3", "value3"};
		
		//array to map conversion
		
		Map<String, Integer> map = Arrays.stream(arrr).collect(Collectors.toMap(key -> key, key -> key.length()));
		//System.out.println(map);
		
		
			Map<String, String> collect = IntStream.rangeClosed(0, arr.length).boxed().collect(Collectors.toMap(i -> arrr[i*2], i -> arrr[i*2 + 1]));
		
		System.out.println(collect);
		
		
	}
	
	
	

}
