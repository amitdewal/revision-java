package com.dayEight;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Launch {
public static void main(String[] args) {
	
	HashMap<Integer, String> map = new HashMap<>();
	map.put(102, "amit");
	map.put(101, "vijay");
	map.put(103, "rahul");	
	//System.out.println(map);
	
	
//	for(Map.Entry m : map.entrySet()) {
//		System.out.println(m.getKey() +": "+m.getValue());
//		
//	}
	
	// comparing by keys asc
//	map.entrySet().stream().sorted(Map.Entry.comparingByKey())
//	.forEach(System.out::println);
	
System.out.println("____________________________");
	
//comparing by keys desc
//	         map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
//			 .forEach(System.out::println); 
			
 //compare by value asc
map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
System.out.println("____________________________---");
//compare by value desc

map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	
}
}
