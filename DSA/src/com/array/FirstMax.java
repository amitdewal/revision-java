package com.array;

import java.util.Iterator;

public class FirstMax {

	public static void main(String[] args) {
			
		int max = Integer.MIN_VALUE;
		int [] arr = {81,71,95,36,21,1};
		for (int i = 0; i < arr.length; i++) {
			
			//max = Math.max(max, arr[i]);
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
	System.out.println(max);
	}

}
