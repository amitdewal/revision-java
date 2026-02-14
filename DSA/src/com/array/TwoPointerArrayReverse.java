package com.array;

import java.util.Arrays;

public class TwoPointerArrayReverse {

	public static void arrayRev(int arr[]) {

		int n = arr.length;
		int start = 0;
		int end = n - 1;
		while (start <= end) {
			swap(arr, start, end);//swapping of array
			start++;
			end--;
		}
	}

//swapping of array element 
	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public static void main(String[] args) {
		int arr [] = {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		arrayRev(arr);
		System.out.println(Arrays.toString(arr));
	}
}
