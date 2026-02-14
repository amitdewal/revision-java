package com.array;

public class SecondMax {

	public static void main(String[] args) {
			
		int max = Integer.MIN_VALUE;
		int [] arr = {81,71,95,36,21,1};
		for (int i = 0; i < arr.length; i++) {
			
			//max = Math.max(max, arr[i]);
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int secondMax = Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++) {
			
			//max = Math.max(max, arr[i]);
			
			if(arr[i] != max && arr[i] > secondMax) {
				//secondMax = Math.max(secondMax, arr[i]);
				secondMax = arr[i];
				
			}
		}
	System.out.println(max);
	System.out.println(secondMax);
	}

}
