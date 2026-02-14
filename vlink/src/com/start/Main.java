package com.start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Print subarray with maximum sum in the given array
i/p:  {-3,-4,5,-1,2,-4,6,-1}*/
public class Main {
	
	
	
	public  static void findMaxSubArraySumverionOne(int [] arr) {
		
		
		int maxSum = arr[0];//-3+ 5 = 2  
		int currentMaxSum = arr[0];// 0
		
		for (int i = 0; i < arr.length; i++) {
			
			
			  for (int j = 0; j < arr.length; j++) {
				
				   currentMaxSum += arr[j];
			}
		}
		
		System.out.println(maxSum);
		
	}
	
	
	
	
	
	public static  void  findMaxSubArraySum(int [] arr) {
		/* arr [] = {-3,-4,5,-1,2,-4,6,-1}; */
		
		
			int maxSum = arr[0];//-3+ 5 = 2 
			int currentMaxSum = arr[0];// 2
			
			
			for (int i = 1; i < arr.length; i++) {
																			
				currentMaxSum = Math.max(arr[i], currentMaxSum+arr[i]);
				maxSum = Math.max(currentMaxSum, maxSum);
			}
			
			
			System.out.println(maxSum);
		
	}
	
	
	
	
	
	
	/* find the second max */
	public static void main(String[] args) {
		int arr [] = {-3,-4,5,-1,-2,-4,6,-1};
		
		List<Integer> list = Arrays.asList(-3,-4,5,-1,2,-4,6,-1);
		
		List<Integer> ansList = list.stream()
				                     .sorted(Comparator.reverseOrder())
				                      .limit(2).skip(1)
				                      .collect(Collectors.toList());
	
			//System.out.println(ansList);
		
		findMaxSubArraySum(arr);
	
	}
	
	
	
	/*
	 * Find longest substring without any repeating characters. String
	 * input="abccabcdeesdsaf"// 
	 * output : 
	 */
	
	public String findSubString(String str) {
		List<String> list = new ArrayList<String>();
		
		return "";
	}
	
	
	
	

}
