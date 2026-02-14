package com.start;

import java.util.HashMap;
import java.util.List;

public class Launch {

	public static void main(String[] args) {

		
		char[] resultList = null;;
		//List<Integer> resultList = findUniqueNumber(str);
		System.out.println(resultList );
	}

	public static List<Integer> findUniqueNumber(String str) {

		String[] arr = str.split(" ");
		int n = arr.length;
		/*
		 * for(int i = 0; i < n; i++ ){
		 * 
		 * if() }
		 */
		HashMap<String, Integer> hm = new HashMap<String,Integer>();

		//HashSet<String> set = new HashSet(Arrays.asList(arr));

		//List<Integer> ansList = set.stream().map(s -> s.length()).distinct().collect(Collectors.toList());

		// Stream.of(arr).distinct().collect(Collectors.toGrouping())
		//return ansList;
		
		
		for(String s:arr) {
			//if()
			
		}
		return null;

	}

}
