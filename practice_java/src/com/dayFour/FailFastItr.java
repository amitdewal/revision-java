package com.dayFour;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastItr {
public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<String,String>();
	//ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String,String>();
	map.put("sachin", "10");
	map.put("dhoni", "7");
	map.put("kohli", "18");
	
	Iterator<String> itr = map.keySet().iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());//reading and writing simultaneously
		map.put("rohit", "45");//java.util.ConcurrentModificationException
		map.remove("kohli");
	}
}
}
/*
 * Exception in thread "main" java.util.ConcurrentModificationException at
 * java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1597) at
 * java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1620) at
 * com.dayFour.FailFastItr.main(FailFastItr.java:18)
 */