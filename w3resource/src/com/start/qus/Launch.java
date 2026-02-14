package com.start.qus;

public class Launch {
	
	   
	
	public static void main(String[] args) {
		Integer arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
		int key = 2;
		int start = 0;
		int end = arr.length-1;
		findFirst(arr,arr.length,key,start,end);
	}

	private static void findFirst(Integer[] arr, int length, int key, int start, int end) {
		int res = -1;
		while( end >= start) {
			
			int mid = start + (end-start)/2;
			
			if(arr[mid] > key) {
				end = mid -1;
			}else if(arr[mid]< key) {
				start  = mid+1;
			}
			else {
				res = mid;
				end = mid -1;
			}
			
		}
		
	}

	

}
