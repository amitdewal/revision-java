package com.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LaunchTwo {
public static void main(String[] args) {
	int[] arr = {7, 6, 8, 4, 9, 8, 4, 7, 4, 4};;
	HashMap<Integer, Integer> freq = new HashMap<Integer,Integer>();
	ArrayList<Integer> duplcateList = new ArrayList<Integer>();
	//freq.put(0, freq.getOrDefault(freq, null))
	for(int num : arr) {
	freq.put(num, freq.getOrDefault(num, 0)+1);
	}
	
	
	for(Map.Entry<Integer, Integer> entry :freq.entrySet()) {
		if(entry.getValue() > 1) {
			duplcateList.add(entry.getKey());
		}
	}
	System.out.println(freq);
	System.out.println(duplcateList);
	//System.out.println(duplcateList);
	
}
}
