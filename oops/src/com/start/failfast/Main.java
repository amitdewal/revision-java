package com.start.failfast;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		
		//fail fast iterator
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	    map.put("abc", 1);
	    map.put("mno", 2);
	    map.put("xyz", 3);
	    
	    System.out.println(map);
	    for(Map.Entry<String, Integer> entry : map.entrySet()) {
	    	
	    	
	    	System.out.println(entry.getKey());
	    	map.remove(entry.getKey()); //ConcurrentModificationException
	    }
	    
	    System.out.println(map);
		
		
	}

}
