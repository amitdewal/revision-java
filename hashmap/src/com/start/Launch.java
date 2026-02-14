package com.start;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Launch {
	public static  void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("101", "abc");
		map.put("102", "mno");
		map.put("103", "xyz");
		
		Map<String, String> smap = Collections.synchronizedMap(map);
		
		
		System.out.println(smap);
		
		
		Set<String> set = smap.keySet();
		Iterator<String> itr = set.iterator();
		
		 while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
			smap.remove("102");//ConcurrentModificationException
		}
		 System.out.println(smap);
		
	}

}
