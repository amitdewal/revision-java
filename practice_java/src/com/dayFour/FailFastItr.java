package com.dayFour;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastItr {
public static void main(String[] args) {
	//HashMap<String, String> map = new HashMap<String,String>();
	ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String,String>();
	map.put("sachin", "10");
	map.put("dhoni", "7");
	map.put("kohli", "18");
	
	Iterator<String> itr = map.keySet().iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());//reading and writing side by side
		map.put("rohit", "45");//java.util.ConcurrentModificationException
		map.remove("kohli");
		
	}
}
}
