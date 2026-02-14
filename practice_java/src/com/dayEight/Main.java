package com.dayEight;

import java.util.HashMap;

public class Main {
public static void main(String[] args) {
	
	
	HashMap<Integer, String> map = new HashMap<Integer,String>();
	map.put(101, "mango");
	map.put(103, "banana");
	map.put(104, "grape");
	//System.out.println(map.hashCode());
	//System.out.println(map);
	
	map.putIfAbsent(105, "fig");
	System.out.println(map);
	
	HashMap<Integer, String> hm = new HashMap<Integer,String>();
	hm.putAll(map);
	//System.out.println(hm);
	//System.out.println(hm.hashCode());
	System.out.println(hm);
	hm.remove(101);
	System.out.println(hm);
	System.out.println(map);
	
	
}
}
