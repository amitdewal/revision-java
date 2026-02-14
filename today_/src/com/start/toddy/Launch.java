package com.start.toddy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/*
table


select * from table order by id  desc limit 1;


 pl sql - > (+) (0) 
 
 nvl() 
  null ()


alter table_name  drop column_name


trigger

scaling


















*/

//9,3 7,8 7,3  -- 
public class Launch {
	
	public static List<Integer> printList(List<Integer> list) {
		int counter = 0;
		if(list.size() == 0) {
			return list ;
		}
		System.out.println(list.get(counter));
		
		list.remove(counter);
		counter++;
		return printList(list);
	}
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(9,3, 7,8, 7,3);
		//List<Integer> printList = Launch.printList(list);
		
		
		
		
		// java 8
		//list.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
	
	    HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	    
	    for(Integer i : list) {
	    		map.put(i, map.getOrDefault(i, 0)+1);
	    }
	    System.out.println(map);
	
	    
	    //list.stream().collect(Collectors.toMap(Function.identity(), (Function<? sup));
	    
	    
	    
	}

}
