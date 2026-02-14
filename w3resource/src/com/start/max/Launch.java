package com.start.max;

public class Launch {
	
	public static void main(String[] args) {
		int array[] = {10, 20, 25, 63, 96, 57};
		int n = array.length;
		
		
	    int findSecondMax = findSecondMax(array,n);
	    System.out.println(findSecondMax);
	}

	public static int findSecondMax(int[] arr, int n) {
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			
			for (int j = i+1; j < n; j++) {
				
				smax = Math.max(arr[i], arr[j]);
				max = Math.max(smax, max);
				
				
			}
		}
		
		return smax;
		
	}

}
