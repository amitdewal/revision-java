package com.tc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;

//() ->{};

public class Main {
	
	//Given a list of integers, find the 3rd largest in O(n) running time
	// factory design
	//Death By thousand cuts
	//N+1 Select problem
	//load factor
	//eager and lazy loading
	//singleton design pattern
	//factional interface name it
	
	//lamdsss expresion
	//internal working of hashmap
	// 
	
	

	

//rehashing
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,1,3,4,2,5,6,7,6,1);
		
		int arr[] = null;
		//list.stream().sorted(Comparator.reverseOrder())
		//linear
		int firstMax = Integer.MIN_VALUE;//2
		int secondMax = Integer.MIN_VALUE;//1
		int thirdMax = Integer.MIN_VALUE;
		
		HashSet<int[]> hashSet = new HashSet<>(Arrays.asList(arr));
		
		//hashSet.stream().collect()
		for(int i = 0 ; i < list.size(); i++) {
			
			
			if(list.get(i) > firstMax) {//
				thirdMax = secondMax;// -0
				secondMax = firstMax;//1
				firstMax = list.get(i);//2
			}
			
			else if( list.get(i) > secondMax && list.get(i) < firstMax ) {
				
				thirdMax = secondMax;
				secondMax = list.get(i);
			}
			else if(list.get(i) < secondMax) {//
					thirdMax = list.get(i);
			}
			
		}
		
		System.out.println(firstMax);
		System.out.println(secondMax);
		System.out.println(thirdMax);
		
		
		
			
	}

}
