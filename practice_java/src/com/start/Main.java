package com.start;

public class Main {
	public static void mergeDesc(int[] nums1, int m, int[] nums2, int n) {
		
		int i = m-1;
		int j = n-1;
		int k = (m+n)-1;
		int [] ans = new int[m+n];
		
		while(i > 0 && j > 0) {
			
			if(nums1[i] < nums2[j]) {
				ans[k] = nums2[j];
				k--;
				j--;
			}else {
				ans[k] = nums1[i];
				k--;
				i--;
			}
		}
		
		if( i == 0) {
			while(j > 0) {
				
					ans[k]= nums2[j];
					k--;
					j--;
				
			}
		}
		
		if( j == 0) {
			while(i > 0) {
				
					ans[k]= nums1[i];
					k--;
					i--;
				
			}
		}
		for(int val : ans){
	        System.out.print (val+" ");
	    }
	}
	
	  public static  void merge(int[] nums1, int m, int[] nums2, int n) {
	        int i =0;
	        int j = 0;
	        int k = 0;
	        int ans [] = new int[m + n];

	        while( i < m && j < n){

	            if( nums1[i] <= nums2[j]){
	                ans[k] = nums1[i];
	                k++;
	                i++;

	            }else{
	                ans[k] =  nums2[j];
	                k++;
	                j++;
	            }
	        }

	        if(i == m){
	            while( j < n){
	                ans[k] = nums2[j];
	                k++;
	                j++;
	            }
	        }

	        if(j == n){
	        	while( i < m) {
                  

                  
	             ans[k] = nums1[i];
	             k++;
	            i++; 
                  
	        	}
	        }
	    
	    for(int val : ans){
	        System.out.println(val);
	    }
	
}
	  public static void main(String[] args) {
		  int[] nums1 = {1, 3, 5, 7};
		  int m = nums1.length;
		  int[] nums2 = {2, 4, 6, 8};
		  int n = nums2.length;
		 // merge(nums1,m,nums2,n);
		  mergeDesc(nums1,m,nums2,n);
		  
		  
	}
}
