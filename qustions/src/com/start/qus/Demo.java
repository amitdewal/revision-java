package com.start.qus;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo {
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> map = new LinkedHashMap<String,Integer>();
		
				map.put("kohli", 18);
				map.put("sachin", 10);
				map.put("dhoni", 7);
				map.put("rohit", 45);
				
				map.forEach((k,v) -> System.out.println(k+"::"+v));
	}

}
