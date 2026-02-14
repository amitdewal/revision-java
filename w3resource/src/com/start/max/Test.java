package com.start.max;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
//		 Use Java streams to sort the entries by key and collect them into a new HashMap

		
		HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(22, "A");
        hashmap.put(55, "B");
        hashmap.put(33, "Z");
        hashmap.put(44, "M");
        hashmap.put(99, "I");
        hashmap.put(88, "X");
        
//      Map<Integer, String> collect = hashmap.entrySet().stream().sorted((map1, map2) -> map1.getKey().compareTo(map2.getKey()))
//      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o,e) -> e, LinkedHashMap::new));
//
//      System.out.println(collect);
        
        TreeMap<Integer, String> collect = hashmap.entrySet()
        		                                  .stream()
        		                                  .sorted(Map.Entry.comparingByKey())
        		                                  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o,e) -> o, TreeMap::new));
        
        System.out.println(collect);
	}

}
