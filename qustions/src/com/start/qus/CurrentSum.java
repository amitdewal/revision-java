package com.start.qus;

public class CurrentSum {
	
	public static int currentSum(int arr []) {
		
		int maxSum = arr[0];
		int currentSum = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			
			currentSum = Math.max(arr[i], arr[i] + currentSum);
			
			maxSum = Math.max(currentSum, maxSum);
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		
		int sum = currentSum(arr);
		System.out.println(sum);
		
		
	}

}
