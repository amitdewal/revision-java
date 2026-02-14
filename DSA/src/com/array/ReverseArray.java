package com.array;

import java.util.Arrays;

public class ReverseArray {
	public static void reverseArray(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n/2; i++) {
			int j = n-1-i;
			int temp = arr[i];
			arr[i] =  arr[j];
			arr[j] =  temp;
			
		}
		//System.out.println(Arrays.toString(arr));
	}
	
public static void main(String[] args) {
	int arr [] = {60, 50, 10, 40, 34, 30};
	System.out.println(Arrays.toString(arr));
	reverseArray(arr);
	System.out.println(Arrays.toString(arr));
	
}
}
