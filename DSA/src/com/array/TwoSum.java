package com.array;

public class TwoSum {
	
	public static void twoSumInArray(int arr [],int x) {
		
		int len = arr.length;
		
		for(int i = 0; i < len; i++) {
			
			for(int j = i + 1; j < len; j++){
				
				if(arr[i] +  arr[j] ==  x) {
					
					System.out.println(arr[i]+"  "+arr[j]);
				}
				
			}
		}
		
	}
	
public static void main(String[] args) {
	int arr [] = {3,0,8,5,4,9,2};
	int x = 9;
	twoSumInArray(arr, x);
}
}
