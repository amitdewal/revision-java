package com.start;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static List<Integer>   getSumfromSubArray(Integer[] nums, Integer key) {
		
		        int n = nums.length;	
		        List<Integer> list = new ArrayList<Integer>();
		        
		        
		        for (int i = 0; i < n; i++) {
					
		        	for (int j = i+1; j < nums.length; j++) {
								if(nums[i] + nums[j] == key) {
									list.add(nums[i]);
									list.add(nums[j]);
									return list;
					}
				}
				}
				return list;
		
		        	
		
	}
	
	
	public static void main(String[] args) {
		Integer nums[] = {2,3,1,2,4,3};      
		int key = 7;
		List<Integer> list = Main.getSumfromSubArray(nums, key);
		System.out.println(list);
		
	}

}
