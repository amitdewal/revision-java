package com.array;

import java.util.Arrays;

public class CopyOFArray {
public static void main(String[] args) {
	int arr [] = {30,20,10};
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	System.out.println(arr.hashCode());
	int x [] = arr;//shallow copy
	System.out.println(x.hashCode());
	
	int[] copyArr = Arrays.copyOf(arr, arr.length);//deep copy of array
	System.out.println(copyArr.hashCode());
	
	
}
}
