package com.array;

import java.util.Arrays;

public class SortZeroAndOnes {
	
	public static void sortZeroAndOne(int arr[]) {
		int n = arr.length;
		
		int countZero = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i]==0) {
				countZero++;
			}
		}
		
		//overrding zeros
		for(int i = 0; i < countZero; i++) {
			arr[i] = 0;
		}
		//overing ones
		for(int i = countZero; i < n; i++) {
			arr[i] = 1;
		}
	}
	
public static void main(String[] args) {
	int arr [] = {0,1,0,1,0,1,0,1,0,1,1,1,0,0,0};
	System.out.println(Arrays.toString(arr));
	sortZeroAndOne(arr);
	System.out.println(Arrays.toString(arr));
}
}
